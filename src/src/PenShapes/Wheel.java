package src.PenShapes;

import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public void draw(Graphics g) {
        super.draw(g);
        for(int i=0;i<spokes;i++)
        {
            //g.drawLine(super.getX()+super.getRadius()/2,super.getY()+super.getRadius()/2,super.getX()+super.getRadius()/2,super.getY());
            
        }
    }
    public int getX() {
        return super.getX();
    }
    public int getY() {
        return super.getY();
    }
    
}
