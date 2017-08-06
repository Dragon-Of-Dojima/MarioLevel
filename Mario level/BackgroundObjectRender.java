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

public class BackgroundObjectRender extends JLabel{
  BackgroundObject bgOb;
  
  //for default
  public BackgroundObjectRender(){
    bgOb = new BackgroundObject(); 
  }
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
    bgOb.paint(g2);
  }
  
  @Override
  public Dimension getPreferredSize() {
    return new Dimension(bgOb.sprite.getWidth(), bgOb.sprite.getHeight());
  }
  
  
  
}