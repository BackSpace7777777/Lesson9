package src.PenShapes;

import java.awt.Graphics;

public class Rectangle implements InterfaceShape{
    private int x,y,w,h;
    public Rectangle()
    {
        this(5,5,100,25);
    }
    public Rectangle(int x,int y,int w,int h)
    {
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
    }
    public void draw(Graphics g) {
        g.drawRect(x,y,w,h);
    }
    public int getX() {
        return y;
    }
    public int getY() {
        return x;
    }
    public double getArea() {
        return w*h;
    }
    public void setX(int x) {
        this.x=x;
    }
    public void setY(int y) {
        this.y=y;
    }
    
}
