import java.applet.AudioClip;
import javax.swing.JApplet;

public class SoundPlayer {
   
   AudioClip inputSound;
   
   public SoundPlayer(String SoundFileURL){
      try {
    	  inputSound = JApplet.newAudioClip(getClass().getResource(SoundFileURL));
    	  }catch (Exception e) {System.out.println("Can't read the file");}
   }
   
   public void startPlay(){
      try {
    	  inputSound.play();
      }catch (Exception e) {System.out.println("Couldn't play the music");}
   }
 
   public void stopPlayer(){
      inputSound.stop();
   }
}