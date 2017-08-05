import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComponent;
import java.awt.BorderLayout;
import javax.swing.JLayeredPane;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.imageio.ImageIO;
import java.net.URL;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.Color;

//a6e5ff is color of "sky"
//window size: 868,915

public class MarioLevel extends JFrame {

  MarioRender m = new MarioRender();
  GroundTileRender gT = new GroundTileRender();
  JLabel bg;
  
  public MarioLevel(){
    bg = new JLabel();
    this.setSize(868, 915);
    this.setVisible(true);
    this.add(bg, BorderLayout.CENTER);
    bg.setLayout(null);
    
    bg.add(m);
    m.setBounds(m.marioSprite.getX(), m.marioSprite.getY(), m.marioSprite.sprite.getWidth(), m.marioSprite.sprite.getHeight());
    bg.add(gT);
    gT.setBounds(gT.gTile.getX(), gT.gTile.getY(), gT.gTile.sprite.getWidth(),gT.gTile.sprite.getHeight());
    
    this.getContentPane().setBackground(Constants.MAINLEVELCOLOR);
    
    KeyListener kl = new MoveListener();
    this.addKeyListener(kl);
  
    this.setFocusable(true);

    
    //this.setFocusable(true);
   
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  }
  
  class MoveListener implements KeyListener{
    public void keyPressed(KeyEvent k){
      
      if((k.getKeyCode() == 39)){
        m.marioSprite.setSprite(Constants.DEAD);
        m.moveMarioRight();
        System.out.println(m.marioSprite.getCoordinates());
      }
      
      if((k.getKeyCode() == 37)){
        m.marioSprite.setSprite(Constants.SMALLSTANDFACELEFT);
        m.moveMarioLeft();
        System.out.println(m.marioSprite.getCoordinates());
      }
      
      if(k.getKeyCode() == 83){
       m.marioSprite.setSprite(Constants.SMALLJUMPFACERIGHT);
       m.jumpMario();
        System.out.println(m.marioSprite.getCoordinates());
      }
      
      if(k.getKeyCode() == 90){
        m.marioSprite.setSprite(Constants.DEAD);
        m.testDropMario();
       
        System.out.println(m.marioSprite.getCoordinates());
      }
      
    }
    public void keyReleased(KeyEvent k){
//      if(k.getKeyCode = 83){
//        mc.Mario
//      }
    }
    public void keyTyped(KeyEvent k){}    
  }
  

  
  public static void main(String[] args){
   MarioLevel m = new MarioLevel();
  }


}