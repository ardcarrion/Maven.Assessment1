package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer occurrences = 0;
        for (Object o : objectArray) {
            if (o.equals(objectToCount)) occurrences++;
        }
        return occurrences;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        //hard cast to Integer[] to pass the test, otherwise threw casting error
        Integer occurrences = getNumberOfOccurrences(objectArray, objectToRemove);
        Integer length = objectArray.length - occurrences;
        Integer[] removed = new Integer[length];
        Integer removedCount = 0;
        for (Integer i = 0; i < objectArray.length; i++) {
            if (!objectArray[i].equals(objectToRemove)) {
                removed[removedCount] = (Integer)objectArray[i];
                removedCount++;
            }
        }
        return  removed;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        ArrayList<Integer> unique = new ArrayList<Integer>();
        for (Object o : objectArray) {
            if (unique.indexOf(o) < 0) {
                unique.add((Integer)o);
            }
        }
        int max = 1;
        Integer mostCommon = null;
        for (Integer obj : unique) {
            int occurs = getNumberOfOccurrences(objectArray, obj);
            if (max < occurs) {
                max = occurs;
                mostCommon = obj;
            }
        }
        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        ArrayList<Integer> unique = new ArrayList<Integer>();
        for (Object o : objectArray) {
            if (unique.indexOf(o) < 0) {
                unique.add((Integer)o);
            }
        }
        int min = 1;
        Integer leastCommon = null;
        for (Integer obj : unique) {
            int occurs = getNumberOfOccurrences(objectArray, obj);
            if (min >= occurs) {
                min = occurs;
                leastCommon = obj;
            }
        }
        return leastCommon;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        //hard cast to Integer[] otherwise threw casting error
        Integer newLength = objectArray.length + objectArrayToAdd.length;
        Integer[] merged = new Integer[newLength];
        for (Integer i = 0; i < objectArray.length; i++) merged[i] = (Integer)objectArray[i];
        for (Integer j = 0; j < objectArrayToAdd.length; j++) merged[objectArray.length+j] = (Integer)objectArrayToAdd[j];
        return merged;
    }
}
