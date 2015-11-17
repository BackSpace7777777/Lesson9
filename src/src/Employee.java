package src;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Employee extends Main{
    private JTextField eName,eRate,eHours;
    private JLabel ENL,ERL,EHL;
    private JRadioButton ft,pt;
    private JButton add,exit;
    private JPanel panel;
    private int mX,mY;
    private boolean mouseDown=false;
    public Employee()
    {
        add=new JButton();
        add.setBounds(5,230,150,30);
        add.setText("Add");
        add.setVisible(false);
        exit=new JButton();
        exit.setBounds(160,230,150,30);
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
        ft.setBounds(5+50,200,100,25);
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
        pt.setBounds(105+50,200,100,25);
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
                for(int i=1;i<200/20;i+=2)
                {
                    g.setColor(new Color(255,255,255,200));
                    g.fillRect(0,i*20,panel.getWidth(),20);
                }
                repaint();
            }
        };
        panel.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                mX=e.getX();
                mY=e.getY();
            }
        });
        panel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                mouseDown=true;
            }
            public void mouseReleased(MouseEvent e) {
                mouseDown=false;
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
    public void visible(boolean tf)
    {
        frame.setTitle("Lesson 9 - Employee");
        frame.setSize(320,500);
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
