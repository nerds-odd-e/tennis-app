package com.odde.tennis;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Referee extends Activity {

    private int score_for_player1 = 0;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void player1Score(View view) {
        score_for_player1++;

        displayScore(getScore());
    }

    private String getScore() {
        if(score_for_player1 == 2){
            return "Thirty Love";
        }
        return "Fifteen Love";
    }

    private void displayScore(String score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreView);
        scoreView.setText(score);
    }
}
