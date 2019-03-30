package com.e.calculator1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnadd,btnsub,btnmul,btndiv,btntotal,btnclear;
    private TextView tvoutput;
    private EditText ettxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvoutput = findViewById(R.id.tvoutput);
        ettxt = findViewById(R.id.ettxt);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnadd = findViewById(R.id.btnadd);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ettxt.setText(ettxt.getText().toString() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ettxt.setText(ettxt.getText().toString() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ettxt.setText(ettxt.getText().toString() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ettxt.setText(ettxt.getText().toString() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ettxt.setText(ettxt.getText().toString() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ettxt.setText(ettxt.getText().toString() + "5");
            }
        });


      btn6.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              ettxt.setText(ettxt.getText().toString() + "6");
          }
      });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ettxt.setText(ettxt.getText().toString() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ettxt.setText(ettxt.getText().toString() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ettxt.setText(ettxt.getText().toString() + "9");
            }
        });

//        btnadd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ettxt.setText(ettxt.getText().toString() + "+");
//            }
//        });
//
//        btnsub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ettxt.setText(ettxt.getText().toString() + "-");
//            }
//        });
//
//        btnmul.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ettxt.setText(ettxt.getText().toString() + "*");
//            }
//        });

//        btndiv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ettxt.setText(ettxt.getText().toString() + "/");
//            }
//        });

//        btnclear.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ettxt.setText(ettxt.getText().length()-1);
//            }
//        });








    }
}
