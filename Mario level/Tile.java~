import java.nio.file.Files;
import java.nio.file.Paths;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JLabel;

abstract class Tile extends JLabel{
  
  int x;
  int y;
  BufferedImage sprite;
  
  abstract void collideFromLeft();
  abstract void collideFromRight();
  abstract void collideFromTop();
  abstract void collideFromBottom();
  
}