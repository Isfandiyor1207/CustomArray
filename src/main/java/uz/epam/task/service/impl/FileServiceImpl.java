package uz.epam.task.service.impl;

import uz.epam.task.entity.CustomArray;
import uz.epam.task.service.FileService;
import uz.epam.task.util.Util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileServiceImpl implements FileService {

    private final String fileName="numbers.txt";
    private final Util util;

    public FileServiceImpl(){
        util=new Util();
    }

    @Override
    public void createFile() {

        File file=new File(fileName);

        try {
            if (file.createNewFile()){
                System.out.println("File successful created!");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public CustomArray readFromFile() {
        CustomArray array=new CustomArray();

        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader(fileName));

            String line;
            List<Integer> arrayList=new ArrayList<>();
            while ((line=bufferedReader.readLine()) != null){
                arrayList.add(Integer.valueOf(line));
            }

            array.setArray(arrayList.toArray(new Integer[0]));

            return array;

        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public void writeToFile() {

        String line= System.getProperty("line.separator");

        try {
            FileWriter fileWriter=new FileWriter(fileName);

            for (int i = 0; i < 5; i++) {
                fileWriter.write("" + util.generateRandomNumber() +"");
                fileWriter.write(line);
            }

            fileWriter.flush();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
