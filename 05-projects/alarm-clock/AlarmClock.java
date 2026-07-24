import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable{

    private final LocalTime alarmTime;
    private final String filepath;
    private final Scanner scanner;

    AlarmClock(LocalTime alarmTime, String filepath, Scanner scanner){
        this.alarmTime = alarmTime;
        this.filepath = filepath;
        this.scanner = scanner;
    }

    @Override
    public void run() {

        while(LocalTime.now().isBefore(alarmTime)){
            try {
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();


                System.out.printf("\r%02d:%02d:%02d",
                        now.getHour(),
                        now.getMinute(),
                        now.getSecond());
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
        System.out.println("ALARM NOISES");
        playSound(filepath);
    }
    private void playSound(String filepath){

        File audioFile = new File(filepath);



        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.print("Press *ENTER* to stop the alarm: ");
            scanner.nextLine();
            clip.stop();
            scanner.close();
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file format is not supported");
        }
        catch (LineUnavailableException e){
            System.out.println("Audio is unavailable");
        }
        catch (IOException e){
            System.out.println("Error reading audio file");
        }

    }
}