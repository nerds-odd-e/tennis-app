package com.odde.tennis;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Referee extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }


    public void player1Score(View view) {
        TextView scoreView = (TextView) findViewById(R.id.scoreView);
        scoreView.setText("Fifteen Love");
    }
}
