package uz.epam.task.service.impl;

import uz.epam.task.entity.CustomArray;
import uz.epam.task.service.Sorting;

public class SortingImpl implements Sorting {
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
}
