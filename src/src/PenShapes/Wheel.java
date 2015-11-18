package src.PenShapes;

import TurtleGraphics.Pen;
import java.awt.Color;

public class Wheel extends Circle implements InterfaceShape{
    private int spokes;
    private double degrees;
    public Wheel()
    {
        this(5,5,50,3);
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
        System.out.println("Drew Wheel");
    }
    public int getX() {
        return super.getX();
    }
    public int getY() {
        return super.getY();
    }
    
}
