import  ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Nine.ChessQueen;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ChessQueenTest {

    @Test
    public void find_all_possible_position(){
        ChessQueen chessQueen= new ChessQueen(8);
        chessQueen.find(new ArrayList<Point>(),0,0);
        assertEquals(92, chessQueen.find(new ArrayList<Point>(), 0, 0));
    }

}