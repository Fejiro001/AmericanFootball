package com.fejiro.americanfootball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //displayed score for team A
    int teamAScore = 0;

    //displayed score for team B
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Reset all scores to 0
     */
    public void resetScores(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayTeamA(teamAScore);
        displayTeamB(teamBScore);
    }

    /**
     * Increase team A score by 6 points
     */
    public void touchdownForA(View view) {
        teamAScore += 6;
        displayTeamA(teamAScore);
    }

    /**
     * Increase team A score by 3 points
     */
    public void fieldGoalForA(View view) {
        teamAScore += 3;
        displayTeamA(teamAScore);
    }

    /**
     * Increase team A score by 2 points
     */
    public void safetyForA(View view) {
        teamAScore += 2;
        displayTeamA(teamAScore);
    }

    /**
     * Increase team A score by 1 point
     */
    public void extra1ForA(View view) {
        teamAScore += 1;
        displayTeamA(teamAScore);
    }

    /**
     * Increase team A score by 2 points
     */
    public void extra2ForA(View view) {
        teamAScore += 2;
        displayTeamA(teamAScore);
    }

    /**
     * Increase team B score by 6 points
     */
    public void touchdownForB(View view) {
        teamBScore += 6;
        displayTeamB(teamBScore);
    }

    /**
     * Increase team B score by 3 points
     */
    public void fieldGoalForB(View view) {
        teamBScore += 3;
        displayTeamB(teamBScore);
    }

    /**
     * Increase team B score by 2 points
     */
    public void safetyForB(View view) {
        teamBScore += 2;
        displayTeamB(teamBScore);
    }

    /**
     * Increase team B score by 1 point
     */
    public void extra1ForB(View view) {
        teamBScore += 1;
        displayTeamB(teamBScore);
    }

    /**
     * Increase team B score by 2 points
     */
    public void extra2ForB(View view) {
        teamBScore += 2;
        displayTeamB(teamBScore);
    }

    /**
     * Display team A scores on screen
     */
    public void displayTeamA(int score) {
        TextView scoreA = findViewById(R.id.team_a_score);
        scoreA.setText(String.valueOf(score));
    }

    /**
     * Display team B scores on screen
     */
    public void displayTeamB(int score) {
        TextView scoreA = findViewById(R.id.team_b_score);
        scoreA.setText(String.valueOf(score));
    }
}