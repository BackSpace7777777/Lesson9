package src.PenShapes;

import TurtleGraphics.Pen;
import java.awt.Color;

public class Wheel extends Circle implements InterfaceShape{
    private int spokes;
    private double degrees;
    public Wheel()
    {
        this(5,5,50,5);
    }
    public Wheel(int x,int y,int r, int spokes)
    {
        super(x,y,r);
        this.spokes=spokes;
        degrees=360/spokes;
    }
    public void draw(Pen p) {
        p.setColor(Color.GREEN);
        p.up();
        p.move(super.getX(),super.getY());
        for(int i=0;i<spokes;i++)
        {
            p.down();
            p.setDirection(i*degrees);
            p.move(super.getRadius());
            p.up();
            p.move(super.getX(),super.getY());
        }
        p.up();
        p.move(x+5,y+radius);
        p.setDirection(180);
        p.down();
        double circum=radius/3.141592653589793;
        for(int i=0;i<500;i++)
        {
            p.move(circum/3.14);
            p.turn(5.5);
        }
        System.out.println("Drew Wheel");
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    
}
