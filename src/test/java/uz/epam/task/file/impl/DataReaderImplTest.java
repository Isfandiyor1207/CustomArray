package uz.epam.task.file.impl;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import uz.epam.task.entity.CustomArray;

public class DataReaderImplTest {

    DataReaderImpl dataReader;
    Assertion assertion;


    @BeforeMethod
    public void setUp() {
        dataReader = new DataReaderImpl();
        assertion = new Assertion();
    }

    @Test
    public void testReadFromFile() {
        CustomArray customArray = dataReader.readFromFile();
        assertion.assertNotNull(customArray);
    }

}