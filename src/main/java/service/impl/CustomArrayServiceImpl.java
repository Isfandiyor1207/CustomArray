package service.impl;

import entity.CustomArray;
import service.CustomArrayService;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayServiceImpl implements CustomArrayService {
    @Override
    public void sortArrayUsingBubbleSort(CustomArray customArray) {
        int n = customArray.getArray().length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (customArray.getArray()[j] > customArray.getArray()[j + 1]) {
                    int temp = customArray.getArray()[j];
                    customArray.getArray()[j] = customArray.getArray()[j + 1];
                    customArray.getArray()[j + 1] = temp;
                }
    }

    @Override
    public void sortArrayUsingInsertionSort(CustomArray customArray) {
        int n = customArray.getArray().length;
        for (int i = 1; i < n; ++i) {
            int key = customArray.getArray()[i];
            int j = i - 1;

            while (j >= 0 && customArray.getArray()[j] > key) {
                customArray.getArray()[j + 1] = customArray.getArray()[j];
                j = j - 1;
            }
            customArray.getArray()[j + 1] = key;
        }
    }

    @Override
    public void sortArrayUsingSelectionSort(CustomArray customArray) {
        int n = customArray.getArray().length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
                if (customArray.getArray()[j] < customArray.getArray()[minIndex])
                    minIndex = j;

            int temp = customArray.getArray()[minIndex];
            customArray.getArray()[minIndex] = customArray.getArray()[i];
            customArray.getArray()[i] = temp;
        }
    }

    @Override
    public int binarySearchRecursively(CustomArray customArray, int searchElement, int low, int high) {
        int middle = low + ((high - low) / 2);

        if (high < low) {
            return -1;
        }

        if (searchElement == customArray.getArray()[middle]) {
            return middle;
        } else if (searchElement < customArray.getArray()[middle]) {
            return binarySearchRecursively(customArray, searchElement, low, middle - 1);
        } else {
            return binarySearchRecursively(customArray, searchElement, middle + 1, high);
        }
    }

    @Override
    public List<Integer> findFibonacciNumbers(CustomArray customArray) {
        List<Integer> list = generateFibonacciNumbers(maxElement(customArray));

        List<Integer> fibonacciNumbers=new ArrayList<>();

        for (Integer integer : customArray.getArray()) {
            if (binarySearchRecursively(customArray, integer, 0, customArray.getArray().length) >= 0) {
                fibonacciNumbers.add(integer);
            }
        }

        return fibonacciNumbers;
    }

    @Override
    public int maxElement(CustomArray customArray) {
        int i;

        int max = customArray.getArray()[0];

        for (i = 1; i < customArray.getArray().length; i++)
            if (customArray.getArray()[i] > max)
                max = customArray.getArray()[i];

        return max;
    }

    @Override
    public int minElement(CustomArray customArray) {
        int i;

        int min = customArray.getArray()[0];

        for (i = 1; i < customArray.getArray().length; i++)
            if (customArray.getArray()[i] < min)
                min = customArray.getArray()[i];

        return min;
    }

    @Override
    public List<Integer> searchPrimeNumbers(CustomArray customArray) {

        List<Integer> primeNumberList = new ArrayList<>();

        for (int i = 0; i < customArray.getArray().length; i++) {
            int number = customArray.getArray()[i];
            if (isPrimeNumber(number)) {
                primeNumberList.add(number);
            }
        }

        return primeNumberList;
    }

    private boolean isPrimeNumber(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    public List<Integer> generateFibonacciNumbers(int maximumNumber) {

        List<Integer> fibonacciNumbers=new ArrayList<>();
        fibonacciNumbers.add(0);
        int n1 = 0;
        int n2 = 1;
        int n3;
        for (int i = 2; i < maximumNumber; ++i) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            fibonacciNumbers.add(n3);
        }

        return fibonacciNumbers;
    }

//    public List<Integer> findNumberNotRepeated(){
//        int num=987;
//        if (!checkNumberToRepeated(num)){
//            System.out.println(num);
//        }
//    }

    public boolean checkNumberToRepeated(Integer integer){
        String number=String.valueOf(integer);
        String checkingString=number;

        boolean check=true;

        for (int i = 0; i < number.length(); i++) {
            if (checkingString.substring(i).contains(String.valueOf(number.charAt(i)))){
                check=false;
            } else {
                checkingString=checkingString.substring(i);
            }
        }
        return check;
    }

}
