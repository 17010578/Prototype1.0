package com.myapplicationdev.android.prototype1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class support2 extends AppCompatActivity {

    Button btn15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support2);

        btn15 = findViewById(R.id.button15);

        setTitle("Support");

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(support2.this,viewerrand.class);
                startActivity(i);
            }
        });
    }
}
