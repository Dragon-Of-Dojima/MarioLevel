import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import java.io.IOException;
import static java.lang.invoke.MethodHandles.*;
//import static java.lang.invoke.MethodType.*;

public class Utils{
  
    public static URL urlGenerator(String name){
    URL u = lookup().lookupClass().getResource(name);
    return u;
  }

  public static BufferedImage generateAndFilter(BufferedImage b, URL u){
    
    try{
      b = ImageIO.read(u);
      int width = b.getWidth();
      int height = b.getHeight();
      int[] pixels = new int[width * height];
      
      //getRGB(int startX, int startY, int w, int h, int[] rgbArray, int offset, int scansize)
      b.getRGB(0, 0, width, height, pixels, 0, width); 
      
      for (int i = 0; i < pixels.length; i++) {
        //System.out.println(pixels[i]);
        

        if (pixels[i] == 0xFFff00fe) {
          pixels[i] = 0x00ff00fe; 
        }
      }
     //sprite.setRGB(0, 0, width, height, pixels, 0, width);
      BufferedImage newSprite = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
      newSprite.setRGB(0, 0, width, height, pixels, 0, width);
      b = newSprite;
      
    } 
    catch(IOException e){
      System.out.println("sprite not found");
      e.printStackTrace();
    }
    return b;
  }
  


}