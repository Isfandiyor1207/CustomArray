package service;

import entity.CustomArray;

import java.util.List;

public interface CustomArrayService {

    void sortArrayUsingBubbleSort(CustomArray customArray);

    void sortArrayUsingInsertionSort(CustomArray customArray);

    void sortArrayUsingSelectionSort(CustomArray customArray);

    int binarySearchRecursively(CustomArray customArray, int l, int r, int x);

    List<Integer> findFibonacciNumbers(CustomArray customArray);

    int maxElement(CustomArray customArray);

    int minElement(CustomArray customArray);

    List<Integer> searchPrimeNumbers(CustomArray customArray);
}
