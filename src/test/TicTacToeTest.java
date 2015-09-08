package test;

import main.Moderate.Two.TicTacToe;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TicTacToeTest{

    @Test
    public void test_some_one_win_tic_tac_toe(){
        int[][] game = new int[][]{{1,0,1},{1,1,0},{1,0,0}};
        TicTacToe ticTacToe = new TicTacToe(game);
        assertTrue(ticTacToe.isXWin());
        assertFalse(ticTacToe.isOWin());
    }

}