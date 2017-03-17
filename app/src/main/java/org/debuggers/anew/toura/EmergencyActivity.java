package org.debuggers.anew.toura;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.anew.toura.R;

public class EmergencyActivity extends AppCompatActivity {
    private  Intent callIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        ImageButton police = (ImageButton)findViewById(R.id.TouriestPoliceBtn);
        ImageButton Ambulance = (ImageButton)findViewById(R.id.AmbulanceBtn);
        ImageButton BloodBank = (ImageButton)findViewById(R.id.BloodBankBtn);
        ImageButton  FireService = (ImageButton)findViewById(R.id.fireServicebtn);
        ImageButton helpline = (ImageButton)findViewById(R.id.HelplineBtn);

        police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+8801769690740"));
                if(ContextCompat.checkSelfPermission(EmergencyActivity.this, android.Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){



                    ActivityCompat.requestPermissions(EmergencyActivity.this,new String[]{android.Manifest.permission.CALL_PHONE},0);



                }
                else{
                    startActivity(callIntent);
                }


            }


        });
        Ambulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+88016263"));
                if(ContextCompat.checkSelfPermission(EmergencyActivity.this, android.Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){



                    ActivityCompat.requestPermissions(EmergencyActivity.this,new String[]{android.Manifest.permission.CALL_PHONE},0);



                }
                else{
                    startActivity(callIntent);
                }


            }


        });
        BloodBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+8801714010869"));
                if(ContextCompat.checkSelfPermission(EmergencyActivity.this, android.Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){



                    ActivityCompat.requestPermissions(EmergencyActivity.this,new String[]{android.Manifest.permission.CALL_PHONE},0);



                }
                else{
                    startActivity(callIntent);
                }


            }


        });
        helpline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+880999"));
                if(ContextCompat.checkSelfPermission(EmergencyActivity.this, android.Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){



                    ActivityCompat.requestPermissions(EmergencyActivity.this,new String[]{android.Manifest.permission.CALL_PHONE},0);



                }
                else{
                    startActivity(callIntent);
                }


            }


        });
        FireService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+8801730336699"));
                if(ContextCompat.checkSelfPermission(EmergencyActivity.this, android.Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){



                    ActivityCompat.requestPermissions(EmergencyActivity.this,new String[]{android.Manifest.permission.CALL_PHONE},0);



                }
                else{
                    startActivity(callIntent);
                }


            }


        });

    }
}
