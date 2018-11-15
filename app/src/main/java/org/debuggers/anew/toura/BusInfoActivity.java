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

public class BusInfoActivity extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    ArrayList<String > arrayListplaceName;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitybusinfo);

        lv = (ListView) findViewById(R.id.listviewplacename);

        arrayListplaceName = new ArrayList<>();
        arrayListplaceName.addAll(Arrays.asList(getResources().getStringArray(R.array.BusCompanyName)));
        adapter = new ArrayAdapter<String>(BusInfoActivity.this,android.R.layout.simple_list_item_1,arrayListplaceName);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int pos = position;

                if(pos==0){

                    Intent i = new Intent(view.getContext(),GreenLineBus.class);
                    startActivityForResult(i,0);



                }else if (pos==1){
                    Intent i = new Intent(view.getContext(),SAlamService.class);
                    startActivityForResult(i,1);
                }
                else if (pos==2){
                    Intent i = new Intent(view.getContext(),ShamoliService.class);
                    startActivityForResult(i,2);
                }
                else if (pos==3){
                    Intent i = new Intent(view.getContext(),SAPAribaihan.class);
                    startActivityForResult(i,3);
                }
                else if (pos==4){
                    Intent i = new Intent(view.getContext(),SakuraParibahan.class);
                    startActivityForResult(i,4);
                }
                else if (pos==5){
                    Intent i = new Intent(view.getContext(), SungondaParibahan.class);
                    startActivityForResult(i,5);
                }
                else if (pos==6){
                    Intent i = new Intent(view.getContext(), Skyline.class);
                    startActivityForResult(i,6);
                }
                else if (pos==7){
                    Intent i = new Intent(view.getContext(),HanifEnterPrise.class);
                    startActivityForResult(i,7);
                }
                else if (pos==8){
                    Intent i = new Intent(view.getContext(),SungondaParibahan.class);
                    startActivityForResult(i,8);
                }
                else if (pos==9){
                    Intent i = new Intent(view.getContext(), EnaPariable.class);
                    startActivityForResult(i,9);
                }
                else if (pos==10){
                    Intent i = new Intent(view.getContext(), shohagParibahan.class);
                    startActivityForResult(i,10);
                }
                else if (pos==11){
                    Intent i = new Intent(view.getContext(), SoudiaParibahan.class);
                    startActivityForResult(i,11);
                }
                else if (pos==12){
                    Intent i = new Intent(view.getContext(), EagleParibhan.class);
                    startActivityForResult(i,12);
                }
                else if (pos==13){
                    Intent i = new Intent(view.getContext(), GrameenPharibahn.class);
                    startActivityForResult(i,13);
                }
                else if (pos==14){
                    Intent i = new Intent(view.getContext(),TrTravels.class);
                    startActivityForResult(i,14);
                }
                else if (pos==15){
                    Intent i = new Intent(view.getContext(),SpGoldentpariBhahan.class);
                    startActivityForResult(i,15);
                }
                else if (pos==16){
                    Intent i = new Intent(view.getContext(),UltraModernParibahan.class);
                    startActivityForResult(i,16);
                }
                else if (pos==17){
                    Intent i = new Intent(view.getContext(), ModernEnterPrise.class);
                    startActivityForResult(i,17);
                }
                else if (pos==18){
                    Intent i = new Intent(view.getContext(), ShaAliFatehAliParibhan.class);
                    startActivityForResult(i,18);
                }
                else if (pos==19){
                    Intent i = new Intent(view.getContext(), Nabilparibahan.class);
                    startActivityForResult(i,19);
                }
                else if (pos==20){
                    Intent i = new Intent(view.getContext(), almuburakparibhan.class);
                    startActivityForResult(i,20);
                }
                else if (pos==21){
                    Intent i = new Intent(view.getContext(), unitedParibahan.class);
                    startActivityForResult(i,21);
                }
                else if (pos==22){
                    Intent i = new Intent(view.getContext(),parjatakParibahan.class);
                    startActivityForResult(i,22);
                }
                else if (pos==23){
                    Intent i = new Intent(view.getContext(), AkTravels.class);
                    startActivityForResult(i,23);
                }
                else if (pos==24){
                    Intent i = new Intent(view.getContext(),KuwakatExpress.class);
                    startActivityForResult(i,24);
                }
                else if (pos==25){
                    Intent i = new Intent(view.getContext(), DreamLine.class);
                    startActivityForResult(i,25);
                }
                else if (pos==26){
                    Intent i = new Intent(view.getContext(),keyaParibon.class);
                    startActivityForResult(i,26);
                }
                else if (pos==27){
                    Intent i = new Intent(view.getContext(),NislamAcitvity.class);
                    startActivityForResult(i,27);
                }
                else if (pos==28){
                    Intent i = new Intent(view.getContext(),MamunEnterPrise.class);
                    startActivityForResult(i,28);
                }
                else if (pos==29){
                    Intent i = new Intent(view.getContext(),DeshTravels.class);
                    startActivityForResult(i,29);
                }
                else if (pos==30){
                    Intent i = new Intent(view.getContext(),AsiaExpress.class);
                    startActivityForResult(i,30);
                }
                else if (pos==31){
                    Intent i = new Intent(view.getContext(),Dhaka.class);
                    startActivityForResult(i,31);
                }
                else if (pos==32){
                    Intent i = new Intent(view.getContext(), AkotaExpress.class);
                    startActivityForResult(i,32);
                }
                else if (pos==33){
                    Intent i = new Intent(view.getContext(),KharnupholiPharabon.class);
                    startActivityForResult(i,33);
                }
                else if (pos==34){
                    Intent i = new Intent(view.getContext(), ShebaPari.class);
                    startActivityForResult(i,34);
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
