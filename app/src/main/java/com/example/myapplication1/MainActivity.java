package com.example.myapplication1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;

        class Calc{
            int num, res;
            String op;
            public void execute(){
                switch (op){
                    case "plus" :
                        break;
                    case "minu" :
                        break;
                    case "mul" :
                        break;
                    case "div" :
                        break;
                }
            }
            int getNum() {return num;}
            void setNum() {this.num = num;}
        }

        final EditText num2 = findViewById(R.id.num2);
        final TextView result = findViewById(R.id.result);

        findViewById(R.id.plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int2 = Integer.parseInt(num2.getText().toString());
                Calc c = new Calc();

                this.res = "";
            }
        });
        findViewById(R.id.minu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num1.getText().toString());
                int int2 = Integer.parseInt(num2.getText().toString());
                this.res = "";
            }
        });
        findViewById(R.id.mul).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num1.getText().toString());
                int int2 = Integer.parseInt(num2.getText().toString());
                this.res = "";
            }
        });
        findViewById(R.id.div).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num1.getText().toString());
                int int2 = Integer.parseInt(num2.getText().toString());
                this.res = "";
            }
        });

        findViewById(R.id.eq).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
            }
        });
        findViewById(R.id.reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
