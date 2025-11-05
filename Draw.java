import java.awt.*;

//Class to write all methods that draw objects
public class Draw {

    public void drawRect(Graphics g, int x, int y, int w, int h, Color color) {
        g.setColor(color);
        g.drawRect(x, y, w, h);
    }

    public void drawFilledRect(Graphics g, int x, int y, int w, int h, Color color) {
        g.setColor(color);
        g.fillRect(x, y, w, h);
    }

    public void drawText(Graphics g, String text, int x, int y, Color color) {
        g.setColor(color);
        g.drawString(text, x, y);
    }
}
