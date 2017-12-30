package eh223im_assign3;

public class Point {
    private int xPos = 0;
    private int yPos = 0;

    public Point () {
        xPos = 0;
        yPos = 0;
    }

    public Point (int x, int y) {
        xPos = x;
        yPos = y;
    }

    public String toString () {
        return "("+xPos+","+yPos+")";
    }

    public void move(int x, int y) {
        xPos += x;
        yPos += y;
    }

    public void moveToXY(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public boolean isEqualTo (Point sec) {
        return ((xPos == sec.xPos) && (yPos == sec.yPos));
    }

    public double distanceTo (Point sec) {
        return Math.sqrt(Math.pow(sec.xPos - xPos,2)+Math.pow(sec.yPos-yPos,2));
    }
}
