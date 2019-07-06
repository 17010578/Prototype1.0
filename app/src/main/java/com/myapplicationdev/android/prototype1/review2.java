package com.myapplicationdev.android.prototype1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class review2 extends AppCompatActivity {

    Button btn18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review2);

        btn18 = findViewById(R.id.button18);

        Intent intentReceived = getIntent();

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(review2.this,viewerrand.class);
                startActivity(i);
            }
        });
    }
}
