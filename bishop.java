import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class bishop extends piece
{
    public bishop(int x, int y)
    {
        super(x, y);
    }

    @Override
    public List<Point> getvalid(int x1, int y1)
    {
        List<Point> list = new ArrayList<>();
        for (int i = -8; i <= 8; i++)
        {
            int x2 = x1 + i, y2 = y1 + i;
            if (x2 <= 7 && x2 >= 0 && y1 <= 7 && y1 >= 0 )
                list.add(new Point(x2, y2));
        }
        for (int i = -8; i <= 8; i++)
        {
            int x2 = x1 + i, y2 = y1 - i;
            if (x2 <= 7 && x2 >= 0 && y1 <= 7 && y1 >= 0 )
                list.add(new Point(x2, y2));
        }

        return list;
    }
}
