package com.example.tax;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText a1, resul;
    Button b;
    double Sal,s, res1, res2,res3, res4,res5,res6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1=(EditText) findViewById(R.id.Salarytext);
        resul=(EditText) findViewById(R.id.result);
        b=(Button) findViewById(R.id.buttona);

        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String salary=a1.getText().toString();
                Sal=Double.parseDouble(salary);
                s=Sal*12;

                if(s<200000){
                    res1=s*0.01;
                    String fin=Double.toString(res1);
                    resul.setText(fin);
                }
                else if(s>=200000 && s<=350000){
                    res1=s*0.01;
                    res2=s-200000;
                    res3=(res2*0.15)+2000;
                    String fin=Double.toString(res3);
                    resul.setText(fin);
                }
                else if(s>350000){
                    res4=s-350000;
                    res5=(res4*0.25)+24500;
                    String fin=Double.toString(res5);
                    resul.setText(fin);
                }
    }
});
    }
}
