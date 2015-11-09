package src.PenShapes;

import java.awt.Graphics;

public class Circle implements InterfaceShape{
    private int x,y,radius;
    public Circle()
    {
        this(5,5,10);
    }
    public Circle(int x,int y,int r)
    {
        this.x=x;
        this.y=y;
        radius=r;
    }
    public void draw(Graphics g) {
        g.drawOval(x, y, radius, radius);
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
