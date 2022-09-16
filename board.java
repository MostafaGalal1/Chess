public class board
{
    public static square[][] chess;

    public board()
    {
        chess = new piece[8][8];
    }

    public static void make_move(int x1, int y1, int x2, int y2)
    {
        board.chess[x2][y2] = board.chess[x1][y1];
        board.chess[x1][y1] = new emptypiece();
    }
}
