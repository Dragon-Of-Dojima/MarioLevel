import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.awt.Dimension;
import java.awt.Window;
import javax.swing.JWindow;
import java.net.URL;
import java.awt.image.*;


public class MarioComponent extends JComponent{

  protected Mario marioSprite;
  
  
  public MarioComponent(){
    marioSprite = new Mario();
  }
  
  public void paintComponent(Graphics g){
    //super.paintComponent(g);
    marioSprite.draw(g);
  }
  
    public void moveMario(){
    marioSprite.move();
    repaint();
  }
    
   public void jumpMario(){
    marioSprite.jump();
    repaint();
    
  }
   
   public void getCoordinates(){
     System.out.println(marioSprite.getCoordinates());
   }
  
  @Override
  public Dimension getPreferredSize() {
    return new Dimension(marioSprite.sprite.getWidth(), marioSprite.sprite.getHeight());
  }
  
  public static void main(String[] args){
    JFrame f = new JFrame();
    f.setSize(868,915);
    MarioComponent m = new MarioComponent();
    f.add(m);
    
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  }
  

}