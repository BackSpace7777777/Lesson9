package src.PenShapes;

import java.awt.Graphics;

public interface InterfaceShape {
    public void draw(Graphics g);
    public int getX();
    public int getY();
    public double getArea();
    public void setX(int x);
    public void setY(int y);
}
