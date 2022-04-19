package uz.epam.task.file.impl;

import uz.epam.task.file.FileCreater;
import uz.epam.task.validator.Validation;

import java.io.File;
import java.io.IOException;

public class FileCreaterImpl implements FileCreater {

    private static final String FILENAME = "numbers.txt";
    private static final String PATH = "src/main/resources/";

    @Override
    public void createFile() {
        File file=new File(PATH + FILENAME);

        Validation validation=new Validation();

        try {

            if (!validation.isFileExist(PATH + FILENAME)){
                file.createNewFile();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
