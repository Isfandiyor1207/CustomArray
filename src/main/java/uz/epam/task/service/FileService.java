package uz.epam.task.service;

import uz.epam.task.entity.CustomArray;

public interface FileService {

    void createFile();

    CustomArray readFromFile();

    void writeToFile();

}
