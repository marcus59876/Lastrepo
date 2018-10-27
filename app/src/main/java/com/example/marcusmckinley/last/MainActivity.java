package com.example.marcusmckinley.last;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button button; //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
         *Each activity must have a corresponding layout XML file
         */
        setContentView(R.layout.activity_main);// activity_main is corresponding XML file

        /*
         * Initializing button XML button id. findViewById is a method which
         * helps to initialize with particular id. btn_go_to_another_activity is
         * a button name which I have given in XML file
         */
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                /*
                 * Intent is just like glue which helps to navigate one activity
                 * to another.
                 */Intent intent = new Intent(MainActivity.this,
                        Main2Activity.class);
                startActivity(intent); // startActivity allow you to move
            }
        });
    }

}
