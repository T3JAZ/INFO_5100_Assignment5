package assignment5;

/**
 *
 * @author Tejas
 */
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class TwinkleTwinkleLittleStar {

    private static final Map<String, File> noteFiles = new HashMap<>();
    static {
        noteFiles.put("do", new File("Multithreading Resources/c_note.wav"));
        noteFiles.put("re", new File("Multithreading Resources/d_note.wav"));
        noteFiles.put("mi", new File("Multithreading Resources/e_note.wav"));
        noteFiles.put("fa", new File("Multithreading Resources/f_note.wav"));
        noteFiles.put("sol", new File("Multithreading Resources/g_note.wav"));
        noteFiles.put("la", new File("Multithreading Resources/a_note.wav"));
        noteFiles.put("si", new File("Multithreading Resources/b_note.wav"));
        noteFiles.put("do-octave", new File("Multithreading Resources/c_note_high.wav"));
    }

    private static final String[] twinkleMelody = {
            "do", "do", "sol", "sol", "la", "la", "sol", "fa", "fa", "mi", "mi", "re", "re", "do",
            "sol", "sol", "fa", "fa", "mi", "mi", "re", "sol", "sol", "fa", "fa", "mi", "mi", "re",
            "do", "do", "sol", "sol", "la", "la", "sol", "fa", "fa", "mi", "mi", "re", "re", "do"
    };

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (String note : twinkleMelody) {
                if (note.equals("do") || note.equals("mi") || note.equals("sol") || note.equals("si")
                        || note.equals("do-octave")) {
                    playSound(note);
                }
                try {
                    Thread.sleep(250);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (String note : twinkleMelody) {
                if (note.equals("re") || note.equals("fa") || note.equals("la") || note.equals("do-octave")) {
                    playSound(note);
                }
                try {
                    Thread.sleep(250);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
    }

    private static void playSound(String note) {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(noteFiles.get(note)));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (IOException | javax.sound.sampled.LineUnavailableException
                | javax.sound.sampled.UnsupportedAudioFileException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}