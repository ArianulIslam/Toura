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

public class PrimaryTreamentAcitvity extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    ArrayList<String > arrayListplaceName;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary_treatment);

        lv = (ListView) findViewById(R.id.listviewtreatment);

        arrayListplaceName = new ArrayList<>();
        arrayListplaceName.addAll(Arrays.asList(getResources().getStringArray(R.array.PramaryTreatment)));
        adapter = new ArrayAdapter<String>(PrimaryTreamentAcitvity.this,android.R.layout.simple_list_item_1,arrayListplaceName);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    int pos = position;

                if(pos==0){

                    Intent i = new Intent(view.getContext(),tourElementTreatment.class);
                   startActivityForResult(i,0);


                }else if (pos==1){
                    Intent i = new Intent(view.getContext(),PaniteDubeGele.class);
                    startActivityForResult(i,1);


                }
                else if (pos==2){
                    Intent i = new Intent(view.getContext(),ShapkaumurDele.class);
                    startActivityForResult(i,2);


                }
                else if (pos==3){
                    Intent i = new Intent(view.getContext(),JokeKamurdele.class);
                    startActivityForResult(i,3);


                }
                else if (pos==4){
                    Intent i = new Intent(view.getContext(),KuttaKamurDele.class);
                    startActivityForResult(i,4);


                }
                else if (pos==5){

                    Intent i = new Intent(view.getContext(),PetBethaKorle.class);
                    startActivityForResult(i,5);


                }
                else if (pos==6){
                    Intent i = new Intent(view.getContext(),HatpabengeMochkaiagele.class);
                    startActivityForResult(i,0);


                }
                else if (pos==7){

                    Intent i = new Intent(view.getContext(),MathaBetha.class);
                    startActivityForResult(i,0);


                }
                else if (pos==8){
                    Intent i = new Intent(view.getContext(),ChorabalitePorle.class);
                    startActivityForResult(i,0);

                }
                else if (pos==9){
                    Intent i = new Intent(view.getContext(), AgunLagle.class);
                    startActivityForResult(i,0);
                }
                else if (pos==10){
                    Intent i = new Intent(view.getContext(),hatpaketegele.class);
                    startActivityForResult(i,0);

                }else if (pos==11){
                    Intent i = new Intent(view.getContext(),ElectricShortKhaile.class);
                    startActivityForResult(i,0);

                }
                else if (pos==12){
                    Intent i = new Intent(view.getContext(),HearAttackActivity.class);
                    startActivityForResult(i,0);

                }
                else if (pos==13){
                    Intent i = new Intent(view.getContext(),ShaproshadProblem.class);
                    startActivityForResult(i,0);

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
