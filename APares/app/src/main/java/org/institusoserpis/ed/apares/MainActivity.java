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
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Integer> idButtons =
            Arrays.asList(R.id.imageButton,R.id.imageButton2,R.id.imageButton3, R.id.imageButton4,
                    R.id.imageButton5,R.id.imageButton6,R.id.imageButton7, R.id.imageButton8,
                    R.id.imageButton9,R.id.imageButton10,R.id.imageButton11, R.id.imageButton12);

    private boolean esPrimeraPalabra = true;
    private String primeraPalabra = "";// Esto hay que cambiarlo para imagenButtons
    private Button primerButton = null;
    private Handler handler = new Handler();



    List<Integer> imageIds = new ArrayList<>(Arrays.asList(
            R.drawable.claud, R.drawable.jose, R.drawable.kairi,
            R.drawable.sora, R.drawable.soraguapo, R.drawable.wooofiiii
    ));


    private ColorDrawable colorDrawable = new ColorDrawable(Color.DKGRAY);


    List<ImageButton> imagenes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageIds.addAll(imageIds);
        Collections.shuffle(imageIds);

        for(int i = 0; i <idButtons.size();i++){
            final ImageButton imageButton = findViewById(idButtons.get(i));
            imagenes.add(imageButton);
        }

        for(int i = 0; i < idButtons.size();i++) {
            ImageButton imageButton = findViewById(idButtons.get(i));
            imageButton.setImageDrawable(colorDrawable);
            imageButton.setOnClickListener(this::onButtononClick);


        }


    }



    public void onButtononClick(View view) {


        Log.i(MainActivity.class.getSimpleName(), "Ejecutando onButtonClick");
        ImageButton imageButton = (ImageButton) view;
        int index = imagenes.indexOf(imageButton);
        imageButton.setImageResource(imageIds.get(index));
        new Handler().postDelayed(() -> imageButton.setImageResource(imageIds.get(index)), 2000);
        String palabra = palabras.get(index);// cambiar
        Button button = (Button) view;
        button.setText(palabra);// cambiar
        if (esPrimeraPalabra) {
            esPrimeraPalabra = palabra;
            primerButton = button;
            esPrimeraPalabra = false;
        } else {
            esPrimeraPalabra = true;

            if (!palabra.equals(primeraPalabra))
                handler.postDelayed() ->{
                primerButton.setText("");
                button.setText("");

            },4000

        } ;
    }




    public void incrementarContador(){

    }
}

