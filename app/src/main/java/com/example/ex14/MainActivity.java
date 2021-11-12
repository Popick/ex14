package com.example.ex14;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout vi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vi = (ConstraintLayout) findViewById(R.id.bground);

    }

    public void go(View view) {
        Intent si = new Intent(this, MainActivity2.class);
        startActivity(si);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {
            case R.id.menuRed:
                vi.setBackgroundColor(Color.parseColor("#ff0000"));
                break;
            case R.id.menuGreen:
                vi.setBackgroundColor(Color.parseColor("#00ff00"));
                break;
            case R.id.menuBlue:
                vi.setBackgroundColor(Color.parseColor("#0000ff"));
                break;
        }

        return true;
    }


}