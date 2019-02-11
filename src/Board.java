import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener {
    private Ball blueBall;
    private Ball greenBall;
    private Timer timer;
    public Board(){
        setPreferredSize(new Dimension(800,600));
        blueBall = new Ball(25);
        greenBall = new Ball(25);
        timer = new Timer(10, this);
        timer.start();
    }
    public void init(){
        greenBall.setPosition(100,100);
        greenBall.setColor(Color.GREEN);
        blueBall.setPosition(160,100);
        blueBall.setColor(Color.BLUE);
    }
    public void paintComponent(Graphics g){
        g.setColor(Color.darkGray);
        g.fillRect(0,0,getWidth(),getHeight());
        greenBall.paint(g);
        blueBall.paint(g);
    }
    public void actionPerformed(ActionEvent e){
        greenBall.move();
        blueBall.move();
        if( Math.abs(Math.hypot(Math.abs(greenBall.getX() - blueBall.getX()), Math.abs(greenBall.getY() - blueBall.getY()))) <= ( blueBall.getR() + greenBall.getR() ) ){
            greenBall.checkCollisions(blueBall);
            blueBall.checkCollisions(greenBall);
        }
        repaint();
    }
}
