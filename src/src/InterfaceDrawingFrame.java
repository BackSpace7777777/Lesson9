package src;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import src.PenShapes.Circle;
import src.PenShapes.InterfaceShape;
import src.PenShapes.Rectangle;
import src.PenShapes.Triangle;
import src.PenShapes.Wheel;

public class InterfaceDrawingFrame extends Main{
    private JButton dC,dW,dR,dT;
    private JTextField x,y,w,h;
    private JPanel panel;
    private InterfaceShape shape;
    public InterfaceDrawingFrame()
    {
        dC=new JButton();
        dC.setBounds(5,40,150,30);
        dC.setText("Circle");
        dC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                shape=new Circle();
            }
        });
        dC.setVisible(false);
        dW=new JButton();
        dW.setBounds(160,40,150,30);
        dW.setText("Wheel");
        dW.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                shape=new Wheel(5,5,100,6);
            }
        });
        dW.setVisible(false);
        dR=new JButton();
        dR.setBounds(315,40,150,30);
        dR.setText("Rectangle");
        dR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                shape=new Rectangle();
            }
        });
        dR.setVisible(false);
        dT=new JButton();
        dT.setBounds(315+150+5,40,150,30);
        dT.setText("Triangle");
        dT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                shape=new Triangle();
            }
        });
        dT.setVisible(false);
        panel=new JPanel()
        {
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.clearRect(0,0,panel.getWidth(),panel.getHeight());
                g.setColor(Color.BLACK);
                try
                {
                    shape.draw(g);
                }
                catch(NullPointerException ex){}
                repaint();
            }
        };
        panel.setBounds(5,120,400,400);
        panel.setVisible(false);
        frame.add(panel);
        frame.add(dT);
        frame.add(dR);
        frame.add(dW);
        frame.add(dC);
    }
    public void visible(boolean tf)
    {
        frame.setSize(640,640);
        frame.setTitle("Lesson 9 - Interface Drawing");
        dC.setVisible(tf);
        dW.setVisible(tf);
        dR.setVisible(tf);
        dT.setVisible(tf);
        panel.setVisible(tf);
    }
}
