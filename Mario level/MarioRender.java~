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


public class MarioRender extends JLabel{
  
  protected Mario marioSprite;
  
  
  public MarioRender(){
    marioSprite = new Mario();
  }
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
    marioSprite.paint(g2);
  }
  
  public void moveMarioRight(){
    marioSprite.moveRight();
    setLocation(this.marioSprite.getX() + 2, this.marioSprite.getY());
    repaint();
  }
  public void moveMarioLeft(){
    marioSprite.moveLeft();
    setLocation(this.marioSprite.getX() - 2, this.marioSprite.getY());
    repaint();
  }
  
  
  public void jumpMario(){
    marioSprite.jump();
    setLocation(this.marioSprite.getX(), this.marioSprite.getY() - 46);
    
  }
  
  public void testDropMario(){
    marioSprite.downForTesting();
    //setLocation(this.marioSprite.getX(), this.marioSprite.getY() + 46);
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
    //f.getContentPane().setBackground(new Color(156, 252, 240));
    f.setSize(868,915);
    MarioRender m = new MarioRender();
    f.add(m);
    m.marioSprite.setSprite(Constants.SMALLJUMPFACELEFT);
    
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  }
  

}