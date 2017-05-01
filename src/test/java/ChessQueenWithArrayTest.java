import  ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Nine.ChessQueenWithArray;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ChessQueenWithArrayTest {

    @Test
    public void find_all_possible_position(){
        ChessQueenWithArray chessQueen= new ChessQueenWithArray();
        ArrayList<Integer[]> results = new ArrayList<Integer[]>();
        Integer[] columns = new Integer[8];
        chessQueen.placeQueens(0, columns, results);
        assertEquals(92, results.size());
    }

}