package main.ConceptsAndAlgorithms.RecursionAndDynamicProgramming.Ten;

public class TheBox {
    public int height;
    public int width;
    public int depth;
    public TheBox(int height,int width,int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public boolean canBeAbove(TheBox b) {
        return b == null || width < b.width && height < b.height && depth < b.depth;
    }
}
