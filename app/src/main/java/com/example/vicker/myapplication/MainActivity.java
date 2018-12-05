package com.example.vicker.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnDoiAnh ;
    ImageView img1,img2,img3;
    boolean check = false;
    EditText txtNoiDung;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDoiAnh = findViewById(R.id.btnDoiAnh);
        img1 = findViewById(R.id.home1);
        img2 = findViewById(R.id.home2);
        img3 = findViewById(R.id.home3);

        txtNoiDung = findViewById(R.id.editText);
        DoiAnh();
    }
    void  DoiAnh(){
        btnDoiAnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(!check) {
//                    img.setImageResource(R.drawable.home);
//                }
//                else{
//                    img.setImageResource(R.drawable.home2);
//                }
//            check = !check;
                String txtNoiDung1 = txtNoiDung.getText().toString();
                Toast.makeText(MainActivity.this,"Ban vua nhap: " + txtNoiDung1, Toast.LENGTH_SHORT).show();
                if(txtNoiDung1.equals("1")){
                    img1.setImageResource(R.drawable.home61);
                }
                else if(txtNoiDung1.equals("2")){
                    img2.setImageResource(R.drawable.home62);
                }
                else if(txtNoiDung1.equals("3")){
                    img3.setImageResource(R.drawable.home63);
                }

            }
        });
    }
}
