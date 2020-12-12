package explorer;

import javax.swing.*;
import java.awt.*;

public class LoginInterface {
    private JLabel userLabel;
    private JTextField userTF;
    private JLabel passLabel;
    private JPasswordField passwordTF;
    private JButton logInButton;
    private JPanel jPanel;
    private JLabel javaOSLabel;
    private JButton soLogoButton;

    ImageIcon iconobtnSO = new ImageIcon(new ImageIcon("src/images/so-logo.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));

    public static void main(String[] args) {
        JFrame frame = new JFrame("LoginInterface");
        frame.setContentPane(new LoginInterface().jPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(new Dimension(800,600));
        frame.setVisible(true);
    }

    public LoginInterface(){
        boton();
    }

    public void boton() {
        //BOTON YOUTUBE
        soLogoButton.setIcon(iconobtnSO);
        soLogoButton.setIconTextGap(2);
        soLogoButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soLogoButton.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        soLogoButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        soLogoButton.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        soLogoButton.setPreferredSize(new Dimension(20, 20));
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        userLabel.setPreferredSize(new Dimension(-1,-1));
        userLabel.setHorizontalAlignment(SwingConstants.RIGHT);

        passLabel.setPreferredSize(new Dimension(-1,-1));
        passLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    }
}
