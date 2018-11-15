package org.debuggers.anew.toura;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import com.example.anew.toura.R;

public class CompassActivity extends AppCompatActivity implements SensorEventListener {

    private ImageView imageview;
    private float [] mGravity = new float [3];
    private float [] mGeomagnetic = new float [3];
    private  float azimutch = 0f;
    private  float currentAzimuth = 0f;
    private SensorManager mSensorManger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compass);

        imageview = (ImageView)findViewById(R.id.compass);
        mSensorManger = (SensorManager)getSystemService(SENSOR_SERVICE);
        imageview.animate().rotation(1280).setDuration(2000);

    }

    @Override
    protected void onResume(){

        super.onResume();
        mSensorManger.registerListener(this, mSensorManger.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD),
                SensorManager.SENSOR_DELAY_GAME);
        mSensorManger.registerListener(this,mSensorManger.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                SensorManager.SENSOR_DELAY_GAME);

    }

    @Override
    protected void onPause() {
        super.onPause();
        mSensorManger.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        final float alpha = 0.97f;
        synchronized (this){
            if(sensorEvent.sensor.getType()== Sensor.TYPE_ACCELEROMETER){

                mGravity [0] = alpha *mGravity [0] + (1-alpha)*sensorEvent.values[0];
                mGravity [1] = alpha *mGravity [1] + (1-alpha)*sensorEvent.values[1];
                mGravity [2] = alpha *mGravity [2] + (1-alpha)*sensorEvent.values[2];

            }

        }
        if(sensorEvent.sensor.getType()== Sensor.TYPE_MAGNETIC_FIELD){

            mGeomagnetic [0] = alpha *mGeomagnetic [0] + (1-alpha)*sensorEvent.values[0];
            mGeomagnetic [1] = alpha *mGeomagnetic [1] + (1-alpha)*sensorEvent.values[1];
            mGeomagnetic [2] = alpha *mGeomagnetic [2] + (1-alpha)*sensorEvent.values[2];

        }

        float R[] = new float[9];
        float I[] =  new float [9];

        boolean succes = SensorManager.getRotationMatrix(R,I,mGravity,mGeomagnetic);
        if(succes){

            float orientation [] = new float [3];
            SensorManager.getOrientation(R,orientation);
            azimutch =(float) Math.toDegrees(orientation[0]);
            azimutch = (azimutch+360+200)%360;
            Animation anim = new RotateAnimation(-currentAzimuth,-azimutch,
                    Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
            currentAzimuth =azimutch;
            anim.setDuration(500);
            anim.setRepeatCount(0);
            anim.setFillAfter(true);

            imageview.startAnimation(anim);

        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
