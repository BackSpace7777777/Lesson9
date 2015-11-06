package src;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class InterfaceDrawingFrame extends Main{
    private JButton dC,dW,dR,dT;
    private JPanel panel;
    private byte shape=0;
    public InterfaceDrawingFrame()
    {
        dC=new JButton();
        dC.setBounds(5,40,150,30);
        dC.setText("Circle");
        dC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                shape=1;
            }
        });
        dC.setVisible(false);
        dW=new JButton();
        dW.setBounds(160,40,150,30);
        dW.setText("Wheel");
        dW.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                shape=2;
            }
        });
        dW.setVisible(false);
        dR=new JButton();
        dR.setBounds(315,40,150,30);
        dR.setText("Rectangle");
        dR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                shape=3;
            }
        });
        dR.setVisible(false);
        dT=new JButton();
        dT.setBounds(315+150+5,40,150,30);
        dT.setText("Triangle");
        dT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                shape=4;
            }
        });
        dT.setVisible(false);
        panel=new JPanel()
        {
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.clearRect(0,0,panel.getWidth(),panel.getHeight());
                if(shape==1)
                {
                    
                }
                else if(shape==2)
                {
                    
                }
                else if(shape==3)
                {
                    
                }
                else if(shape==4)
                {
                    
                }
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
