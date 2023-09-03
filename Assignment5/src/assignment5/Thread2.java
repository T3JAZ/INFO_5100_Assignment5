/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment5;

/**
 *
 * @author Tejas
 */
public class Thread2 extends Thread {
    public void run() {

    }

    public void playReTone() {
        for (int i = 0; i < 200; i++) {
            FilePlayer.play("T:\\Chrome Downloads\\Sounds\\re.wav");
        }
    }

    public void playFaTone() {
        for (int i = 0; i < 200; i++) {
            FilePlayer.play("T:\\Chrome Downloads\\Sounds\\fa.wav");
        }
    }

    public void playLaTone() {
        for (int i = 0; i < 200; i++) {
            FilePlayer.play("T:\\Chrome Downloads\\Sounds\\la.wav");
        }
    }

    public void playDoOctaveTone() {
        for (int i = 0; i < 200; i++) {
            FilePlayer.play("T:\\Chrome Downloads\\Sounds\\do-octave.wav");
        }
    }

}
