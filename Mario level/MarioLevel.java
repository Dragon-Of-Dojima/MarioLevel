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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

//a6e5ff is color of "sky"
//window size: 868,915

public class MarioLevel extends JFrame {

  MarioRender m = new MarioRender();
  GroundTileRender gT = new GroundTileRender();
  GroundTileRender gT2 = new GroundTileRender(2,Constants.FLOORTILESIZE, 838);
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
    bg.add(gT2);
    gT2.setBounds(gT2.gTile.getX(), gT2.gTile.getY(), gT2.gTile.sprite.getWidth(), gT2.gTile.sprite.getHeight()); 
    
    this.getContentPane().setBackground(Constants.MAINLEVELCOLOR);
    
    KeyListener kl = new MoveListener();
    this.addKeyListener(kl);
  
    this.setFocusable(true);

    
    //this.setFocusable(true);
   
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    ActionListener ac = new TickListener();
//    final int DELAY = 1000;
//    Timer t = new Timer(DELAY, ac);
//    t.start();
    
  }
  
//  class TickListener implements ActionListener{
//    public void actionPerformed(ActionEvent a){
//      m.marioSprite.setSprite(Constants.SMALLWALKFACERIGHT);
//      repaint();
//    }
//  }
  
  class MoveListener implements KeyListener{
    public void keyPressed(KeyEvent k){
      
      if((k.getKeyCode() == 39)){
        m.marioSprite.setSprite(Constants.SMALLSTANDFACERIGHT);
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
        m.marioSprite.setSprite(Constants.SMALLSTANDFACELEFT); //dead doesn't work
        m.testDropMario();
        System.out.println(m.marioSprite.getCoordinates());
      }
      if((k.getKeyCode() == 38)){
        m.marioSprite.setSprite(Constants.SMALLSTANDFACELEFT);
        m.testPushMario();
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