package com.example.trialdays3;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Polisi extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listPolisi = new String[] {"Polsek Pekanbaru Kota", "Polsek Payung Sekaki", "Polsek Tenayan Raya", "Polsek Tampan"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,listPolisi));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Polsek Pekanbaru Kota")){
                a = new Intent(this, PPekanbaruKota.class);


            } else if (pilihan.equals("Polsek Payung Sekaki")) {
                a = new Intent(this, PPayungSekaki.class);

            } else if (pilihan.equals("Polsek Tenayan Raya")) {
                a = new Intent(this, PTenayanRaya.class);

            } else if (pilihan.equals("Polsek Tampan")) {
                a = new Intent(this, PTampan.class);

            }

            startActivity(a);


        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
