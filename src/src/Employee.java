package src;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import src.EmployeeObjects.Employe;
import src.EmployeeObjects.FullTime;
import src.EmployeeObjects.PartTime;

public class Employee extends Main{
    private JTextField eName,eRate,eHours;
    private JLabel ENL,ERL,EHL;
    private JRadioButton ft,pt;
    private JButton add,exit;
    private JPanel panel;
    private int mX,mY;
    private int eOffset=0;
    private Employe es[]=new Employe[10];
    private boolean mouseDown=false;
    public Employee()
    {
        for(int i=0;i<es.length;i++)es[i]=null;
        add=new JButton();
        add.setBounds(5,190,150,30);
        add.setText("Add");
        add.setVisible(false);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(es[eOffset]==null)
                {
                    if(ft.isSelected())
                    {
                        if(checkInputs())es[eOffset]=new FullTime(eName.getText(),Double.parseDouble(eHours.getText()),Double.parseDouble(eRate.getText()));
                    }
                    else
                    {
                        if(checkInputs())es[eOffset]=new PartTime(eName.getText(),Double.parseDouble(eHours.getText()),Double.parseDouble(eRate.getText()));
                    }
                    if(eOffset<=8)
                    eOffset++;
                    else
                    eOffset=0;
                }
                else
                {
                    try
                    {
                        es[eOffset].setName(eName.getText());
                        es[eOffset].setHours(Double.parseDouble(eHours.getText()));
                        es[eOffset].setRate(Double.parseDouble(eRate.getText()));
                    }   
                    catch(Exception ex)
                    {
                        
                    }
                }
            }
        });
        exit=new JButton();
        exit.setBounds(160,190,150,30);
        exit.setText("Exit");
        exit.setVisible(false);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        eName=new JTextField();
        eName.setBounds(160,40,150,30);
        eName.setVisible(false);
        eRate=new JTextField();
        eRate.setBounds(160,80,150,30);
        eRate.setVisible(false);
        eHours=new JTextField();
        eHours.setBounds(160,120,150,30);
        eHours.setVisible(false);
        ENL=new JLabel();
        ENL.setText("Employee Name:");
        ENL.setBounds(5,40,120,30);
        ENL.setVisible(false);
        ERL=new JLabel();
        ERL.setText("Employee Rate:");
        ERL.setBounds(5,80,120,30);
        ERL.setVisible(false);
        EHL=new JLabel();
        EHL.setText("Employee Hours:");
        EHL.setBounds(5,120,120,30);
        EHL.setVisible(false);
        ft=new JRadioButton();
        ft.setText("Full Time");
        ft.setBounds(5+50,160,100,25);
        ft.setVisible(false);
        ft.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pt.setSelected(false);
                ft.setSelected(true);
            }
        });
        ft.setSelected(true);
        pt=new JRadioButton();
        pt.setText("Part Time");
        pt.setBounds(105+50,160,100,25);
        pt.setVisible(false);
        pt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ft.setSelected(false);
                pt.setSelected(true);
            }
        });
        panel=new JPanel()
        {
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.clearRect(0,0,panel.getWidth(),panel.getHeight());
                g.setColor(new Color(100,100,0,100));
                g.fillRect(0,0,panel.getWidth(),panel.getHeight());
                boolean switchB=false;
                for(int i=0;i<panel.getHeight()/20;i++)
                {
                    if(switchB)
                    {
                        if(mY<(i*20) && mY>((i*20)-20) && mouseDown)
                        {
                            g.setColor(Color.GRAY);
                            eOffset=i;
                        }
                        else if(mY<(i*20) && mY>((i*20)-20))g.setColor(Color.GREEN);
                        else g.setColor(new Color(255,255,255,200));
                        g.fillRect(0,i*20,panel.getWidth(),20);
                        g.setColor(Color.BLACK);
                        try
                        {
                            g.drawString(es[i].getName(),5,i*20+15);
                            g.drawString(""+((FullTime)es[i].getActualPay()),50,i*20+15);
                        }
                        catch(NullPointerException ex){}
                        switchB=false;
                    }
                    else
                    {
                        
                        if(mY<(i*20) && mY>((i*20)-20) && mouseDown)
                        {
                            g.setColor(Color.GRAY);
                            eOffset=i;
                        }
                        else if(mY<(i*20) && mY>((i*20)-20))g.setColor(Color.GREEN);
                        else g.setColor(new Color(100,100,100,100));
                        g.fillRect(0,i*20,panel.getWidth(),20);
                        g.setColor(Color.BLACK);
                        try
                        {
                            g.drawString(es[i].getName(),5,i*20+15);
                        }
                        catch(NullPointerException ex){}
                        switchB=true;
                    }
                    System.out.println(eOffset);
                }
                repaint();
            }
        };
        panel.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                mX=e.getX()-20;
                mY=e.getY()-20;
            }
        });
        panel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if(mX!=-100&&mY!=-100)
                mouseDown=true;
            }
            public void mouseReleased(MouseEvent e) {
                mouseDown=false;
            }
            public void mouseExited(MouseEvent e){
                mX=-100;
                mY=-100;
            }
        });
        panel.setBounds(5,265,305,200);
        panel.setVisible(false);
        frame.add(panel);
        frame.add(exit);
        frame.add(add);
        frame.add(pt);
        frame.add(ft);
        frame.add(EHL);
        frame.add(ERL);
        frame.add(ENL);
        frame.add(eHours);
        frame.add(eRate);
        frame.add(eName);
    }
    private boolean checkInputs()
    {
        boolean out=true;
        if(eName.getText()=="")out=false;
        if(Double.parseDouble(eRate.getText())>30.50 || Double.parseDouble(eRate.getText())<6.75)out=false;
        if(Double.parseDouble(eHours.getText())>60 || Double.parseDouble(eHours.getText())<1)out=false;
        return out;
    }
    public void visible(boolean tf)
    {
        frame.setTitle("Lesson 9 - Employee");
        frame.setSize(320,550);
        eName.setVisible(tf);
        eRate.setVisible(tf);
        eHours.setVisible(tf);
        ENL.setVisible(tf);
        ERL.setVisible(tf);
        EHL.setVisible(tf);
        ft.setVisible(tf);
        pt.setVisible(tf);
        add.setVisible(tf);
        exit.setVisible(tf);
        panel.setVisible(tf);
    }
}
