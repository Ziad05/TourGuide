package com.ziad.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button btnTour1, btnTour2,btnTour3,btnTour4, btnTour5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnTour1=(Button)findViewById(R.id.btn1);
        btnTour2=(Button)findViewById(R.id.btn2);
        btnTour3=(Button)findViewById(R.id.btn3);
        btnTour4=(Button)findViewById(R.id.btn4);
        btnTour5=(Button)findViewById(R.id.btn5);

        btnTour1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(HomeActivity.this,DescriptionActivity.class);
                intent.putExtra("place","one");
                startActivity(intent);

            }
        });

        btnTour2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(HomeActivity.this,DescriptionActivity.class);
                intent.putExtra("place","two");
                startActivity(intent);

            }
        });

        btnTour3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(HomeActivity.this,DescriptionActivity.class);
                intent.putExtra("place","three");
                startActivity(intent);

            }
        });

        btnTour4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(HomeActivity.this,DescriptionActivity.class);
                intent.putExtra("place","four");
                startActivity(intent);

            }
        });

        btnTour5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(HomeActivity.this,DescriptionActivity.class);
                intent.putExtra("place","five");
                startActivity(intent);

            }
        });

    }
}
