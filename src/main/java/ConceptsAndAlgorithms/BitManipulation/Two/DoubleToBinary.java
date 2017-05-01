package ConceptsAndAlgorithms.BitManipulation.Two;

public class DoubleToBinary {
    public String convert(double doubleNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(".");
        for (int i = 1; i < 32; i++) {
            double deduct = 1.0 / (Math.pow(2.0, i));
            if (doubleNumber - deduct > 0) {
                doubleNumber -= deduct;
                stringBuilder.append("1");
            } else if (doubleNumber - deduct < 0) {
                stringBuilder.append("0");
            } else {
                stringBuilder.append("1");
                return stringBuilder.toString();
            }
        }
        return "ERROR";

    }

    public  String printBinary2(double num) {
        if (num >= 1 || num <= 0) {
            return "ERROR";
        }

        StringBuilder binary = new StringBuilder();
        double frac = 0.5;
        binary.append(".");
        while (num > 0) {
			/* Setting a limit on length: 32 characters */
            if (binary.length() >= 32) {
                return "ERROR";
            }
            if (num >= frac) {
                binary.append(1);
                num -= frac;
            } else {
                binary.append(0);
            }
            frac /= 2;
        }
        return binary.toString();
    }
}
