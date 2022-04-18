package uz.epam.task.service.impl;

import uz.epam.task.entity.CustomArray;
import uz.epam.task.service.ArraySearching;

public class ArraySearchingImpl implements ArraySearching {
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
}
