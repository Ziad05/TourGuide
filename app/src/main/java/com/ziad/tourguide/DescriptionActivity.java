package com.ziad.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {
    ImageView imgPlace;
    TextView txtPlaceName, txtDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        imgPlace= (ImageView)findViewById(R.id.img_place);
        txtPlaceName=(TextView)findViewById(R.id.place_name);
        txtDescription=(TextView)findViewById(R.id.txt_description);

        String getPlace= getIntent().getExtras().getString("place");

        if(getPlace.equals("one")){
            imgPlace.setImageResource(R.drawable.cx2);
            txtPlaceName.setText(R.string.place1);
            txtDescription.setText(R.string.description1);

        }
        else if(getPlace.equals("two")){
            imgPlace.setImageResource(R.drawable.imgsaint);
            txtPlaceName.setText(R.string.place2);
            txtDescription.setText(R.string.description2);


        }
        else if(getPlace.equals("three")){
            imgPlace.setImageResource(R.drawable.imgkap);
            txtPlaceName.setText(R.string.place3);
            txtDescription.setText(R.string.description3);


        }
        else if(getPlace.equals("four")){
            imgPlace.setImageResource(R.drawable.imgsundar);
            txtPlaceName.setText(R.string.place4);
            txtDescription.setText(R.string.description4);


        }
        else if(getPlace.equals("five")){
            imgPlace.setImageResource(R.drawable.imgboga);
            txtPlaceName.setText(R.string.place5);
            txtDescription.setText(R.string.description5);


        }

    }
}
