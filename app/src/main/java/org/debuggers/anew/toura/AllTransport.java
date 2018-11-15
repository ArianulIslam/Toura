package org.debuggers.anew.toura;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.anew.toura.R;

import java.util.ArrayList;
import java.util.Arrays;

public class AllTransport extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    ArrayList<String > arrayListplaceName;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alltransport_activity);

        lv = (ListView) findViewById(R.id.listviewplacename);

        arrayListplaceName = new ArrayList<>();
        arrayListplaceName.addAll(Arrays.asList(getResources().getStringArray(R.array.BusTrains)));
        adapter = new ArrayAdapter<String>(AllTransport.this,android.R.layout.simple_list_item_1,arrayListplaceName);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int pos = position;

                if(pos==0){

                    Intent i = new Intent(view.getContext(),BusInfoActivity.class);
                    startActivityForResult(i,0);



                }else if (pos==1){
                    Intent i = new Intent(view.getContext(),TrainActivity.class);
                    startActivityForResult(i,1);
                }












































            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search, menu);
        MenuItem item = menu.findItem(R.id.menuSearch);
        android.widget.SearchView searchView = (android.widget.SearchView)item.getActionView();

        searchView.setOnQueryTextListener(new android.widget.SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);

                return false;
            }
        });


        return super.onCreateOptionsMenu(menu);
    }
}
