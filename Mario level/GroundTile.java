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



public class GroundTile extends Tile{
  
  int whichOne; //1 is left, 2 is center, 3 is right
  
  public GroundTile(int w, int x, int y){
    this.whichOne = w;
    this.sprite = chooseSprite();
    this.x = x;
    this.y = y;
  }
  
  public GroundTile(){
    this.whichOne = 1;
    this.sprite = chooseSprite();
    this.x = 0;
    this.y = 838;
  }
  
  public BufferedImage chooseSprite(){
    BufferedImage pulledSprite = null;
    String spritePath = null;
    
    switch(this.whichOne){
      case 1: spritePath = Constants.LEFTEDGETILEREG;
      break;
      case 2: spritePath = Constants.NONEDGETILEREG;
      break;
      case 3: spritePath = Constants.RIGHTEDGETILEREG;
      break;
    }
    
    URL spriteToPull = Utils.urlGenerator(spritePath);
    pulledSprite = Utils.generateAndFilter(sprite, spriteToPull);
    return pulledSprite;
    
  }
  
  
  void collideFromLeft(){};
  void collideFromRight(){};
  void collideFromTop(){};
  void collideFromBottom(){};
  
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
  
  public int getWhichOne(){
    return this.whichOne;
  }
  
  public void draw(Graphics g){
    Graphics2D g2 = (Graphics2D) g;
    g2.drawImage(sprite, 0, 0, null); //DO NOT SET x and y TO ANYTHING, this sets 0,0 to top left!!
  }
  
  public static void main(String[] args){
 
  }
  
}