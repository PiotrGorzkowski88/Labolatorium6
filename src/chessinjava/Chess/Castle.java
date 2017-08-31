/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessinjava.Chess;

public class Castle extends Figure {

    @Override
    public Boolean canMove(Position position) {
        return position.getX() == this.getPosition().getX() || position.getY() == this.getPosition().getY();
    }

    @Override
    public String toString() {
        return "I am castle on position " + getPosition() + ".";
    }
}
