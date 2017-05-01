package Moderate.Seven;

import java.util.HashMap;
import java.util.Map;

public class Alphabet {
    Map<Integer, String> onesStringMap = new HashMap<Integer, String>();
    Map<Integer, String> tensStringMap = new HashMap<Integer, String>();
    Map<Integer, String> teensStringMap = new HashMap<Integer, String>();
    Map<Integer, String> threeDigitMap = new HashMap<Integer, String>();

    public Alphabet() {
        onesStringMap.put(0, "");
        onesStringMap.put(1, " one");
        onesStringMap.put(2, " two");
        onesStringMap.put(3, " three");
        onesStringMap.put(4, " four");
        onesStringMap.put(5, " five");
        onesStringMap.put(6, " six");
        onesStringMap.put(7, " seven");
        onesStringMap.put(8, " eight");
        onesStringMap.put(9, " nine");
        teensStringMap.put(10, " ten");
        teensStringMap.put(11, " eleven");
        teensStringMap.put(12, " twelve");
        teensStringMap.put(13, " thirteen");
        teensStringMap.put(14, " fourteen");
        teensStringMap.put(15, " fifteen");
        teensStringMap.put(16, " sixteen");
        teensStringMap.put(17, " seventeen");
        teensStringMap.put(18, " eighteen");
        teensStringMap.put(19, " nineteen");
        tensStringMap.put(0, "");
        tensStringMap.put(2, " twenty");
        tensStringMap.put(3, " thirty");
        tensStringMap.put(4, " forty");
        tensStringMap.put(5, " fifty");
        tensStringMap.put(6, " sixty");
        tensStringMap.put(7, " seventy");
        tensStringMap.put(8, " eighty");
        tensStringMap.put(9, " ninety");

        threeDigitMap.put(0, "");
        threeDigitMap.put(1, " thousand");
        threeDigitMap.put(2, " million");
        threeDigitMap.put(3, " billion");
    }

    public String convert(int number) {
        int[] threeDigitArray = convertTo3DigitArray(number);
        return convertToAlphabet(threeDigitArray);
    }

    private String convertToAlphabet(int[] threeDigitArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = threeDigitArray.length - 1; i >= 0; i--) {
            String threeDigit = convertThreeDigitToString(threeDigitArray[i]);
            stringBuilder.append(threeDigit);
            stringBuilder.append(threeDigitMap.get(i));
        }
        return stringBuilder.toString();
    }

    private String convertThreeDigitToString(int number) {
        convertHundreds(number);
        return hundredInString + tensInString + onesInString;
    }


    String hundredInString;
    String tensInString;
    String onesInString;

    private void convertHundreds(int number) {
        hundredInString = onesStringMap.get(number / 100) + " hundred and";
        int tens = number % 100;
        if (tens < 20 && tens > 9) {
            convertTeens(tens);
        } else {
            convertTens(tens);
        }

    }

    private void convertTeens(int tens) {
        tensInString = teensStringMap.get(tens);
    }

    private void convertTens(int tens) {
        tensInString = tensStringMap.get(tens/10);
        convertOnes(tens % 10);
    }

    private void convertOnes(int ones) {
        onesInString = onesStringMap.get(ones);
    }


    private int[] convertTo3DigitArray(int number) {
        int length = String.valueOf(number).length() / 3;
        int[] arr = new int[length];
        int index = 0;
        while (number > 0) {
            arr[index] = number % 1000;
            number /= 1000;
            index += 1;
        }
        return arr;
    }
}
