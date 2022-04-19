package uz.epam.task;

import uz.epam.task.entity.CustomArray;
import uz.epam.task.file.impl.DataWriterImpl;
import uz.epam.task.file.impl.FileCreaterImpl;
import uz.epam.task.service.impl.CustomArrayServiceImpl;

public class Main {
    public static void main(String[] args) {
        CustomArray customArray = new CustomArray();
        CustomArrayServiceImpl customArrayService = new CustomArrayServiceImpl();

        FileCreaterImpl creater = new FileCreaterImpl();

        creater.createFile();

        DataWriterImpl writer = new DataWriterImpl();

        writer.writeToFile(20);

    }

}
