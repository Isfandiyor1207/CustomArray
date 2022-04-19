package uz.epam.task.service;

import uz.epam.task.entity.CustomArray;

import java.util.List;

public interface CustomArrayService {

    List<Integer> findFibonacciNumbers(CustomArray customArray);

    int maxElement(CustomArray customArray);

    int minElement(CustomArray customArray);

    List<Integer> searchPrimeNumbers(CustomArray customArray);
}
