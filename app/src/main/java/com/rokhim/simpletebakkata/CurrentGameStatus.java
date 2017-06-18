package com.rokhim.simpletebakkata;

/**
 * Rokhimin Wahid on 07/06/2017.
 */

public class CurrentGameStatus {

    /*deklarasi score dan wordtoguess*/
    static Score score;
    static WordToGuess wordToGuess;

    /*menginisiasikan score dan wordtoguess*/
    CurrentGameStatus(){
        score = new Score();
        wordToGuess = new WordToGuess(GenerateWord.generate());
    }

    /*mendapatkan nilai default score*/
    int get_score(){
        return score.return_score();
    }

    /*mendapatkan sumber kata*/
    String get_raw_word(){
        return wordToGuess.return_raw_word();
    }

    /*menampilkan kata yg sudah di generate*/
    String get_display_word(){
        return wordToGuess.display_word();
    }

    /*membuat kondisi jika menebak kata*/
    boolean try_to_insert_letter(String guessed_letter) {
        if (wordToGuess.letter_belongs_to_word(guessed_letter) && !wordToGuess.letter_already_in_word(guessed_letter)) {
            wordToGuess.insert_letter(guessed_letter);
            score.update_score_correct_letter();
            return true;
        }
        else {
            score.update_score_incorrect_letter();
            return false;
            }
    }

    /*jika sudah berhasil menebak kata*/
    boolean word_completed(){
        return wordToGuess.word_completed();
    }

}
