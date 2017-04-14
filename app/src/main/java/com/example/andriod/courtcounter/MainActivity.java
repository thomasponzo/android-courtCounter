package com.example.andriod.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int team_a_score = 0;
    int team_b_score = 0;
    int a_fouls = 0;
    int b_fouls = 0;
    String team_a_fouls = "";
    String team_b_fouls = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for team A by 3
     * @param v
     */
    public void addThreeForTeamA(View v){
        team_a_score += 3;
        displayForTeamA(team_a_score);
    }

    /**
     * Increase the score for team A by 2
     * @param v
     */
    public void addTwoForTeamA(View v){
        team_a_score += 2;
        displayForTeamA(team_a_score);
    }

    /**
     * Increase the score for team A by 1
     * @param v
     */
    public void addOneForTeamA(View v){
        team_a_score += 1;
        displayForTeamA(team_a_score);
    }

    /**
     * Increase the score for team B by 3
     * @param v
     */
    public void addThreeForTeamB(View v){
        team_b_score += 3;
        displayForTeamB(team_b_score);
    }

    /**
     * Increase the score for team B by 2
     * @param v
     */
    public void addTwoForTeamB(View v){
        team_b_score += 2;
        displayForTeamB(team_b_score);
    }

    /**
     * Increase the score for team B by 1
     * @param v
     */
    public void addOneForTeamB(View v){
        team_b_score += 1;
        displayForTeamB(team_b_score);
    }

    /**
     * Increase the fouls for team A by 1
     * @param v
     */
    public void addOneFoulForTeamA(View v){
        a_fouls += 1;
        team_a_fouls = "Fouls Team A: " + a_fouls;
        displayFoulsTeamA(team_a_fouls);
    }

    /**
     * Increase the fouls for team B by 1
     * @param v
     */
    public void addOneFoulForTeamB(View v){
        b_fouls += 1;
        team_b_fouls = "Fouls Team B: " + b_fouls;
        displayFoulsTeamB(team_b_fouls);
    }

    /**
     * Resets the A , B score and fouls
     */
    public void resetScore(View v) {
        team_a_score = 0;
        team_b_score = 0;
        a_fouls = 0;
        b_fouls= 0;
        team_a_fouls = "Fouls Team A: 0";
        team_b_fouls = "Fouls Team B: 0";
        displayForTeamA(team_a_score);
        displayForTeamB(team_b_score);
        displayFoulsTeamA(team_a_fouls);
        displayFoulsTeamB(team_b_fouls);
    }

    /**
     * Displays the given score for Team A
     */
    public void displayForTeamA(int team_a_score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(team_a_score));
    }

    /**
     * Displays the given score for Team B
     */
    public void displayForTeamB(int team_b_score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(team_b_score));
    }

    public void displayFoulsTeamA(String team_a_fouls) {
        TextView scoreView = (TextView) findViewById(R.id.total_fouls_a);
        scoreView.setText(String.valueOf(team_a_fouls));
    }

    public void displayFoulsTeamB(String team_b_fouls) {
        TextView scoreView = (TextView) findViewById(R.id.total_fouls_b);
        scoreView.setText(String.valueOf(team_b_fouls));
    }
}
