package org.institusoserpis.ed.apostdelayed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);


//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//
//        button.setOnClickListener(v -> {
//
//
//        });
//
//
//        button.setOnClickListener(this::onButtonClick);
    }

    
    
    public void onButtonClick(View view) {
        Log.i(MainActivity.class.getSimpleName(),"Ejecutando onButtonClick");
        button.setText("hola soy el bola");

//        button.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                button.setText("");
//            }
//        }, 2000);



        button.postDelayed( () -> button.setText(""), 5000);
        button.postDelayed(this::kkita,5000);
    }


    private void kkita(){

        button.setText("");
    }
    }



    private List<View> getLeafChildren(ViewGroup viewGroup) {
    List<View> leafChildren = new ArrayList<>();
    for(int index = 0; index <viewGroup.getChildCount();index++) {
        View view = viewGroup.getChildAt(index);
        if(view instanceof ViewGroup)
            leafChildren.addAll(getLeafChildren(ViewGroup)view);
        else
            leafChildren.add(view);

    }
    return leafChildren;
    }
