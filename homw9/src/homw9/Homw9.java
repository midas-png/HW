package homw9;

import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Homw9 {

    public static void main(String[] args) {
        int[] array = {2, 2};
        int[][] array2 = {{2, 1, 3}, {12, 5, -1}, {2, 65, 7}};
        
        System.out.print(maxMinor(array2));
//        for(int i=0; i<array.length; i++){
//            System.out.print(reverseLast(array)[i]);
//        }
    }
    
    public static String getStatus(int tempature){ //№1
        if(tempature <= 0){
            return "Лед";
        } else if (tempature >= 100){
            return "Пар";
        }
        return "Вода";
    }
    
    public static boolean isTeen(int age){ // №2
        return age > 16;
    }
    
    public static boolean isNumsSimilar(int num1, int num2){ // №3
        int lastNum1 = num1 % 10;
        int lastNum2 = num2 % 10;
        
        return lastNum1 == lastNum2;
    }
    
    public static int getMax(int num1, int num2, int num3){ // №4
        int[] array = {num1, num2, num3};
        int max = array[0];
        for(int i=0; i<array.length; i++){
            if (array[i] > max){
                max = array[i];
            }        
        }
        return max;
    }
    
    public static String addReverse(String value){ // №5
        if(value.isEmpty()){
            throw new RuntimeException("The value is empty");
        }
        
        StringBuilder startStr = new StringBuilder(value);
        char lastC = startStr.charAt(startStr.length() - 1);
        
        StringBuilder result  = startStr.append(lastC);
        result.insert(0, lastC);
        return result.toString();
    }
    
    public static boolean isXNext(String value){ //№6
        for(int i=0; i<value.length(); i++){
            if(value.charAt(i) == 'x' && value.charAt(i + 1) == 'x'){
                return true;
            }
        }
        return false;
    }
    
    public static boolean isTimeFormat(String value){ //№7
        String regex = "([01]?\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
        boolean result = value.matches(regex);
        return result;
    }
    
    public static int getMedian(int[] array, int arrLen){ //№8
        int result = array[arrLen / 2];
        return result;
    }
    
    public static int[] mergeArrs(int[] arr1, int[] arr2){ //№9
        int fArrlen = arr1.length;     
        int sArrlen = arr2.length;  
        int[] result = new int[fArrlen + sArrlen];
        System.arraycopy(arr1, 0, result, 0, fArrlen);  
        System.arraycopy(arr2, 0, result, fArrlen, sArrlen);  
        return result; 
    }
    
    public static int[] reverseLast(int[] arr1){ //№10
        int[] newArray = arr1.clone();
        int lastc = newArray[newArray.length - 1];
        int firstn = newArray[0];
        
        newArray[0] = lastc;
        newArray[newArray.length - 1] = firstn;
        
        return newArray;
    }
    
    public static boolean isEven(int[] arr){ //№11
        int count = 0;
        
        for(int i=0; i<arr.length; i++){
            int elem = (int) Math.pow(arr[i], 2);
            count += elem;
        }
        
        return count % 2 == 0;
    }
    
    public static int getDifference(int[] arr){ //№12
        int maxElem = arr[0];
        int minElem = arr[0];
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > maxElem)
                maxElem = arr[i];
            else if(arr[i] < minElem)
                minElem = arr[i];
        }
        
        return maxElem - minElem;
    }
    
    public static boolean isStepSimilar(int[] arr){ //№15
        int[] newArray = arr.clone();
        Arrays.sort(newArray);
        
        int diff = newArray[1] - newArray[0];
        
        if(diff % 2 != 0)
            return false;
        
        for(int i=0; i<newArray.length - 1; i++){
            if(newArray[i] + diff != newArray[i+1]){
                return false;
            }
        }
        
        return true;
    }
    
    public static int[] addInArray(int[] array, int value){ // №16
        int[] newArray = array.clone();
        newArray[newArray.length - 1] = value;
        
        return newArray;
    }
    
    public static int maxMinor(int[][] arr){ //Только 3х3 №17
        int maxNum = 0;
        int indexI = 0;
        int indexJ = 0;
        int[][] newMatrix = arr.clone();
        
        
        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr.length; j++){
                if(arr[i][j] > maxNum)
                    maxNum = arr[i][j];
                    indexI = i;
                    indexJ = j;
            }
        
        
        
        return 0;
    }
    
    public static int count11(String value){ // №18
        int count = 0;
        
        return count;
    }
}
