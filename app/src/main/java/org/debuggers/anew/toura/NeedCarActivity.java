package org.debuggers.anew.toura;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.anew.toura.R;

public class NeedCarActivity extends AppCompatActivity {
    public ImageView CallButton,SMSbuttn ;
    private  Intent callIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_need_car);
        CallButton =(ImageView) findViewById(R.id.callBtn);
        SMSbuttn  =(ImageView)findViewById(R.id.SmsBtn);
        CallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+8801872604442"));
                if(ContextCompat.checkSelfPermission(NeedCarActivity.this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){



                    ActivityCompat.requestPermissions(NeedCarActivity.this,new String[]{Manifest.permission.CALL_PHONE},0);



                }
                else{
                    startActivity(callIntent);
                }


            }


        });

        SMSbuttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Smsintent = new Intent(Intent.ACTION_VIEW,Uri.fromParts("sms","+8801872604442",null));
                Smsintent.putExtra("Sms_body","I need car ");
                startActivity(Smsintent);
            }
        });



    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case 0:
            {
                if(grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    startActivity(callIntent);
                }
                else
                {
                    ///
                }
            }
        }


    }
}