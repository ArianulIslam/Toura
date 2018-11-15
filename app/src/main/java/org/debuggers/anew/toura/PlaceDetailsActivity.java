package org.debuggers.anew.toura;

import android.content.Intent;
import android.graphics.Color;
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

public class PlaceDetailsActivity extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    ArrayList<String > arrayListplaceName;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_details);

        lv = (ListView) findViewById(R.id.listviewplacename);

        arrayListplaceName = new ArrayList<>();
        arrayListplaceName.addAll(Arrays.asList(getResources().getStringArray(R.array.Placenames)));
        adapter = new ArrayAdapter<String>(PlaceDetailsActivity.this,android.R.layout.simple_list_item_1,arrayListplaceName);
      //  lv.setBackgroundColor(Color.RED);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int pos = position;

                if(pos==0){

                    Intent i = new Intent(view.getContext(),ALiSurong1.class);
                    startActivityForResult(i,0);



                }else if (pos==1){
                    Intent i = new Intent(view.getContext(),AlurtilaPlace2.class);
                    startActivityForResult(i,1);


                }
                else if (pos==2){
                    Intent i = new Intent(view.getContext(),BogaLakePlace3.class);
                    startActivityForResult(i,2);


                }
                else if (pos==3){
                    Intent i = new Intent(view.getContext(),BandorBonPlace4.class);
                    startActivityForResult(i,3);


                }
                else if (pos==4){
                    Intent i = new Intent(view.getContext(),Bichanakandi.class);
                    startActivityForResult(i,4);


                }
                else if (pos==5){

                    Intent i = new Intent(view.getContext(),BahularBasor8.class);
                    startActivityForResult(i,5);


                }
                else if (pos==6){
                    Intent i = new Intent(view.getContext(),BotanikalGardenPlace9.class);
                    startActivityForResult(i,6);


                }
                else if (pos==7){

                    Intent i = new Intent(view.getContext(),VolaGonj10.class);
                    startActivityForResult(i,7);


                }
                else if (pos==8){
                    Intent i = new Intent(view.getContext(),ComillaPlace11.class);
                    startActivityForResult(i,8);

                }
                else if (pos==9){
                    Intent i = new Intent(view.getContext(), CoxsBazarPlace12.class);
                    startActivityForResult(i,9);
                }
                else if (pos==10){
                    Intent i = new Intent(view.getContext(),ChandronathPaharpLace13.class);
                    startActivityForResult(i,10);

                }else if (pos==11){
                    Intent i = new Intent(view.getContext(),cholonbill14.class);
                    startActivityForResult(i,11);

                }
                else if (pos==12){
                    Intent i = new Intent(view.getContext(),DibirHowar.class);
                    startActivityForResult(i,12);

                }
                else if (pos==13){
                    Intent i = new Intent(view.getContext(),DublarChorPlace16.class);
                    startActivityForResult(i,13);

                }
                else if (pos==14){
                    Intent i = new Intent(view.getContext(),FoyezLacke17.class);
                    startActivityForResult(i,14);

                }
                else if (pos==15){
                    Intent i = new Intent(view.getContext(),Jaflong.class);
                    startActivityForResult(i,15);

                }
                else if (pos==16){
                    Intent i = new Intent(view.getContext(),HazratShahajalaMazar19.class);
                    startActivityForResult(i,16);

                }
                else if (pos==17){
                    Intent i = new Intent(view.getContext(),HazaratShahPoranMazar20.class);
                    startActivityForResult(i,17);

                }
                else if (pos==18){
                    Intent i = new Intent(view.getContext(),HamHam.class);
                    startActivityForResult(i,18);

                }
                else if (pos==19){
                    Intent i = new Intent(view.getContext(),Kuwakata.class);
                    startActivityForResult(i,19);

                }
                else if (pos==20){
                    Intent i = new Intent(view.getContext(),KeokradhongPlace24.class);
                    startActivityForResult(i,20);

                }
                else if (pos==21){
                    Intent i = new Intent(view.getContext(),KoromJolplace25.class);
                    startActivityForResult(i,21);

                }
                else if (pos==22){
                    Intent i = new Intent(view.getContext(),LalbagkEllaPlace27.class);
                    startActivityForResult(i,22);

                }
                else if (pos==23){
                    Intent i = new Intent(view.getContext(),LokkhonChora.class);
                    startActivityForResult(i,23);

                }
                else if (pos==24){
                    Intent i = new Intent(view.getContext(),NijhumDwipPlace31.class);
                    startActivityForResult(i,24);

                }
                else if (pos==25){
                    Intent i = new Intent(view.getContext(),NilgiriPlace33.class);
                    startActivityForResult(i,25);

                }
                else if (pos==26){
                    Intent i = new Intent(view.getContext(),Amiakhum.class);
                    startActivityForResult(i,26);

                }
                else if (pos==27){
                    Intent i = new Intent(view.getContext(),MonpuraPlace36.class);
                    startActivityForResult(i,27);

                }
                else if (pos==28){
                    Intent i = new Intent(view.getContext(),MohaistanGorplace37.class);
                    startActivityForResult(i,28);

                }
                else if (pos==29){
                    Intent i = new Intent(view.getContext(),MadobkundoJorna.class);
                    startActivityForResult(i,29);

                }
                else if (pos==30){
                    Intent i = new Intent(view.getContext(),Milonchori39.class);
                    startActivityForResult(i,30);

                }
                else if (pos==31){
                    Intent i = new Intent(view.getContext(),PotengaPlace.class);
                    startActivityForResult(i,31);

                }
                else if (pos==32){
                    Intent i = new Intent(view.getContext(),Pantumai.class);
                    startActivityForResult(i,32);

                }
                else if (pos==33){
                    Intent i = new Intent(view.getContext(),RangaMatiPlace.class);
                    startActivityForResult(i,33);

                }
                else if (pos==34){
                    Intent i = new Intent(view.getContext(),RaterGul.class);
                    startActivityForResult(i,34);

                }
                else if (pos==35){
                    Intent i = new Intent(view.getContext(),RayerBazarPlace45.class);
                    startActivityForResult(i,35);

                }
                else if (pos==36){
                    Intent i = new Intent(view.getContext(),Sylhet.class);
                    startActivityForResult(i,36);

                }
                else if (pos==37){
                    Intent i = new Intent(view.getContext(),goldentTemple47.class);
                    startActivityForResult(i,37);

                }
                else if (pos==38){
                    Intent i = new Intent(view.getContext(),SajekVallay48.class);
                    startActivityForResult(i,38);

                }
                else if (pos==39){
                    Intent i = new Intent(view.getContext(),ShitakundoPlace49.class);
                    startActivityForResult(i,39);

                }
                else if (pos==40){
                    Intent i = new Intent(view.getContext(),SonarGaoPlace50.class);
                    startActivityForResult(i,40);

                }
                else if (pos==41){
                    Intent i = new Intent(view.getContext(),shatGombujMosjid51.class);
                    startActivityForResult(i,41);

                }
                else if (pos==42){
                    Intent i = new Intent(view.getContext(),SongramPunjZorna.class);
                    startActivityForResult(i,42);

                }
                else if (pos==43){
                    Intent i = new Intent(view.getContext(),SunamGonj.class);
                    startActivityForResult(i,43);

                }
                else if (pos==44){
                    Intent i = new Intent(view.getContext(),SaintMartin.class);
                    startActivityForResult(i,44);

                }
                else if (pos==45){
                    Intent i = new Intent(view.getContext(),SundorBanPlace.class);
                    startActivityForResult(i,45);

                }
                else if (pos==46){
                    Intent i = new Intent(view.getContext(),Uttomchora.class);
                    startActivityForResult(i,46);

                }
                else if (pos==47){
                    Intent i = new Intent(view.getContext(),AhshanManjilPlace0.class);
                    startActivityForResult(i,47);

                }
                else if (pos==48){
                    Intent i = new Intent(view.getContext(),JaudpaiJorna.class);
                    startActivityForResult(i,48);

                }
                else if(pos==49){
                    Intent i = new Intent(view.getContext(),Nilacholplace34.class);
                    startActivityForResult(i,49);
                }
                else if(pos==50){
                    Intent i = new Intent(view.getContext(),MoinotGhat.class);
                    startActivityForResult(i,50);
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
