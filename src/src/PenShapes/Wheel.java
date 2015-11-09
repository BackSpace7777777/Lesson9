package src.PenShapes;

import java.awt.Graphics;

public class Wheel extends Circle implements InterfaceShape{
    private int spokes;
    public Wheel()
    {
        super();
    }
    public Wheel(int x,int y,int r, int spokes)
    {
        super(x,y,r);
        this.spokes=spokes;
    }
    public void draw(Graphics g) {
        super.draw(g);
        
    }
    public int getX() {
        return super.getX();
    }
    public int getY() {
        return super.getY();
    }
    
}
