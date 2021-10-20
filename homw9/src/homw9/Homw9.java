package homw9;

import java.util.Arrays;


public class Homw9 {

    public static void main(String[] args) {
//         int[] array = {2, 2};
//         int[][] array2 = {{2, 1, 3}, {12, 5, -1}, {2, 65, 7}};
//         System.out.println(count11("121212121212"));
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
    
    public static int maxMinor(int[][] arr){ // №17 неправильный результат
        int maxNum = 0;
        int indexI = 0;
        int indexJ = 0;
        int[][] matrix = arr.clone();
        int[][] minor = new int[matrix.length - 1][matrix.length - 1];
        
        for(int i=0; i<matrix.length; i++)
            for(int j=0; j<matrix.length; j++){
                if(arr[i][j] > maxNum)
                    maxNum = matrix[i][j];
                    indexI = i;
                    indexJ = j;
            }
        
        for(int i=0; i<matrix.length; i++)
            for(int j=0; i!=indexI && j < matrix[i].length; i++)
                if(j != indexJ)
                    return minor[i<indexI ? i:i-1][j<indexJ ? j : j -1] = matrix[i][j];
        
        return 0;
    }
    
    public static int count11(String value){ // №18 неправильный результат
        char[] chars = value.toCharArray();
        
        Arrays.sort(chars);
        String sorted = new String(chars);
        
        int i = sorted.lastIndexOf("1") + 1;
        
        if(i % 2 != 0)
            return (i - 1) / 2;
        
        return i / 2;
        
    }
}


/* №19
1. Входящее значение строки. Нужно первый и последний символ поменять местами,
при этом, чтобы первый символ всегда был в верхнем регистре, последующие - в нижнем регистре.
"Cat" -> "taC"
"CaSTle" -> "EastlC"
"jEY" -> "Yej"
2. Конвертер температур
3. Игра "Камень-ножницы-бумага"
*/
