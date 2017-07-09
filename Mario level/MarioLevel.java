import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class MarioLevel extends JFrame {

  MarioComponent mc = new MarioComponent();
  LevelMap lm = new LevelMap();
  
  public MarioLevel(){
    this.setSize(868,915);
    this.add(mc);
    
    KeyListener kl = new MoveListener();
    this.addKeyListener(kl);
    this.setFocusable(true);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  }
  
  class MoveListener implements KeyListener{
    public void keyPressed(KeyEvent k){
      
      if((k.getKeyCode() == 39)){
        mc.moveMario();
        System.out.println(mc.marioSprite.getCoordinates());
      }
      if(k.getKeyCode() == 83){
        mc.jumpMario();
        System.out.println(mc.marioSprite.getCoordinates());
      }
    }
    public void keyReleased(KeyEvent k){}
    public void keyTyped(KeyEvent k){}    
  }
  

  
  public static void main(String[] args){
   MarioLevel m = new MarioLevel();
  }


}