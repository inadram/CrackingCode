package main.ConceptsAndAlgorithms.BitManipulation.Eight;

public class DrawLine {
    public byte[] horizontal(byte[] screen, int width, int x1, int x2, int y) {
       int preStart = x1%8;
        int fullHouseStart = (int) Math.ceil(x1 / 8);

       int fullHouseEnd = (int) Math.floor(x2 / 8);
       int postFinish =x2%8;
       if(postFinish==0) fullHouseEnd--;

        int bytePosition = (width / 8) * (y-1);
        for(int i =fullHouseStart;i<=fullHouseEnd;i++){
            screen[bytePosition +i] = (byte)0xff;
        }
        if ((x1/8) == (x2/8)) {
            screen[bytePosition + fullHouseStart] = (byte) ((0xff >> preStart) | (1 << postFinish) - 1);
        } else {
            if(x1%8!=0)screen[bytePosition + fullHouseStart - 1] = (byte) (0xff >> preStart);
            if(x2%8!=0)screen[bytePosition + fullHouseEnd + 1] = (byte) ((1 << postFinish) - 1);
        }
        return screen;
    }
}
