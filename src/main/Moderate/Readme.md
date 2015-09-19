1.  Write a function to swap a number in place (that is, without temporary variables). [[one][101]]
2.  Design an algorithm to figure out if someone has won a game of tic-tac-toe.[[two][102]]
3.  Write an algorithm which computes the number of trailing zeros in n factorial.[[three][103]]
4.  Write a method which finds the maximum of two numbers. You should not use if-else or any other comparison operator.[[four][104]]
5.  The Game of Master Mind is played as follows:
    The computer has four slots, and each slot will contain a ball that is red (R), yellow (Y), green (C) or blue (B). For example, the computer might have RGGB (Slot # 1isred, Slots #2 and #3 are green, Slot #4 is blue).
    You, the user, are trying to guess the solution. You might, for example, guess YRGB.
    When you guess the correct color for the correct slot, you get a "hit." If you guess a color that exists but is in the wrong slot, you get a "pseudo-hit." Note that a slot that is a hit can never count as a pseudo-hit.
    For example,if the actual solution is RGBY and you guess GGRR, you have one hit and one pseudo-hit.
    Write a method that, given a guess and a solution, returns the number of hits and pseudo-hits.[[five][105]]
6.  Given an array of integers, write a method to find indices m and n such that if you sorted 
    elements m through n,the entire array would be sorted.
    Minimize n - m(that is, find the smallest such sequence).[[six][106]] 
7.  Given any integer, print an English phrase that describes the integer (e.g., "One Thousand, Two Hundred Thirty Four"). [[seven][107]]
8.  You are given an array of integers (both positive and negative). Find the contiguous sequence with the largest sum. Return the sum. [[eighth][108]]
9.  Design a method to find the frequency of occurrences of any given word in a book[[nine][109]] 
10. Since XML is very verbose, you are given a way of encoding it where each tag gets mapped to a pre-defined integer value. The language/grammar is as follows:
    Element --> Tag Attributes ENDChildrenEND Attribute --> TagValue
    END --> 9
    Tag --> some predefined mapping to int Value --> string value END
    For example, the following XML might be converted into the compressed string below(assuming a mapping of family -> lj person ->2, firstName -> 3, LastName -> 4j state -> 5).
    <family lastName="McDowell" state="CA">
    <person firstName="Gayle">Some Message</person>
    </family>
    Becomes:
    1 4 McDowell 5 CA 0 2 3 Gayle 0 Some Message 0 0
    Write code to print the encoded version of an XML element (passed in ELament and Attribute objects).[[ten][110]]
      
       
    

[101]:https://github.com/inadram/CrackingCode/tree/master/src/main/Moderate/One
[102]:https://github.com/inadram/CrackingCode/tree/master/src/main/Moderate/Two
[103]:https://github.com/inadram/CrackingCode/tree/master/src/main/Moderate/Three
[104]:https://github.com/inadram/CrackingCode/tree/master/src/main/Moderate/Four
[105]:https://github.com/inadram/CrackingCode/tree/master/src/main/Moderate/Five
[106]:https://github.com/inadram/CrackingCode/tree/master/src/main/Moderate/Six
[107]:https://github.com/inadram/CrackingCode/tree/master/src/main/Moderate/Seven
[108]:https://github.com/inadram/CrackingCode/tree/master/src/main/Moderate/Eighth
[109]:https://github.com/inadram/CrackingCode/tree/master/src/main/Moderate/Nine
[110]:https://github.com/inadram/CrackingCode/tree/master/src/main/Moderate/Ten
