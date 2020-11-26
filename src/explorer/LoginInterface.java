package explorer;

import javax.swing.*;

public class LoginInterface {
    private JLabel userLabel;
    private JTextField userTF;
    private JLabel passLabel;
    private JPasswordField passwordTF;
    private JButton logInButton;
    private JPanel jPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("LoginInterface");
        frame.setContentPane(new LoginInterface().jPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
