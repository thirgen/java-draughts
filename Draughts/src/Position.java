import java.io.Serializable;

public class Position implements Serializable{

    private int x;
    private int y;

    public Position(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Position: (" + getX() + "," + getY() + ")";
    }
}
