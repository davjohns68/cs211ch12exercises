/*
 * Recommended exercises for chapter 12 (Resursion)
 * Exercises 4, 8, 9, 13, 14
 * Created by David Johnson, October 16, 2017
 * for CS211 course, Bellevue College
 */
package cs211ch12exercises;

import java.util.*;

public class Cs211ch12exercises {

    public static void main(String[] args) {
        doubleDigits(789);
        System.out.println(sumTo(100));
        //System.out.println(doubleDigits(789));
    }
    
    // Exercise 4
    // Returns an integer represented by (2) of each digit in the passed integer
    // e.g. doubleDigits(789) should return 778899
    public static int doubleDigits(int number) {
        List<Integer> numberArr = new ArrayList<>();
        char[] numString = Integer.toString(number).toCharArray();
        for(char n: numString) {
            
        }
        
        System.out.println(numString);
        
        return 0;
    }
    
    private static int doubleDigits(int number, List<Integer> numberArray) {
        return 0;
    }
    
    //  Exercise 8
    // Returns the product of the first number of even integers
    public static int multiplyEvens(int number) {
        return 0;
    }
    
    // Exercise 9
    // Returns a real number representing the sum of the first n reciprocals
    public static double sumTo(int number) {
        double total = 0.0;
        return sumTo(number, total);
    }
    
    private static double sumTo(int number, double total) {
        if(number == 0) {
            return total;
        } else {
            total += 1.0 / number;
            return sumTo(number - 1, total);
        }
    }
    
    // Exercise 13
    // Returns the starting index of the first occurrence of the second string inside the first
    public static int indexOf(String string1, String string2) {
        return 0;
    }
    
    // Exercise 14
    // Returns an integer formed by removing all odd digits from the one passed in
    public static int evenDigits(int number) {
        return 0;
    }
    
    private static int evenDigits(List<Integer> number) {
        return 0;
    }
}
