import java.awt.*;

public class Ball {
    private int x, y, r;
    private int m = 1;
    private int theta;
    private int xSpd = 0;
    private int ySpd = 0;
    private Color color;
    public Ball(int r){
        this.r = r;
    }
    public void move(){
        x += xSpd;
        y += ySpd;
    }
    public void checkCollisions(Ball ball){

    }
    public void setPosition(int x, int y){
        this.x = x-r;
        this.y = y-r;
    }
    public void paint(Graphics g){
        g.setColor(color);
        g.fillOval(x,y,r*2,r*2);
    }
    public void setColor(Color color){
        this.color = color;
    }
    public int getX() {
        return x+r;
    }
    public int getY() {
        return y+r;
    }
    public int getR() {
        return r;
    }
}
