package game;

import javax.swing.JFrame;

public class MainClass {
    public static void main(String[] args){
        Board b = new Board();
        b.setVisible(true);
        b.setResizable(false);
        b.setTitle("MIU-46 Tic Tac Toe");
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
