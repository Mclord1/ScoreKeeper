package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamBarca(0);
        displayCornerForTeamBarca(0);
        displayPenaltyForTeamBarca(0);
        displayYellowCardForTeamBarca(0);
        displayRedCardForTeamBarca(0);
        displayFoulForTeamBarca(0);

        displayForTeamJuventus(0);
        displayCornerForTeamJuventus(0);
        displayPenaltyForTeamJuventus(0);
        displayYellowCardForTeamJuventus(0);
        displayRedCardForTeamJuventus(0);
        displayFoulForTeamJuventus(0);
    }


    //    Team Barca
    int scoreTeamBarca = 0;
    int cornerTeamBarca = 0;
    int penaltyTeamBarca = 0;
    int yellowCardTeamBarca = 0;
    int redCardTeamBarca = 0;
    int foulTeamBarca = 0;

    public void displayForTeamBarca(int score) {
        TextView scoreView = findViewById(R.id.team_barca_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayCornerForTeamBarca(int score) {
        TextView scoreView = findViewById(R.id.team_barca_corner);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPenaltyForTeamBarca(int score) {
        TextView scoreView = findViewById(R.id.team_barca_penalty);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowCardForTeamBarca(int score) {
        TextView scoreView = findViewById(R.id.team_barca_yellowCard);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedCardForTeamBarca(int score) {
        TextView scoreView = findViewById(R.id.team_barca_redCard);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForTeamBarca(int score) {
        TextView scoreView = findViewById(R.id.team_barca_foul);
        scoreView.setText(String.valueOf(score));
    }

    public void goalForTeamBarca(View v) {
        scoreTeamBarca = scoreTeamBarca + 1;
        displayForTeamBarca(scoreTeamBarca);
    }

    public void cornerForTeamBarca(View v) {
        cornerTeamBarca = cornerTeamBarca + 1;
        displayCornerForTeamBarca(cornerTeamBarca);
    }

    public void penaltyForTeamBarca(View v) {
        penaltyTeamBarca = penaltyTeamBarca + 1;
        displayPenaltyForTeamBarca(penaltyTeamBarca);
    }

    public void yellowCardForTeamBarca(View v) {
        yellowCardTeamBarca = yellowCardTeamBarca + 1;
        displayYellowCardForTeamBarca(yellowCardTeamBarca);
    }

    public void redCardForTeamBarca(View v) {
        redCardTeamBarca = redCardTeamBarca + 1;
        displayRedCardForTeamBarca(redCardTeamBarca);
    }

    public void foulForTeamBarca(View v) {
        foulTeamBarca = foulTeamBarca + 1;
        displayFoulForTeamBarca(foulTeamBarca);
    }

    public void resetForTeamBarca(View v) {
        scoreTeamBarca = 0;
        cornerTeamBarca = 0;
        penaltyTeamBarca = 0;
        yellowCardTeamBarca = 0;
        redCardTeamBarca = 0;
        foulTeamBarca = 0;
        displayForTeamBarca(scoreTeamBarca);
        displayCornerForTeamBarca(cornerTeamBarca);
        displayPenaltyForTeamBarca(penaltyTeamBarca);
        displayYellowCardForTeamBarca(yellowCardTeamBarca);
        displayRedCardForTeamBarca(redCardTeamBarca);
        displayFoulForTeamBarca(foulTeamBarca);
    }


    //    Team Juventus
    int scoreTeamJuventus = 0;
    int cornerTeamJuventus = 0;
    int penaltyTeamJuventus = 0;
    int yellowCardTeamJuventus = 0;
    int redCardTeamJuventus = 0;
    int foulTeamJuventus = 0;


    public void displayForTeamJuventus(int score) {
        TextView scoreView = findViewById(R.id.team_juventus_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayCornerForTeamJuventus(int score) {
        TextView scoreView = findViewById(R.id.team_juventus_corner);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPenaltyForTeamJuventus(int score) {
        TextView scoreView = findViewById(R.id.team_juventus_penalty);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowCardForTeamJuventus(int score) {
        TextView scoreView = findViewById(R.id.team_juventus_yellowCard);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedCardForTeamJuventus(int score) {
        TextView scoreView = findViewById(R.id.team_juventus_redCard);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForTeamJuventus(int score) {
        TextView scoreView = findViewById(R.id.team_juventus_foul);
        scoreView.setText(String.valueOf(score));
    }

    public void goalForTeamJuventus(View v) {
        scoreTeamJuventus = scoreTeamJuventus + 1;
        displayForTeamJuventus(scoreTeamJuventus);
    }

    public void cornerForTeamJuventus(View v) {
        cornerTeamJuventus = cornerTeamJuventus + 1;
        displayCornerForTeamJuventus(cornerTeamJuventus);
    }

    public void penaltyForTeamJuventus(View v) {
        penaltyTeamJuventus = penaltyTeamJuventus + 1;
        displayPenaltyForTeamJuventus(penaltyTeamJuventus);
    }

    public void yellowCardForTeamJuventus(View v) {
        yellowCardTeamJuventus = yellowCardTeamJuventus + 1;
        displayYellowCardForTeamJuventus(yellowCardTeamJuventus);
    }

    public void redCardForTeamJuventus(View v) {
        redCardTeamJuventus = redCardTeamJuventus + 1;
        displayRedCardForTeamJuventus(redCardTeamJuventus);
    }

    public void foulForTeamJuventus(View v) {
        foulTeamJuventus = foulTeamJuventus + 1;
        displayFoulForTeamJuventus(foulTeamJuventus);
    }

    public void resetForTeamJuventus(View v) {
        scoreTeamJuventus = 0;
        cornerTeamJuventus = 0;
        penaltyTeamJuventus = 0;
        yellowCardTeamJuventus = 0;
        redCardTeamJuventus = 0;
        foulTeamJuventus = 0;
        displayForTeamJuventus(scoreTeamJuventus);
        displayCornerForTeamJuventus(cornerTeamJuventus);
        displayPenaltyForTeamJuventus(penaltyTeamJuventus);
        displayYellowCardForTeamJuventus(yellowCardTeamJuventus);
        displayRedCardForTeamJuventus(redCardTeamJuventus);
        displayFoulForTeamJuventus(foulTeamJuventus);
    }


}
