package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
    public static JFrame frame=new JFrame();
    private static InterfaceDrawingFrame idf;
    private static JButton mainMenu,interfaceD;
    public static void main(String[] args) {
        frame.setSize(375,200);
        frame.setTitle("Lesson 9 - Main Menu");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);
        mainMenu=new JButton();
        mainMenu.setBounds(5,5,150,30);
        mainMenu.setText("Main Menu");
        mainMenu.setVisible(false);
        mainMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuVisible(true);
            }
        });
        interfaceD=new JButton();
        interfaceD.setBounds(5,5,150,30);
        interfaceD.setText("Interface Drawing");
        interfaceD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuVisible(false);
                idf.visible(true);
            }
        });
        idf=new InterfaceDrawingFrame();
        frame.add(interfaceD);
        frame.add(mainMenu);
        frame.setVisible(true);
    }
    private static void menuVisible(boolean tf)
    {
        idf.visible(false);
        frame.setTitle("Lesson - 9 Main Menu");
        frame.setSize(375,200);
        mainMenu.setVisible(false);
        if(tf==false)mainMenu.setVisible(true);
        interfaceD.setVisible(tf);
    }
}