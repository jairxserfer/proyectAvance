package explorer;

import javax.swing.*;
import java.awt.*;
import java.security.DigestException;
import javax.swing.ImageIcon;

public class Desktop {
    private JButton startButton;
    private JComboBox optionsB;
    private JPanel desktop;
    private JButton fileExplorerButton;
    private JButton youtubeButton;
    private JButton calcButton;
    private JPanel jPanel;
    private JPanel jBotonesInicio;
    private JPanel jBarraHerramientas;
    private JPanel jBackground;


    ImageIcon iconobtnYT = new ImageIcon(new ImageIcon("src/images/youtube-app-icon-png-3.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
    ImageIcon iconobtnFE = new ImageIcon(new ImageIcon("src/images/File-Explorer-fluent-icon.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
    ImageIcon iconobtnCALC = new ImageIcon(new ImageIcon("src/images/calc.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));

    public static void main(String[] args) {
        JFrame frame = new JFrame("Desktop");
        frame.setContentPane(new Desktop().jPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(new Dimension(800,600));
        frame.setVisible(true);


    }

    public Desktop(){
        botones();
    }

    public void botones(){
        //BOTON YOUTUBE
        youtubeButton.setIcon(iconobtnYT);
        youtubeButton.setIconTextGap(2);
        youtubeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        youtubeButton.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        youtubeButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        youtubeButton.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        youtubeButton.setPreferredSize(new Dimension(20,20));

        //BOTON EXPLORADOR
        fileExplorerButton.setIcon(iconobtnFE);
        fileExplorerButton.setIconTextGap(2);
        fileExplorerButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fileExplorerButton.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        fileExplorerButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        fileExplorerButton.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        fileExplorerButton.setPreferredSize(new Dimension(20,20));

        //BOTON CALCULADORA
        calcButton.setIcon(iconobtnCALC);
        calcButton.setIconTextGap(2);
        calcButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calcButton.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        calcButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        calcButton.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        calcButton.setPreferredSize(new Dimension(20,20));
    }



}
