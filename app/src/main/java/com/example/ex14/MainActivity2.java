package com.example.ex14;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {
    ConstraintLayout vi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        vi = (ConstraintLayout) findViewById(R.id.bground);

    }

    public void back(View view) {
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        menu.add(0, 0, 350, "Yellow");

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
            case 0:
                vi.setBackgroundColor(Color.parseColor("#ffff00"));
                break;
        }

        return true;

    }


}