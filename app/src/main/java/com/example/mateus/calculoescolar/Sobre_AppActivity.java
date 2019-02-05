package com.example.mateus.calculoescolar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Sobre_AppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre__app);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Sobre o App");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                startActivity(new Intent(this, PrincipalActivity.class));

                break;
            default:break;
        }
        return true;
    }

    @Override
    public void onBackPressed(){
        startActivity(new Intent(this, PrincipalActivity.class));

        return;
    }
}
