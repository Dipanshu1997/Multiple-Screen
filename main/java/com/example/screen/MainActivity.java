package com.example.screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG ="com.example.screen.ORDER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void PlaceOrder(View view){
        Intent intent = new Intent(this,Activity2.class);
        EditText editText1 = findViewById(R.id.edit_text1);
        EditText editText2 = findViewById(R.id.edit_text2);
        EditText editText3 = findViewById(R.id.edit_text3);
        String message = "Order for"+ editText1.getText().toString() + " has been successfully placed"
                        + editText2.getText().toString() + " & "
                               + editText3.getText().toString();

        intent.putExtra(MSG,message);
        startActivity(intent);
    }
}