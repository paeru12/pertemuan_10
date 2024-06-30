
package com.mycompany.mavenproject2;

/**
 *
 * @author BISMILLAH NAWAITU
 */
public class Main {

    public static void main(String[] args) {
// Contoh Game Tebak Angka
        NumberGuessingGame numberGame = new NumberGuessingGame(7);
        numberGame.play();
// Contoh Game Tebak Kata
        String[] words = {"apel", "pisang", "mangga"};
        WordGuessingGame wordGame = new WordGuessingGame(5, words);
        wordGame.play();
    }
}
