package com.myapplicationdev.android.prototype1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class history2 extends AppCompatActivity {

    Button btn20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history2);

        btn20 = findViewById(R.id.button20);

        setTitle("History");

        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(history2.this,viewerrand.class);
                startActivity(i);
            }
        });

    }
}
