package com.example.myapplication1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
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

        final TextView num = findViewById(R.id.text_result);

/*============================================Number==============================================*/
        findViewById(R.id.button_0).setOnClickListener((v)->{
            a = 0;
            num.setText(a);
        });
        findViewById(R.id.button_1).setOnClickListener((v)->{
            a = 1;
            num.setText(a);
        });
        findViewById(R.id.button_2).setOnClickListener((v)->{
            a = 2;
            num.setText(a);
        });
        findViewById(R.id.button_3).setOnClickListener((v)->{
            a = 3;
            num.setText(a);
        });
        findViewById(R.id.button_4).setOnClickListener((v)->{
            a = 4;
            num.setText(a);
        });
        findViewById(R.id.button_5).setOnClickListener((v)->{
            a = 5;
            num.setText(a);
        });
        findViewById(R.id.button_6).setOnClickListener((v)->{
            a = 6;
            num.setText(a);
        });
        findViewById(R.id.button_7).setOnClickListener((v)->{
            a = 7;
            num.setText(a);
        });
        findViewById(R.id.button_8).setOnClickListener((v)->{
            a = 8;
            num.setText(a);
        });
        findViewById(R.id.button_9).setOnClickListener((v)->{
            a = 9;
            num.setText(a);
        });
/*===============================================OP===============================================*/
        final Calc c = new Calc();
        findViewById(R.id.button_plus).setOnClickListener((v)->{
                Toast.makeText(ctx, "버튼클릭", Toast.LENGTH_LONG).show();
                num.setText("");
                findViewById(R.id.button_equal).setOnClickListener((a)->{
                        b = Integer.parseInt(num.getText().toString());
                        c.execute("+");
                        num.setText(c.getNum()+"");
                });
        });
        findViewById(R.id.button_minus).setOnClickListener((v)->{
                int int1 = Integer.parseInt(num.getText().toString());
               // c.execute(v);
        });
        findViewById(R.id.button_multi).setOnClickListener((v)->{
                int int1 = Integer.parseInt(num.getText().toString());
               // c.execute(v);
        });
        findViewById(R.id.button_devide).setOnClickListener((v)->{
                int int1 = Integer.parseInt(num.getText().toString());
                //c.execute(v);
        });
/*=============================================Option=============================================*/
        findViewById(R.id.button_clear).setOnClickListener((v)->{
               // c.execute(v);
        });
        findViewById(R.id.button_back).setOnClickListener((v)->{

        });
    }
}
