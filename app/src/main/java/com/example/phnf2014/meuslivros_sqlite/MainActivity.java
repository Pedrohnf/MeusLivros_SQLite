package com.example.phnf2014.meuslivros_sqlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Cadastrar = findViewById(R.id.Cadastrar);
        Button Listar = findViewById(R.id.Listar);


        Cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent c = new Intent(getApplicationContext(),Cadastrar.class);
                Bundle b = new Bundle();
                b.putInt("cadastrar",1);
                c.putExtras(b);
                startActivity(c);

            }
        });

        Listar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent c1 = new Intent(getApplicationContext(),Listar.class);
                Bundle b1 = new Bundle();
                b1.putInt("listar",2);
                c1.putExtras(b1);
                startActivity(c1);


            }
        });
    }
}
