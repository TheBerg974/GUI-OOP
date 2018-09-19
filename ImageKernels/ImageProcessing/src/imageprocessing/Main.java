package imageprocessing;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Main {
    public static void main(String[] args) 
    {
        try
        {
            BufferedImage input = ImageIO.read(new File("images/Lenna.png"));
            BufferedImage output = ImageProcessing.applyGaussianBlur(input);
            ImageIO.write(output, "png", new File("images/Lenna_Blurred.png"));
            
            BufferedImage input2 = ImageIO.read(new File("images/Lenna.png"));
            BufferedImage output2= ImageProcessing.applyBoxBlur(input2, 9);
            ImageIO.write(output2, "png", new File("images/Lenna_Box_Blurred.png"));
            
            BufferedImage input3 = ImageIO.read(new File("images/Lenna.png"));
            BufferedImage output3= ImageProcessing.applySharpen(input3);
            ImageIO.write(output3, "png", new File("images/Lenna_Sharpen.png"));
            
            BufferedImage input4 = ImageIO.read(new File("images/Lenna.png"));
            BufferedImage output4= ImageProcessing.applyEdgeDetection(input4);
            ImageIO.write(output4, "png", new File("images/Lenna_Sharpen.png"));
        }
        catch(Exception e)
        {
        }
    }
}
