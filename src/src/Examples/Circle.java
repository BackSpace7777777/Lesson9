package src.Examples;

import TurtleGraphics.Pen;

public class Circle implements Shape{
    private double x,y,r;
    public Circle()
    {
        this(0,0,1);
    }
    public Circle(double a,double b,double c)
    {
        x=a;
        y=b;
        r=c;
    }
    public double area() {
        return Math.PI *r*r;
    }
    public void area(Pen p) {
        
    }
    public double getXPos() {
        return x;
    }
    public double getYPos() {
        return y;
    }
    public void move(double xPos, double yPos) {
        x=xPos;
        y=yPos;
    }

    @Override
    public void stretchBy(double factor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
