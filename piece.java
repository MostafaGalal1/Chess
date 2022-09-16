import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class bishop extends piece
{
    public bishop(int x, int y)
    {
        super(x, y);
    }

    public bishop(int xx, int yy, color c){super(xx, yy, c);}

    @Override
    public List<Point> getvalid(int x1, int y1)
    {
        List<Point> list = new ArrayList<>();

        for (int i = 1; i <= 8; i++)
        {
            int x2 = x1 + i, y2 = y1 + i;
            if (!square.isvalid_square(x2, y2)) break;

            if (board.chess[x2][y2].ispieace())
            {
                if (((piece) board.chess[x2][y2]).piece_color != this.piece_color)
                    list.add(new Point(x2, y2));
                break;
            }

            list.add(new Point(x2, y2));
        }

        for (int i = 1; i <= 8; i++)
        {
            int x2 = x1 + i, y2 = y1 - i;
            if (!square.isvalid_square(x2, y2)) break;

            if (board.chess[x2][y2].ispieace())
            {
                if (((piece) board.chess[x2][y2]).piece_color != this.piece_color)
                    list.add(new Point(x2, y2));
                break;
            }

            list.add(new Point(x2, y2));
        }

        for (int i = 1; i <= 8; i++)
        {
            int x2 = x1 - i, y2 = y1 + i;
            if (!square.isvalid_square(x2, y2)) break;

            if (board.chess[x2][y2].ispieace())
            {
                if (((piece) board.chess[x2][y2]).piece_color != this.piece_color)
                    list.add(new Point(x2, y2));
                break;
            }

            list.add(new Point(x2, y2));
        }

        for (int i = 1; i <= 8; i++)
        {
            int x2 = x1 - i, y2 = y1 - i;
            if (!square.isvalid_square(x2, y2)) break;

            if (board.chess[x2][y2].ispieace())
            {
                if (((piece) board.chess[x2][y2]).piece_color != this.piece_color)
                    list.add(new Point(x2, y2));
                break;
            }

            list.add(new Point(x2, y2));
        }

        return list;
    }
}
