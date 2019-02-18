/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch;

/**
 *
 * @author berge
 */
public class BinarySearch {

    public static void main(String[] args) {
        
        int[] array = {1, 3, 4, 5, 13, 20, 25, 40, 42, 44, 53};
        System.out.println(binarySearch(array, 1, 0, array.length - 1));
        
        //Use compareTo for Strings
        //s1.compareTo(s2)
        // -1 if s1 is before s2
        // 0 if they are equal
        // 1 if s1 if after s2
        
    }
    
    public static boolean binarySearch(int[] array, int x, int left, int right) {
        if(left > right) {
            return false;
        }
        int mid = (left + right)/2;
        if(array[mid] == x) {
            return true;
        } else if(array[mid] > x) {
            return binarySearch(array, x, left, mid -1);
        } else {
            return binarySearch(array, x, mid + 1, right);
        }
    }
}
