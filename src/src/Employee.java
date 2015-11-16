package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Employee extends Main{
    private JTextField eName,eRate,eHours;
    private JLabel ENL,ERL,EHL;
    private JRadioButton ft,pt;
    private JButton add,exit;
    public Employee()
    {
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
    }
}
