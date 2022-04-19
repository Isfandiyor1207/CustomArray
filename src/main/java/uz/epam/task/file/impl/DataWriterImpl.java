package uz.epam.task.file.impl;

import uz.epam.task.file.DataWriter;
import uz.epam.task.util.RandomNumberGenerator;

import java.io.FileWriter;
import java.io.IOException;

public class DataWriterImpl implements DataWriter {

    private static final String FILENAME = "numbers.txt";
    private static final String PATH = "src/main/resources/";
    private static final String LINE = System.getProperty("line.separator");

    @Override
    public void writeToFile(int sizeNumber) {

        RandomNumberGenerator numberGenerator = new RandomNumberGenerator();

        try (FileWriter fileWriter = new FileWriter(PATH + FILENAME)) {

            for (int i = 0; i < sizeNumber; i++) {
                fileWriter.write("" + numberGenerator.generateRandomNumber(0, 50) + "");
                fileWriter.write(LINE);
            }

            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
