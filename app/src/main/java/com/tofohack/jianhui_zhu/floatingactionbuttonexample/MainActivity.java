package com.tofohack.jianhui_zhu.floatingactionbuttonexample;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private static int colorCounter=0xff000000;
    private static int counter=0;
    @Bind(R.id.sub_container)
    LinearLayout list;
    @Bind(R.id.floating_action_button)
    FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * bind the linear layout and floating action button from the activity_main.xml
         * to code here
         */
        ButterKnife.bind(this);
        /**
         * Add the event handler for the floating action button
         * Here is the on click event
         */
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView textView = new TextView(MainActivity.this);
                textView.setText("Squirrel " + counter++);
                textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
                /**
                 * backgournd color from dark to light
                 * text is centered
                 */
                textView.setBackgroundColor(colorCounter += 15);
                textView.setGravity(Gravity.CENTER);
                /**
                 * text color here is white
                 */
                textView.setTextColor(0xffffffff);
                list.addView(textView);
            }
        });
    }
}
