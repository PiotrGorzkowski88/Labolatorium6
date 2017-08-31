/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessinjava.Chess;

/**
 *
 * @author CelNamierzony
 */
public abstract class Figure {
    private Position position = new Position();
    private ChessColor chessColor;

    public Figure() {
    }

    public Figure(ChessColor chessColor, Position position) {
        this.chessColor = chessColor;
        this.position = position;
    }
    
    public abstract Boolean canMove(Position position);

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public ChessColor getChessColor() {
        return chessColor;
    }

    public void setChessColor(ChessColor chessColor) {
        this.chessColor = chessColor;
    }
}
