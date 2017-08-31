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
public class Bishop extends Figure {

    @Override
    public Boolean canMove(Position position) {
        Position checkedPosition = this.getPosition().copy();
            while(checkedPosition.getX() < 8 && checkedPosition.getY() < 8)
            {
                checkedPosition.incX();
                checkedPosition.incY();
                if (position.equals(checkedPosition))
                    return true;
            }

            checkedPosition = this.getPosition().copy();
            while(checkedPosition.getX() >= 0 && checkedPosition.getY() < 8)
            {
                checkedPosition.decX();
                checkedPosition.incY();
                if (position.equals(checkedPosition))
                    return true;
            }

            checkedPosition = this.getPosition().copy();
            while (checkedPosition.getX() < 8 && checkedPosition.getY() >= 0)
            {
                checkedPosition.incX();
                checkedPosition.decY();
                if (position.equals(checkedPosition))
                    return true;
            }

            checkedPosition = this.getPosition().copy();
            while (checkedPosition.getX() >= 0 && checkedPosition.getY() >= 0)
            {
                checkedPosition.decX();
                checkedPosition.decY();
                if (position.equals(checkedPosition))
                    return true;
            }

            return false;
    }

    @Override
    public String toString() {
        return "I am bishop on position " + getPosition() + ".";
    }
    
    
}
