/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessinjava;

import chessinjava.Chess.Bishop;
import chessinjava.Chess.Castle;
import chessinjava.Chess.ChessColor;
import chessinjava.Chess.Figure;
import chessinjava.Chess.King;
import chessinjava.Chess.Pawn;
import chessinjava.Chess.Position;

/**
 *
 * @author CelNamierzony
 */
public class ChessInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Making figures
        Figure figure1 = new Pawn();
        figure1.setChessColor(ChessColor.BLACK);
        figure1.setPosition(new Position(1,4));

        Figure figure2 = new Pawn();
        figure2.setChessColor(ChessColor.WHITE);
        figure2.setPosition(new Position(3, 4));

        Figure figure3 = new King();
        figure3.setChessColor(ChessColor.BLACK);
        figure3.setPosition(new Position(5, 4));

        Figure figure4 = new Bishop();
        figure4.setChessColor(ChessColor.WHITE);
        figure4.setPosition(new Position(5, 5));

        Figure figure5 = new Castle();
        figure5.setChessColor(ChessColor.WHITE);
        figure5.setPosition(new Position(3, 7));

        //Write figures to string
        System.out.println(figure1);
        System.out.println(figure2);
        System.out.println(figure3);
        System.out.println(figure4);
        System.out.println(figure5);
        
        //Checking movement
        System.out.println("Figure1 can move " + figure1.canMove(new Position(figure1.getPosition().getX(), figure1.getPosition().getY() + 1)));
        System.out.println("Figure1 can move " + figure1.canMove(new Position(figure1.getPosition().getX(), figure1.getPosition().getY() - 1)));

        System.out.println("Figure2 can move " + figure2.canMove(new Position(figure2.getPosition().getX(), figure2.getPosition().getY() + 1)));
        System.out.println("Figure2 can move " + figure2.canMove(new Position(figure2.getPosition().getX(), figure2.getPosition().getY() - 1)));

        System.out.println("Figure3 can move " + figure3.canMove(new Position(figure3.getPosition().getX() + 1, figure3.getPosition().getY() + 1)));
        System.out.println("Figure3 can move " + figure3.canMove(new Position(figure3.getPosition().getX(), figure3.getPosition().getY() - 2)));

        System.out.println("Figure4 can move " + figure4.canMove(new Position(figure4.getPosition().getX() + 1, figure4.getPosition().getY() + 1)));
        System.out.println("Figure4 can move " + figure4.canMove(new Position(figure4.getPosition().getX() + 1, figure4.getPosition().getY() + 2)));

        System.out.println("Figure5 can move " + figure5.canMove(new Position(figure5.getPosition().getX(), figure5.getPosition().getY() - 1)));
        System.out.println("Figure5 can move " + figure5.canMove(new Position(figure5.getPosition().getX() - 1, figure5.getPosition().getY() - 1)));
    }
    
}
