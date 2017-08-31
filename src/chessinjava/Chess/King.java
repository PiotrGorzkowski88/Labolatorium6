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
public class King extends Figure {

    @Override
    public Boolean canMove(Position position) {
        int deltaX = Math.abs(position.getX() - this.getPosition().getX());
        int deltaY = Math.abs(position.getY() - this.getPosition().getY());

        if ((deltaX == 1) && (deltaY == 1))
            return true;

        if ((deltaX == 1) && (position.getY() == this.getPosition().getY()))
            return true;

        if ((deltaY == 1) && (position.getX() == this.getPosition().getX()))
            return true;

        return false;
    }

    @Override
    public String toString() {
        return "I am pawn on position " + this.getPosition() + ".";
    }
}
