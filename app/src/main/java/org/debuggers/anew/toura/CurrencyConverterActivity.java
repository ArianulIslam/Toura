package org.debuggers.anew.toura;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.anew.toura.R;

public class CurrencyConverterActivity extends AppCompatActivity {



    private Button ConvertBtn;
    private EditText currencyFeild;
    private  Spinner myspinner;
     double bdttoUSD=	80.0731;
      double usdtoBd = 0.01249;
    double bdtEur = 84.7767;
    double EurBDt= 0.01180;
    double bdtGBP = 97.9993;
    double GBPBdt = 0.01020;
    double BDTINR=0.83248;
    double INRBDT=1.20124;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);

          myspinner = (Spinner)findViewById(R.id.ConverterSpinner);
          ConvertBtn= (Button)findViewById(R.id.ConvertBtn);
          currencyFeild = (EditText)findViewById(R.id.CurrencyFeild);

          arrayAdapter = new ArrayAdapter<String>(CurrencyConverterActivity.this,
          android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(arrayAdapter);



    }

    public void ConvertBUTTON(View view){

        if(currencyFeild.getText().toString().equals("")){
            Toast.makeText(CurrencyConverterActivity.this,"Please Enter Amount",Toast.LENGTH_SHORT).show();
        }else {


            int bdtusd = myspinner.getSelectedItemPosition();

            if (bdtusd == 0) {

                double result = Double.parseDouble(currencyFeild.getText().toString()) * usdtoBd;
                Toast.makeText(CurrencyConverterActivity.this, result + " USD", Toast.LENGTH_LONG).show();
            } else if (bdtusd == 1) {

                double result = Double.parseDouble(currencyFeild.getText().toString()) * EurBDt;
                Toast.makeText(CurrencyConverterActivity.this, result + " EUR", Toast.LENGTH_LONG).show();
            } else if (bdtusd == 2) {

                double result = Double.parseDouble(currencyFeild.getText().toString()) * BDTINR;
                Toast.makeText(CurrencyConverterActivity.this, result + " INR", Toast.LENGTH_LONG).show();
            } else if (bdtusd == 3) {

                double result = Double.parseDouble(currencyFeild.getText().toString()) * GBPBdt;
                Toast.makeText(CurrencyConverterActivity.this, result + " GBP", Toast.LENGTH_LONG).show();
            } else if (bdtusd == 4) {

                double result = Double.parseDouble(currencyFeild.getText().toString()) * bdttoUSD;
                Toast.makeText(CurrencyConverterActivity.this, result + " BDT", Toast.LENGTH_LONG).show();
            } else if (bdtusd == 5) {

                double result = Double.parseDouble(currencyFeild.getText().toString()) * bdtGBP;
                Toast.makeText(CurrencyConverterActivity.this, result + " BDT", Toast.LENGTH_LONG).show();
            } else if (bdtusd == 6) {

                double result = Double.parseDouble(currencyFeild.getText().toString()) * INRBDT;
                Toast.makeText(CurrencyConverterActivity.this, result + " BDT", Toast.LENGTH_LONG).show();
            } else if (bdtusd == 7) {

                double result = Double.parseDouble(currencyFeild.getText().toString()) * bdtEur;
                Toast.makeText(CurrencyConverterActivity.this, result + " BDT", Toast.LENGTH_LONG).show();
            }
        }

    }


}
