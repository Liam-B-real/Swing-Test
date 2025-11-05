import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class GameHandler {
    public static Scanner input = new Scanner(System.in);
    public static JFrame frame = new JFrame("Frame");
    
    public static Draw draw = new Draw();

    //Rectangle variables
    public static int rectX = 0, rectY = 0, rectW = 0, rectH = 0;

    public static JPanel panel = new JPanel() {
        @Override
        //Creates a Graphics object within our panel, which java
        //uses to draw stuff
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Draw.drawRect(g, rectX, rectY, rectW, rectH, Color.BLUE);
        }
    };

    public static void drawRectangle(int x, int y, int w, int h) {
        rectX = x;
        rectY = y;
        rectW = w;
        rectH = h;
        panel.repaint();
    }
}

