package uz.epam.task.service;

import uz.epam.task.entity.CustomArray;

public interface ArraySorting {
    void sortArrayUsingBubbleSort(CustomArray customArray);

    void sortArrayUsingInsertionSort(CustomArray customArray);

    void sortArrayUsingSelectionSort(CustomArray customArray);
}
