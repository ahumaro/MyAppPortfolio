package com.ahumaro.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Toast toast = Toast.makeText(this, "", Toast.LENGTH_SHORT);

        ((Button) findViewById(R.id.btn_spotify)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.setText(getResources().getString(R.string.toast_spotify));
                toast.show();
            }
        });

        ((Button) findViewById(R.id.btn_scores)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.setText(getResources().getString(R.string.toast_scores));
                toast.show();
            }
        });
        ((Button) findViewById(R.id.btn_library)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.setText(getResources().getString(R.string.toast_library));
                toast.show();
            }
        });

        ((Button) findViewById(R.id.btn_bigger)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.setText(getResources().getString(R.string.toast_bigger));
                toast.show();
            }
        });

        ((Button) findViewById(R.id.btn_xyz)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.setText(getResources().getString(R.string.toast_xyz));
                toast.show();
            }
        });

        ((Button) findViewById(R.id.btn_capstone)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.setText(getResources().getString(R.string.toast_capstone));
                toast.show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            Snackbar.make(findViewById(R.id.coordinatorLayout), "by Ahumaro Mendoza <ahumaro@ahumaro.com>", Snackbar.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
