package com.example.user.hw1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText EDT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EDT = (EditText) findViewById(R.id.editText);
        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Main2Activity.class);
                Bundle bundle = new Bundle();
                bundle.putString("123",EDT.getText().toString());
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

    }
}
