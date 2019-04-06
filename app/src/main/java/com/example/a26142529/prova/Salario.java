    package com.example.a26142529.prova;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

    public class Salario extends AppCompatActivity {

    private TextInputEditText salario;
    private RadioGroup percentual;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salario);

        salario = findViewById(R.id.salario);
        percentual = findViewById(R.id.rg);
        result = findViewById(R.id.resultado);

    }

    public void calcular (View v){
        double S = Double.parseDouble(salario.getText().toString());
        int radio = percentual.getCheckedRadioButtonId();

        if (radio == R.id.r4){
            double r = (S *0.4) + S;
            String r2 = "Seu novo salário é R$" + r;
            result.setText(r2);

        }   else if (radio == R.id.r45){
            double r = (S *0.45) + S;
            String r2 = "Seu novo salário é R$" + r ;
            result.setText(r2);
        }   else if (radio == R.id.r5){
            double r = (S * 0.5) + S;
            String r2 = "Seu novo salário é R$" + r ;
            result.setText(r2);
        }


    }








}
