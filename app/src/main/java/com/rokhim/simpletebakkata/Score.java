package com.rokhim.simpletebakkata;

import android.support.v7.app.AppCompatActivity;

/**
 * Rokhimin Wahid on 07/06/2017.
 */

public class Score extends AppCompatActivity {

    /*score adalah 100*/
    static int score = 100;

    /*fungsi update score*/
    void update_score_by(int delta)
    {
        score += delta;
    }

    /*fungsi jika score benar*/
    void update_score_correct_letter()
    {
        score += 10;
    }

    /*fungsi jika score salah*/
    void update_score_incorrect_letter()
    {
        score -= 10;
    }

    /*fungsi score default*/
    int return_score()
    {
        return score;
    }
    Score(){
        score = 0;
    }



}
