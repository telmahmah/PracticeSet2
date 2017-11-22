//package com.tamimjj2.android.practiceset2;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}
package com.tamimjj2.android.practiceset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    int lastscoreA;
    int lastscoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Team A buttons

    public void addThreePointsTeamA(View v)
    {
        scoreTeamA = scoreTeamA + 3;
        lastscoreA = 3;
        displayTeamA();
    }

    public void addTwoPointsTeamA(View v)
    {
        scoreTeamA = scoreTeamA + 2;
        lastscoreA = 2;
        displayTeamA();
    }

    public void addOnePointTeamA(View v)
    {
        scoreTeamA = scoreTeamA + 1;
        lastscoreA = 1;
        displayTeamA();
    }

    public void cancelPointsTeamA(View v)
    {
        scoreTeamA = scoreTeamA - lastscoreA;
        displayTeamA();
        // to avoid cancelling same last score many times
        lastscoreA = 0;
    }

    // Team B buttons

    public void addThreePointsTeamB(View v)
    {
        scoreTeamB += 3;
        lastscoreB = 3;
        displayTeamB();
    }

    public void addTwoPointsTeamB(View v)
    {
        scoreTeamB += 2;
        lastscoreB = 2;
        displayTeamB();
    }

    public void addOnePointTeamB(View v)
    {
        scoreTeamB++;
        lastscoreB = 1;
        displayTeamB();
    }
    public void cancelPointsTeamB(View v)
    {
        scoreTeamB = scoreTeamB - lastscoreB;
        displayTeamB();
        // to avoid cancelling same last score many times
        lastscoreB = 0;
    }

    // Display code
    public void displayTeamA()
    {
        TextView tv = (TextView) findViewById(R.id.score_team_a);
        tv.setText(String.valueOf(scoreTeamA));
    }
    public void displayTeamB()
    {
        TextView tv = (TextView) findViewById(R.id.score_team_b);
        tv.setText(String.valueOf(scoreTeamB));
    }

    // reset all scores and display
    public void reset(View v)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        lastscoreA = 0;
        lastscoreB = 0;
        displayTeamA();
        displayTeamB();
    }
}
