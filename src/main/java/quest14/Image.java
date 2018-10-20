package quest14;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Image {
    public static void main(String[] args) throws IOException {
        // Constructs a BufferedImage of one of the predefined image types.
        BufferedImage bufferedImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);

        // Create a graphics which can be used to draw into the buffered image
        Graphics2D g2d = bufferedImage.createGraphics();

        // fill all the image with white
        g2d.setColor(Color.blue);
        g2d.fillRect(0, 0, 100, 100);

        // this is how we set a color
        g2d.setColor(Color.yellow);
        // this is how we fill a rectangle
        g2d.fillOval(12, 24, 50, 50);
        // this is how we set one pixel
        g2d.fillRect(5, 10, 1, 1);

        // Disposes of this graphics context and releases any system resources that it is using.
        g2d.dispose();

        // Save as PNG
        File file = new File("myimage.png");
        ImageIO.write(bufferedImage, "png", file);

    }
}
