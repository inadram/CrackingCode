package main.ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Ten;

import java.util.ArrayList;

public class CreateStack {
    public  int stackHeight(ArrayList<TheBox> theBoxes) {
        if (theBoxes == null) {
            return 0;
        }
        int h = 0;
        for (TheBox b : theBoxes) {
            h += b.height;
        }
        return h;
    }

    public  ArrayList<TheBox> createStackR(TheBox[] theBoxes, TheBox bottom) {
        int max_height = 0;
        ArrayList<TheBox> max_stack = null;
        for (TheBox theBox : theBoxes) {
            if (theBox.canBeAbove(bottom)) {
                ArrayList<TheBox> new_stack = createStackR(theBoxes, theBox);
                int new_height = stackHeight(new_stack);
                if (new_height > max_height) {
                    max_stack = new_stack;
                    max_height = new_height;
                }
            }
        }

        if (max_stack == null) {
            max_stack = new ArrayList<TheBox>();
        }
        if (bottom != null) {
            max_stack.add(0, bottom);
        }

        return max_stack;
    }


}
