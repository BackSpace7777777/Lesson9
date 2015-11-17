package src.PenShapes;

import TurtleGraphics.Pen;
import java.awt.Graphics;

public class Wheel extends Circle implements InterfaceShape{
    private int spokes;
    private int degrees;
    public Wheel()
    {
        super();
    }
    public Wheel(int x,int y,int r, int spokes)
    {
        super(x,y,r);
        this.spokes=spokes;
        degrees=360/spokes;
    }
    public void draw(Pen p) {
        
    }
    public int getX() {
        return super.getX();
    }
    public int getY() {
        return super.getY();
    }
    
}
