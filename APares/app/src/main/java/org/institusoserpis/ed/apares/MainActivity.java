package org.institusoserpis.ed.apares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.imageButton);



    }


    public void onButtonClick(View view){

        Log.i(MainActivity.class.getSimpleName(), "Ejecutando onClickButton");
        button
    }

//    private void setContentView(int activity_main) {
//    }

    button.postDelayed( ())

}
