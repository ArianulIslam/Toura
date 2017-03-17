package org.debuggers.anew.toura;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.anew.toura.R;

public class MainActivity extends AppCompatActivity {
    private static final int MY_PERMISSION_REQUEST_FINE_LOCATION = 101;
    private static final int MY_PERMISSION_REQUEST_COARSE_LOCATION = 102;
    private boolean permissionIsGranted = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }




    public void OpenNeedCarNow(View view){

        Intent i = new Intent(getApplicationContext(),NeedCarActivity.class);
        startActivity(i);

    }

    public void OpenCompassNow(View view){

        Intent i = new Intent(MainActivity.this,CompassActivity.class);
        startActivity(i);

    }
    public void OpenShopNow(View view){

        Intent i = new Intent(getApplicationContext(),ShopNowActivity.class);
        startActivity(i);

    }
    public void OpenSpeedMeterNow(View view){

        Intent i = new Intent(getApplicationContext(),SpeedMeterActivity.class);
        startActivity(i);

    }
    public void OpenCalculatorNow(View view){

        Intent p = new Intent(MainActivity.this,CalculatorActivity.class);
        startActivity(p);

    }
    public void OpenEmergencyNow(View view){

        Intent l = new Intent(getApplicationContext(),EmergencyActivity.class);
        startActivity(l);

    }
    public void OpenPlaceDetailsNow(View view){

        Intent i = new Intent(getApplicationContext(),PlaceDetailsActivity.class);
        startActivity(i);

    }
    public void OpenTreatmentNow(View view){
        Intent i = new Intent(getApplicationContext(),PrimaryTreamentAcitvity.class);
        startActivity(i);

    }
    public  void OpenTourSongNow(View view){

        Intent i = new Intent(getApplicationContext(),TourSongLyrics.class);
        startActivity(i);
    }
    public void OpenTruthandDare(View view){
        Intent i = new Intent(getApplicationContext(),MapsActivity.class);
        startActivity(i);
    }

}
