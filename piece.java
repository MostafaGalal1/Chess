import java.awt.*;
import java.util.List;

public  class piece extends square
{
    public piece(int xx, int yy) {
        this.x = xx;
        this.y = yy;
    }

    public List<Point> getvalid(int x1, int y1)
    {
        return null;
    }


    public boolean ispiece()
    {
        return true;
    }

    // public color getcolor     return this.color

    public void move()
    {
        System.out.println("move piece");
    }


}

enum color
{
    white, black
}



