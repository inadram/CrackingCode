1.  You are given two 32-bit numbers, N and M, and two bit positions, i and j .
Write a method to insert M into N such that M starts at bit j and ends at bit i. 
You can assume that the bits j through i have enough space to fit all of M. 
That is, if M= 10011, you can assume that there are at least 5 bits between j and i. 
You would not,for example, have j = 3 and i = 2,because M could not fully fit between bit 3 and bit 2.
EXAMPLE
Input: N=10000000000,M=10011,i=2,j=6 Output:N = 10001001100 [[one][101]]

2.  Given a real number between 0 and 1 (e.g.,0.72) that is passed in as a double,print the binary representation.
If the number cannot be represented accurately in binary with at most 32 characters, print "ERROR."[[two][102]]

3.  Given a positive integer, print the next smallest and the next largest number that have the same number of 7bits in their binary representation. [[three][103]]

5.  Write a function to determine the number of bits required to convert integer A to integer B.[[five][105]]

6.  Write a program to swap odd and even bits in an integer with as few instructions as possible(e.g.,bit 0 and bit 1 are swapped ,bit 2 and bit 3 are swapped,and so on).[[six][106]]

7.  An array A contains all the integers from 0 through n, except for one number which is missing.
In this problem, we cannot access an entire integer in A with a single operation. 
The elements of A are represented in binary, and the only operation we can use to access them is "fetch the jth bit of A[i]," which takes constant time.
Write code to find the missing integer. Can you do it in 0(n) time?

[101]:https://github.com/inadram/CrackingCode/tree/master/src/main/ConceptsAndAlgorithms/BitManipulation/One
[102]:https://github.com/inadram/CrackingCode/tree/master/src/main/ConceptsAndAlgorithms/BitManipulation/Two
[103]:https://github.com/inadram/CrackingCode/tree/master/src/main/ConceptsAndAlgorithms/BitManipulation/Three
[105]:https://github.com/inadram/CrackingCode/tree/master/src/main/ConceptsAndAlgorithms/BitManipulation/Five
[106]:https://github.com/inadram/CrackingCode/tree/master/src/main/ConceptsAndAlgorithms/BitManipulation/Six
[107]:https://github.com/inadram/CrackingCode/tree/master/src/main/ConceptsAndAlgorithms/BitManipulation/Seven