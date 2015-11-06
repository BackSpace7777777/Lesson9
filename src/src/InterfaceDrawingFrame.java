package src;

import javax.swing.JButton;

public class InterfaceDrawingFrame extends Main{
    private JButton dC,dW,dR,dT;
    public InterfaceDrawingFrame()
    {
        dC=new JButton();
        dC.setBounds(5,40,150,30);
        dC.setText("Circle");
        dC.setVisible(false);
        dW=new JButton();
        dW.setBounds(160,40,150,30);
        dW.setText("Wheel");
        dW.setVisible(false);
        dR=new JButton();
        dR.setBounds(315,40,150,30);
        dR.setText("Rectangle");
        dR.setVisible(false);
        dT=new JButton();
        dT.setBounds(315+150+5,40,150,30);
        dT.setText("Triangle");
        dT.setVisible(false);
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
    }
}
