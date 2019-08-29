import javax.swing.*;
import java.awt.*;

public class RandomGuess {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "this number is" +
                (1+ (int)(Math.random()*10)));

    }
}
