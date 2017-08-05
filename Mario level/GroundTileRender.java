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

/*
 * (Mario usually starts at 54,806)
 * (frame is now at default: 868,915)
 */

public class GroundTileRender extends JLabel{
  
  protected GroundTile gTile;
  
  
  public GroundTileRender(){
    gTile = new GroundTile();
  }
  
  public GroundTileRender(int w, int x, int y){
    gTile = new GroundTile(w,x,y);
  }
  
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
    gTile.draw(g2);
  }
  
  
  @Override
  public Dimension getPreferredSize() {
    return new Dimension(gTile.sprite.getWidth(), gTile.sprite.getHeight());
  }
  
  public static void main(String[] args){
    JFrame j = new JFrame();
    j.setSize(868,915);
    GroundTileRender gt = new GroundTileRender();
    j.add(gt);
    j.setVisible(true);
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    
  }
  
}