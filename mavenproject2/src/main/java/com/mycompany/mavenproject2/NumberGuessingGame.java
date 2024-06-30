
package com.mycompany.mavenproject2;

/**
 *
 * @author BISMILLAH NAWAITU
 */
class NumberGuessingGame extends Game {

    public NumberGuessingGame(int guessLimit) {
        super(guessLimit);
    }

    @Override
    public void play() {
        super.play(); // Memanggil metode dari kelas base
        System.out.println("Terima kasih sudah bermain!");
    }
}
