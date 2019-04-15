package com.example.myapplication1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int a, b ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;

        class Calc{
            int num, res;

            public void execute(String op){
                switch (op){
                    case "+" :
                        res = a+b;
                        break;
/*                    case "minu" :
                        res = num-num;
                        break;
                    case "mul" :
                        res = num*num;
                        break;
                    case "div" :
                        res = num/num;
                        break;
                    case "eq" :
//                        (EditText)findViewById(R.id.num).setText;
                        break;
                    case "reset" :
                        break;*/
                }
            }
            int getNum() {return res;}
            void setNum(int num) {this.num = num;}
        }

        final EditText num = findViewById(R.id.num);
        final Calc c = new Calc();

        findViewById(R.id.plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx, "버튼클릭", Toast.LENGTH_LONG).show();
                a = Integer.parseInt(num.getText().toString());
                num.setText("");


                findViewById(R.id.eq).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b = Integer.parseInt(num.getText().toString());
                        c.execute("+");
                        num.setText(c.getNum()+"");
                    }
                });

            }
        });
        findViewById(R.id.minu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num.getText().toString());
                Calc c = new Calc();
               // c.execute(v);

            }
        });
        findViewById(R.id.mul).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num.getText().toString());
                Calc c = new Calc();
               // c.execute(v);
            }
        });
        findViewById(R.id.div).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num.getText().toString());
                Calc c = new Calc();
                //c.execute(v);
            }
        });
        findViewById(R.id.reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calc c = new Calc();
               // c.execute(v);

            }
        });
    }
}
