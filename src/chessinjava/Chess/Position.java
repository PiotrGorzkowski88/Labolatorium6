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
public class Position {
    private int x;
    private int y;

    public Position() {
        
    }
    
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Position copy() {
        return new Position(x, y);
    }

    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void incX() {
        x++;
    }
    
    public void decX() {
        x--;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void incY() {
        y++;
    }
    
    public void decY() {
        y--;
    }

    @Override
    public String toString() {
        return x + ", " + y;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.x;
        hash = 29 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Position other = (Position) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }
}
