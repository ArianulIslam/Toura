package org.debuggers.anew.toura;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.multidex.MultiDex;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.anew.toura.R;

import java.net.URI;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
    private static final int MY_PERMISSION_REQUEST_FINE_LOCATION = 101;
    private static final int MY_PERMISSION_REQUEST_COARSE_LOCATION = 102;
    private boolean permissionIsGranted = false;
    public Button shopbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shopbtn = (Button)findViewById(R.id.button2);
        shopbtn.setTextColor(Color.RED);

    }

    public boolean isConnected(Context context) {

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netinfo = cm.getActiveNetworkInfo();

        if (netinfo != null && netinfo.isConnectedOrConnecting()) {
            android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo mobile = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

            if((mobile != null&& mobile.isConnectedOrConnecting()) || (wifi != null && wifi.isConnectedOrConnecting())) return true;
            else return false;
        } else
            return false;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Random r = new Random();

        int n = r.nextInt(10);
        if(n==6) {
            if (isConnected(MainActivity.this)) {

                Toast.makeText(MainActivity.this,"Please Rate Our App 5 Star",Toast.LENGTH_LONG).show();
                try {
                    Uri uril = Uri.parse("market://details?id=" + getPackageName());
                    Intent gotomarket = new Intent(Intent.ACTION_VIEW, uril);
                    startActivity(gotomarket);
                } catch (ActivityNotFoundException e) {

                    Uri uril = Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName());
                    Intent gotomarket = new Intent(Intent.ACTION_VIEW, uril);
                    startActivity(gotomarket);
                }

            }
        }else if (n==5)
        {
            if (isConnected(MainActivity.this)) {

                Toast.makeText(MainActivity.this,"Please Rate Our App",Toast.LENGTH_LONG).show();
                try {
                    Uri uril = Uri.parse("market://details?id=" + getPackageName());
                    Intent gotomarket = new Intent(Intent.ACTION_VIEW, uril);
                    startActivity(gotomarket);
                } catch (ActivityNotFoundException e) {

                    Uri uril = Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName());
                    Intent gotomarket = new Intent(Intent.ACTION_VIEW, uril);
                    startActivity(gotomarket);
                }

            }
        }

    }


    @Override
    protected void attachBaseContext(Context base)
    {
        super.attachBaseContext(base);
        MultiDex.install(this);
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
        Intent i = new Intent(getApplicationContext(),AllTransport.class);
        startActivity(i);
    }

}
