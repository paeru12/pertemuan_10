
package com.mycompany.mavenproject2;
import java.util.Random;

class WordGuessingGame extends Game {

    private String[] words;
    private int secretNumber;
    public WordGuessingGame(int guessLimit, String[] words) {
        super(guessLimit);
        this.words = words;
    }

    @Override
    public void generateNumber() {
        Random random = new Random();
        int index = random.nextInt(words.length);
        secretNumber = index; // Memperlakukan indeks sebagai nomor acak
    }

    @Override
    public String checkGuess(int guess) {
        if (guess == secretNumber) {
            return "Benar! Anda menebak kata \"" + words[secretNumber] + "\"";
        } else if (guess > secretNumber) {
            return "Kata yang dicari ada di urutan alfabet yang lebih awal.";
        } else {
            return "Kata yang dicari ada di urutan alfabet yang lebih akhir.";
        }
    }
}
