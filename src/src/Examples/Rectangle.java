package src.Examples;

import TurtleGraphics.Pen;

public class Rectangle implements Shape{
    private double x,y,w,h;
    public Rectangle()
    {
        this(0,0,1,1);
    }
    public Rectangle(double a,double b, double c, double d)
    {
        x=a;
        y=b;
        w=c;
        h=d;
    }
    public double area() {
        return w*h;
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
