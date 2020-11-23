package com.svalero.splashscreen_26_oct_o;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RelativeLayout extends AppCompatActivity {

    private static final int SCREEN = 3;
    private Button botonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        initcomponents();
        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navegar = new Intent(getBaseContext(), ConstraintLayout.class);
                startActivity(navegar);
            }
        });
    }

    private void initcomponents(){
        botonEnviar = findViewById(R.id.botonEnviarConstraint);
    }
}