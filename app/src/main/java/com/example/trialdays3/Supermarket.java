package com.example.trialdays3;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Supermarket extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listSupermarket = new String[] {"Planet Swalayan Marpoyan", "Toko Rizky", "Pasar Buah Pekanbaru", "Hypermart Ciputra Pekanbaru"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,listSupermarket));
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
            if (pilihan.equals("Planet Swalayan Marpoyan")){
                a = new Intent(this, SPlanet.class);


            } else if (pilihan.equals("Toko Rizky")) {
                a = new Intent(this, SToko.class);

            } else if (pilihan.equals("Pasar Buah Pekanbaru")) {
                a = new Intent(this, SPasarBuah.class);

            } else if (pilihan.equals("Hypermart Ciputra Pekanbaru")) {
                a = new Intent(this, SHypermart.class);

            }

            startActivity(a);


        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
