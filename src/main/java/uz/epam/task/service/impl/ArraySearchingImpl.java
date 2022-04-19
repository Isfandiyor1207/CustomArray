package uz.epam.task.service.impl;

import uz.epam.task.entity.CustomArray;
import uz.epam.task.service.ArraySearching;

public class ArraySearchingImpl implements ArraySearching {
    @Override
    public int binarySearchRecursively(CustomArray customArray, int searchElement, int low, int high) {

        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (customArray.getArray()[mid] < searchElement) {
                low = mid + 1;
            } else if (customArray.getArray()[mid] > searchElement) {
                high = mid - 1;
            } else if (customArray.getArray()[mid] == searchElement) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
