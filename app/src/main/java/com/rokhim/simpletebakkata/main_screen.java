package com.rokhim.simpletebakkata;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Rokhimin Wahid on 07/06/2017.
 */

public class main_screen extends AppCompatActivity {

    /*deklarasi status game*/
    CurrentGameStatus current_game = new CurrentGameStatus();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        /*mengubungkan id textview di layout*/
        TextView wordView = (TextView) findViewById(R.id.word);
        TextView scoreText = (TextView) findViewById(R.id.score);

        /*menampilkan hasil game (word,score)*/
        System.out.println("Game Created with Word: " + current_game.get_raw_word());
        System.out.println("Game Created with Score: " + current_game.get_score());
        System.out.println("Game Created with Score: " + current_game.get_display_word());

        /*menginisiasikan score dan kata*/
        wordView.setText(current_game.get_display_word());
        scoreText.setText(Integer.toString(current_game.get_score()));


    }

    /*menghubungkan menu action bar ke java*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // menambah menu pada action bar
        getMenuInflater().inflate(R.menu.main_screen, menu);
        return true;
    }

    /*opsi pada menu action bar*/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // menghubungkan id action setting
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Toast.makeText(getApplicationContext(), "Developer by \n Rokhimin " + " Wahid :)", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);

    }

    /*membuat fungsi tombol TEBAK*/
    public void new_guess(View view) {

        TextView wordView = (TextView) findViewById(R.id.word);
        TextView scoreText = (TextView) findViewById(R.id.score);
        TextView letter_guessed = (TextView) findViewById(R.id.new_letter);

        String new_guess = letter_guessed.getText().toString();
        if (!new_guess.equals("")) {
            current_game.try_to_insert_letter(new_guess);

            wordView.setText(current_game.get_display_word());
            scoreText.setText(Integer.toString(current_game.get_score()));
            letter_guessed.setText("");

            if (current_game.word_completed()) {
                Toast.makeText(getApplicationContext(), "Selamat!!! \n Tebakanmu " + current_game.get_raw_word().toUpperCase() + " Benar :)", Toast.LENGTH_LONG).show();
                reset(view);
            }

        }
    }

    /*reset tebak kata*/
    public void reset(View view) {
        TextView wordView = (TextView) findViewById(R.id.word);
        TextView scoreText = (TextView) findViewById(R.id.score);

        current_game = new CurrentGameStatus();
        wordView.setText(current_game.get_display_word());
        scoreText.setText(Integer.toString(current_game.get_score()));
    }
}

