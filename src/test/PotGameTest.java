package test;

import main.Questions.ID15422849.PotGame;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PotGameTest {

    @Test
    public void test_if_player_a_get_more_coin(){
        PotGame potGame = new PotGame();
        ArrayList<Integer> pots = new ArrayList<Integer>();
        pots.add(4);    //A    //A
        pots.add(3);    //B    //B
        pots.add(1);    //A    //B
        pots.add(2);    //B    //A
        pots.add(8);    //A    //B
        pots.add(5);    //B    //A
       assertEquals(13, potGame.max_coin(pots, 0, pots.size() - 1));
    }

}