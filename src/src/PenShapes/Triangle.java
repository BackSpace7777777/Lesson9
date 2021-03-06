package src.PenShapes;

import java.awt.Graphics;

public class Triangle implements InterfaceShape{
    private int x,y,b,h;
    public Triangle()
    {
        this(5,200,100,100);
    }
    public Triangle(int x,int y,int b,int h)
    {
        this.x=x;
        this.y=y;
        this.b=b;
        this.h=h;
    }
    public void draw(Graphics g) {
        g.drawLine(x,y,x+b,y);
        g.drawLine(x,y,x+(b/2),y-h);
        g.drawLine(x+(b/2),y-h,x+b,y);
    }
    public int getX() {
        return y;
    }
    public int getY() {
        return x;
    }
    public double getArea() {
        return ((b*h)/2);
    }
    public void setX(int x) {
        this.x=x;
    }
    public void setY(int y) {
        this.y=y;
    }
}
