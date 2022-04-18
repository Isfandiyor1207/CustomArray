package uz.epam.task.service.impl;

import uz.epam.task.entity.CustomArray;
import uz.epam.task.service.CustomArrayService;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayServiceImpl implements CustomArrayService {

    private final ArraySearchingImpl arraySearching;

    public CustomArrayServiceImpl(){
        arraySearching=new ArraySearchingImpl();
    }

    @Override
    public List<Integer> findFibonacciNumbers(CustomArray customArray) {
        List<Integer> list = generateFibonacciNumbers(maxElement(customArray));

        List<Integer> fibonacciNumbers=new ArrayList<>();

        for (Integer integer : customArray.getArray()) {
            if (arraySearching.binarySearchRecursively(customArray, integer, 0, customArray.getArray().length) >= 0) {
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
