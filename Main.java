//see photo for color codes
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(32,87,129)); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setResizable(false);
        frame.setSize(600,500);
        frame.setVisible(true);

        JLabel label = new JLabel();
        label.setText("Bank");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(50, 200, 150, 30); 

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(152,210,192));
        panel.setBounds(0,0,250,500);
        frame.add(panel);
        panel.add(label);
    }
}
