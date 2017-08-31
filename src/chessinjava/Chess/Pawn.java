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
public class Pawn  extends Figure {

    @Override
    public Boolean canMove(Position position) {
        int deltaY = position.getY() - this.getPosition().getY();

        if(position.getX() != this.getPosition().getX())
        {
            return false;
        }

        if(this.getChessColor() == ChessColor.BLACK && deltaY == -1)
        {
            return true;
        }

        if (this.getChessColor() == ChessColor.WHITE && deltaY == 1)
        {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "I am pawn on position " + getPosition() + ".";
    }
    
    
}
