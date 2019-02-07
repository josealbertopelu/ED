package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void sendMessage(View view) {
        EditText editText = findViewById(R.id.editText);


        System.out.println("ejecutando sendMessage editText.getText()"
        editText().toString());
        MainActivity.message = editText.getText().toString();
        Intent intent = new Intent(this, Display);
        startActivity(intent);

    }
    private static String message;
    public static String getMessage() { return message;}
}
