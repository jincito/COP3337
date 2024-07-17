/*  Name: Jin Carballosa
 *  Programming Assignment #: 2
 *  COP3337 UHAC 1245
 *  Professor Kianoosh G. Boroojeni, Ph.D.
 */

package util;

import java.util.ArrayList;

public class Piece {
    protected boolean color;

    public Piece(String color){
        this.color = color.toLowerCase().startsWith("b");
    }

    public boolean getColor(){
        return color;
    }

    @Override
    public String toString(){
        return color ?("" + '\u25C9'):(""+'\u25CE');
    }

    public boolean isLegalMove(int from, int to, int die, ArrayList<Piece>[] board){
//write the rules that make a generic piece move legally on the given board
//moving from src "from" to dst "to" using "die"
        if (from == 0){ // captured piece moving into board
            if(!color){ //black
                if (die + to != 25)
                    return false;
            } else { //white
                if (die != to)
                    return false;
            }
                if (board[to].size() != 0 && board[to].get(0).color != color)
                    return board[to].size() == 1;
                return true;
            }
        int diff = Math.abs(from - to); //absolute value to find the positive value difference
        if (die != diff)
            return false; //jump is either too long or too short
        if (from > to && color) //black piece is moving towards the smaller indices...illegal
            return false;
        if (from < to && !color) //white piece is moving towards the larger indices...illegal
            return false;
        ArrayList<Piece> destination = board[to];
        if (destination.size() > 0 && destination.get(0).color != color)
            return destination.size() == 1;
        return true;
    }
}
