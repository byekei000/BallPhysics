import javax.swing.*;

public class BallPhysics extends JFrame{
    public BallPhysics(){
        setTitle("BallPhysics");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        Board board = new Board();
        add(board);
        pack();
        setLocationRelativeTo(null);
        board.init();
    }
    public static void main(String[] args){
        new BallPhysics();
    }
}
