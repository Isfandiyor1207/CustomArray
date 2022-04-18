package service;

import entity.CustomArray;

public interface FileService {

    void createFile();

    CustomArray readFromFile();

    void writeToFile();

}
