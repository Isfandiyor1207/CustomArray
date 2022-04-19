package uz.epam.task.file.impl;

import uz.epam.task.entity.CustomArray;
import uz.epam.task.file.DataReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReaderImpl implements DataReader {

    private static final String FILENAME = "numbers.txt";
    private static final String PATH = "src/main/resources/";

    @Override
    public CustomArray readFromFile() {
        CustomArray array = new CustomArray();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH + FILENAME));

            String line;
            List<Integer> arrayList = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                arrayList.add(Integer.valueOf(line));
            }

            array.setArray(arrayList.toArray(new Integer[0]));

            return array;

        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
