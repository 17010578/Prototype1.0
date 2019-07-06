package com.myapplicationdev.android.prototype1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class referral2 extends AppCompatActivity {

    Button btn14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referral2);

        btn14 = findViewById(R.id.button14);

        setTitle("Referral");

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(referral2.this,viewerrand.class);
                startActivity(i);
            }
        });

    }
}
