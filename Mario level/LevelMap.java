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
import java.awt.Dimension;

public class LevelMap extends JLabel{

  BufferedImage bg;
  
  public LevelMap(){
    URL bgAtLoc = getClass().getResource("sprites/Mario/level.bmp");
    try{
      bg = ImageIO.read(bgAtLoc);
    }
    catch(IOException e){
      System.out.println("invalid level!");
    }
    
  }
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawImage(bg, 0, 0, null);
  }
  
//  public void scroll(){
//  
//  }
  
  @Override
  public Dimension getPreferredSize() {
    return new Dimension(bg.getWidth(), bg.getHeight());
  }
  
  public static void main(String[] args){
    JFrame j = new JFrame();
    LevelMap W1_1 = new LevelMap();
    j.setTitle("Level 1: SMB3");
    j.add(W1_1);
    j.setSize(868,915);
    j.setVisible(true);
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}