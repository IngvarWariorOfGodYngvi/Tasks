package quest15;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;

public class FibonacciBinaryToPng {
    public static void main(String[] args) throws IOException {
        int width = 1000;
        int heigth = 1500;
        BufferedImage bufferedImage = new BufferedImage(width,heigth,BufferedImage.TYPE_INT_RGB);
        Graphics2D g2D = bufferedImage.createGraphics();
        g2D.setColor(Color.white);
        g2D.fillRect(0,0,width,heigth);
        g2D.setColor(Color.black);
        for (int i=0;i<heigth;i++){
            System.out.println(i+1);
            BigInteger current = fibonacci_iterative(i);
            String binary = toBinary(current,width);
            char[] chars = binary.toCharArray();
            for (int j=0;j<chars.length;j++){
                if(chars[j] == '1'){
                    g2D.fillRect(j,i,1,1);
                }
            }
        }
        g2D.dispose();

        File file = new File("Fibonacci.png");
        ImageIO.write(bufferedImage,"png", file);
    }

    private static String toBinary(BigInteger number, int feedZerosCount) {
        String result = "";
        for (int i = 0; i < feedZerosCount; i++) {
            if(number.mod(BigInteger.valueOf(2)).equals(BigInteger.ONE)) {
                result = "1" + result;
            } else {
                result = "0" + result;
            }
            number = number.divide(BigInteger.valueOf(2));
        }

        return result;

    }

    public static BigInteger fibonacci_iterative(int i) {
        if (i == 0) {
            return BigInteger.ONE;
        } else if(i == 1) {
            return BigInteger.ONE;
        }
        else {
            BigInteger a = BigInteger.ONE;
            BigInteger b = BigInteger.ONE;
            BigInteger temp;
            for (int j = 0; j < i; j++) {
                temp = a.add(b);
                a = b;
                b = temp;
            }
            return b;
        }
    }
}
