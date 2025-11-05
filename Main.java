import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //We need invokeLater to force drawRectangle to run after makeFrame
        //For some god forsaken reason drawRectangle can run before makeFrame finishes
        SwingUtilities.invokeLater(() -> {
            makeFrame();
            GameHandler.drawRectangle(100, 100, 150, 120);
        });
    }
    
    public static String getInput(String ask) {
        System.out.println(ask);
        String userInput = GameHandler.input.nextLine();
        return userInput;
    }
    
    
    public static void makeFrame() {
        int width = Integer.parseInt(getInput("Enter desired width of game window: "));
        int height = Integer.parseInt(getInput("Enter desired height of game window: "));
        
        GameHandler.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GameHandler.frame.setSize(width, height);
        GameHandler.frame.add(GameHandler.panel);
        GameHandler.frame.setVisible(true);
    }

}
