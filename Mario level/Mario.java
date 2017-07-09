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
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.event.KeyListener;

public class Mario{
//all numbers multiplied by 2 from OG game
  protected MarioState state;
  protected int x, y;
  BufferedImage sprite;
  
  
  public Mario(){
    this.state = MarioState.SMALL;
    this.x = 54;
    this.y = 806;
    URL spriteAtLoc = getClass().getResource("sprites/Mario/SmallStandFaceRight.bmp");

    try{
      sprite = ImageIO.read(spriteAtLoc);

    } catch(IOException e){
      System.out.println("sprite not found");
      e.printStackTrace();
    }
  }
  
  public Mario(MarioState s, int x, int y){
    this.state = s;
    this.x = x;
    this.y = y;
  }
  
  public void move(){
    this.x+=2;
    //System.out.println("Mario X: " + this.x);
  }
  
  public void jump(){
    this.y -= 46;
    
    //System.out.println("Mario Y: " + this.y);
    //this.y-=46;
  }
  
  public String getCoordinates(){
    return "Mario coords: " + this.x + ", " + this.y + ".";
  }
  
  public void draw(Graphics g){

    g.drawImage(sprite, this.x, this.y, null);
  }
  
  public static void main(String[] args){
    Mario m = new Mario();
    m.move();
    System.out.println(m.getCoordinates());
    m.move();
    System.out.println(m.getCoordinates());
    m.jump();
    System.out.println(m.getCoordinates());
  }
  
  
  
}
