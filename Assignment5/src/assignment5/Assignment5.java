/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment5;

/**
 *
 * @author Tejas
 */
public class Assignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread1 newThread1 = new Thread1();
        Thread2 newThread2 = new Thread2();

        newThread1.playDoTone();
        newThread1.playDoTone();
        newThread1.playSolTone();
        newThread1.playSolTone();
        newThread2.playLaTone();
        newThread2.playLaTone();
        newThread1.playSolTone();
        newThread2.playFaTone();
        newThread2.playFaTone();
        newThread1.playMiTone();
        newThread1.playMiTone();
        newThread2.playReTone();
        newThread2.playReTone();
        newThread1.playDoTone();

        newThread1.playSolTone();
        newThread1.playSolTone();
        newThread2.playFaTone();
        newThread2.playFaTone();
        newThread1.playMiTone();
        newThread1.playMiTone();
        newThread2.playReTone();
        newThread1.playSolTone();
        newThread1.playSolTone();
        newThread2.playFaTone();
        newThread2.playFaTone();
        newThread1.playMiTone();
        newThread1.playMiTone();
        newThread2.playReTone();

        newThread1.playDoTone();
        newThread1.playDoTone();
        newThread1.playSolTone();
        newThread1.playSolTone();
        newThread2.playLaTone();
        newThread2.playLaTone();
        newThread1.playSolTone();
        newThread2.playFaTone();
        newThread2.playFaTone();
        newThread1.playMiTone();
        newThread1.playMiTone();
        newThread2.playReTone();
        newThread2.playReTone();
        newThread1.playDoTone();

    }

}
