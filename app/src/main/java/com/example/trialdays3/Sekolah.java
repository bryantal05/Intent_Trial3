package com.example.trialdays3;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Sekolah extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listSekolah = new String[] {"SMA Negeri 5 Pekanbaru", "SMA Negeri 1 Pekabaru", "SMA Negeri 9 Pekabaru", "SMA Negeri 10 Pekanbaru"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,listSekolah));
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
            if (pilihan.equals("SMA Negeri 5 Pekanbaru")){
                a = new Intent(this, SMA5.class);


            } else if (pilihan.equals("SMA Negeri 1 Pekabaru")) {
                a = new Intent(this, SMA1.class);

            } else if (pilihan.equals("SMA Negeri 9 Pekabaru")) {
                a = new Intent(this, SMA9.class);

            } else if (pilihan.equals("SMA Negeri 10 Pekanbaru")) {
                a = new Intent(this, SMA10.class);

            }

            startActivity(a);


        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
