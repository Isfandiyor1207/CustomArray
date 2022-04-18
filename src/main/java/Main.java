import entity.CustomArray;
import service.impl.CustomArrayServiceImpl;
import service.impl.FileServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileServiceImpl fileService = new FileServiceImpl();
        fileService.createFile();
        fileService.writeToFile();
        CustomArray customArray = fileService.readFromFile();

        CustomArrayServiceImpl customArrayService = new CustomArrayServiceImpl();

        customArrayService.sortArrayUsingBubbleSort(customArray);
        System.out.println(customArray);
//        System.out.printf("Max element: %s\n", customArrayService.maxElement(customArray));
//        System.out.printf("Min element: %s\n", customArrayService.minElement(customArray));
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Input the number:\t");
//        int searchingElement = scanner.nextInt();
//
//        System.out.printf("Index of searching element: %s\n",
//        customArrayService.binarySearchRecursively(customArray, searchingElement, 0, customArray.getArray().length));
//        System.out.println(customArrayService.searchPrimeNumbers(customArray));
//        System.out.println(customArrayService.generateFibonacciNumbers(10));


        System.out.println(customArrayService.findNumberNotRepeated());

//        System.out.println(customArrayService.findFibonacciNumbers(customArray));

    }

}
