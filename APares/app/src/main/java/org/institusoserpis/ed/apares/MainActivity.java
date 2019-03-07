package org.institusoserpis.ed.apares;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Integer> idButtons =
            Arrays.asList(R.id.imageButton,R.id.imageButton2,R.id.imageButton3, R.id.imageButton4,
                    R.id.imageButton5,R.id.imageButton6,R.id.imageButton6,R.id.imageButton7,
                    R.id.imageButton8,R.id.imageButton9,R.id.imageButton10,R.id.imageButton11,
                    R.id.imageButton12);

    private ColorDrawable colorDrawable = new ColorDrawable(Color.DKGRAY);


    List<ImageButton> imagenes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i = 0; i <idButtons.size();i++){
            final ImageButton imageButton = findViewById(i);
            imagenes.add(imageButton);
        }
    ImageButton imageButton = findViewById(R.id.imageButton);
    new Handler().postDelayed(){
            () -> {imageButton.setImageDrawable(colorDrawable);}}
                    4000;);
        }

    }




    public void onButtononClick(View view){


        Log.i(MainActivity.class.getSimpleName(),"Ejecutando onButtonClick");
        idbuttons.setText("hola soy el bola");

//        button.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                button.setText("");
//            }
//        }, 2000);



        button.postDelayed( () -> button.setText(""), 5000);
        button.postDelayed(this::kkita,5000);
    }
    }


//    private void setContentView(int activity_main) {
//    }



}
