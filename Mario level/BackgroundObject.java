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

public class BackgroundObject{
  protected BufferedImage sprite;
  protected int which;
  protected int x, y;
  
  //default constructor
  public BackgroundObject(){
    this.which = 1;
    this.sprite = chooseSprite();
    this.x = 33;
    this.y = 708;
  }
  
  
  public BufferedImage chooseSprite(){
    BufferedImage pulledSprite = null;
    String spritePath = null;
    
    switch(this.which){
      case 1: spritePath = Constants.SEVENHILL;
      break;
      case 2: spritePath = Constants.THREEHILLRIGHT;
      break;
//      case 3: spritePath = Constants.RIGHTEDGETILEREG;
//      break;
      //more to be added!!!
    }
    
    URL spriteToPull = Utils.urlGenerator(spritePath);
    pulledSprite = Utils.generateAndFilter(sprite, spriteToPull);
    return pulledSprite;
  }
  
  void setPos(int newX, int newY){
    this.x = newX;
    this.y = newY;
  }
  
  public String posString(){
    return "This tile's X pos is " + this.x + ", this tile's Y pos is " + this.y + ".";  
  }
  
  public int getX(){
    return this.x;
  }
  
  public int getY(){
    return this.y;
  }
  
  public int getWhich(){
    return this.which;
  }
  
  public void paint(Graphics g){
    Graphics2D g2 = (Graphics2D) g;
    g2.drawImage(sprite, 0, 0, null); //DO NOT SET x and y TO ANYTHING, this sets 0,0 to top left!!
  }
  
  
  
}