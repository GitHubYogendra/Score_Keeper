package com.example.scorekeeperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int ScoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plus3(View view) {
        int plu = score+3;
        display(plu);
        score = plu;
    }

    private void display(int plu) {
        TextView dis = (TextView) findViewById(R.id.scoreA);
        dis.setText("" + plu);
    }

    public void plusB3(View view) {
        int plus = ScoreTeamB+3;
        displayScore(plus);
        ScoreTeamB = plus;
    }
    private void displayScore(int plus) {
        TextView dis = (TextView) findViewById(R.id.scoreB);
        dis.setText("" + plus);
    }

    public void reset(View view) {
        int res = 0;
        display(res);
        displayScore(res);
        score = res;
        ScoreTeamB = res;
    }

    public void plus2(View view) {
        int plu = score+2;
        display(plu);
        score = plu;
    }

    public void plusB2(View view) {
        int plus = ScoreTeamB+2;
        displayScore(plus);
        ScoreTeamB = plus;
    }

    public void plus1(View view) {
        int plu = score+1;
        display(plu);
        score = plu;
    }

    public void plusB1(View view) {
        int plus = ScoreTeamB+1;
        displayScore(plus);
        ScoreTeamB = plus;
    }
}