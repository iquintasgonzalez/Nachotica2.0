package com.example.iquintasgonzalez.nachotica20;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

        int contador = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            ((SeekBar) findViewById(R.id.barra)).setOnSeekBarChangeListener(this);
        }


        public void EncenderOnClick(View v) {


            final Button bEncender = (Button) findViewById(R.id.button);


            contador++;

            if (contador % 2 == 0) {

                Toast.makeText(getBaseContext(), "Encendido", Toast.LENGTH_LONG).show();
                bEncender.setText("on");
                bEncender.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);


            } else {
                Toast.makeText(getBaseContext(), "Apagado", Toast.LENGTH_LONG).show();
                bEncender.setText("off");
                bEncender.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
            }


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
            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }

        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            Toast.makeText(MainActivity.this," "+ i, Toast.LENGTH_LONG).show();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            seekBar.getProgress();
        }
    }