package uz.epam.task.validator;

import java.io.File;

public class Validation {

    public boolean isFileExist(String filename){
        File file=new File(filename);
        return file.exists();
    }

}
