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
  protected Direction dir;
  protected int x, y;
  protected BufferedImage sprite;
  
  
  public Mario(){
    this.state = MarioState.SMALL;
    this.x = 54;
    this.y = 806;
    dir = Direction.RIGHT;
    URL spriteAtLoc = Utils.urlGenerator(Constants.SMALLSTANDFACERIGHT);
    this.sprite = Utils.generateAndFilter(sprite,spriteAtLoc);
  }
  
  public Mario(MarioState s, int x, int y){
    this.state = s;
    this.x = x;
    this.y = y;
    
    URL spriteAtLoc = getClass().getResource("sprites/Mario/SmallStandFaceRight.bmp");

    try{
      sprite = ImageIO.read(spriteAtLoc);

    } catch(IOException e){
      System.out.println("sprite not found");
      e.printStackTrace();
    }
  }
  
  public void moveRight(){
    this.x+=2;
    
    //System.out.println("Mario X: " + this.x);
  }
  
  public void moveLeft(){
    this.x-=2;
    
  }
  
  public void move(char c, int px){
    if(c =='x'){
      this.x += px;
    }
    if(c == 'y'){
      this.y += px;
    }
  }
  
  public void jump(){
    this.y -= 46;
  }
  
  public void downForTesting(){
    this.y += 46;
  }
  
  
  public String getCoordinates(){
    return "Mario coords: " + this.x + ", " + this.y + ".";
  }
  
  public int getX(){
    return this.x;
  }
  
  public int getY(){
    return this.y;
  }
  
  public void setX(int newX){
    this.x = newX;
  }
  public void setY(int newY){
    this.y = newY;
  }
  
  public void setSprite(String spriteName){
    URL spriteAtLoc = Utils.urlGenerator(spriteName);
    this.sprite = Utils.generateAndFilter(sprite,spriteAtLoc);
  }
  
  
  public void paint(Graphics g){
    Graphics2D g2 = (Graphics2D) g;
    g2.drawImage(sprite, 0,0, null); //DO NOT SET x and y TO ANYTHING, this sets 0,0 to top left!!
  }
  
  public static void main(String[] args){
    Mario m = new Mario();
    m.moveRight();
    System.out.println(m.getCoordinates());
    m.moveLeft();
    System.out.println(m.getCoordinates());
    m.jump();
    System.out.println(m.getCoordinates());
    
  }
  
  
  
}
