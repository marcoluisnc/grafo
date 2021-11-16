import java.awt.Graphics;
public class Nodo {
    
    private int x,y;
    private String name;
    public static final int d = 60;

    public Nodo(int x,int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }
    public void pintar(Graphics g){
        g.drawOval(this.x - d/2, this.y - d/2, d, d);
        g.drawString(name, x, y);
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
}
