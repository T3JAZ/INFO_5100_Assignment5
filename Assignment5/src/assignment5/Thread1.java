/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment5;

/**
 *
 * @author Tejas
 */
public class Thread1 extends Thread {
    @Override
    public void run() {

    }

    public void playDoTone() {
        for (int i = 0; i < 200; i++) {
            FilePlayer.play("T:\\Chrome Downloads\\Sounds\\do.wav");
        }
    }

    public void playMiTone() {
        for (int i = 0; i < 200; i++) {
            FilePlayer.play("T:\\Chrome Downloads\\Sounds\\mi.wav");
        }
    }

    public void playSolTone() {
        for (int i = 0; i < 200; i++) {
            FilePlayer.play("T:\\Chrome Downloads\\Sounds\\sol.wav");
        }
    }

    public void playSiTone() {
        for (int i = 0; i < 200; i++) {
            FilePlayer.play("T:\\Chrome Downloads\\Sounds\\si.wav");
        }
    }

    public void playDoOctaveTone() {
        for (int i = 0; i < 200; i++) {
            FilePlayer.play("T:\\Chrome Downloads\\Sounds\\do-octave.wav");
        }
    }

}
