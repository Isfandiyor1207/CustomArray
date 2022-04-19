package uz.epam.task.service.impl;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import uz.epam.task.entity.CustomArray;

public class CustomArrayServiceImplTest {

    CustomArrayServiceImpl customArrayService;
    CustomArray customArray;
    ArraySearchingImpl arraySearching;
    Assertion assertion;

    @BeforeMethod
    public void setUp() {
        customArray = new CustomArray();
        Integer[] array = new Integer[]{1, 2, 34, 546, 12, 75, 86, 547, 87, 98, 120};
        customArray.setArray(array);

        customArrayService = new CustomArrayServiceImpl();

        assertion=new Assertion();
        arraySearching=new ArraySearchingImpl();
    }

    @Test
    public void testMaxElement() {
        customArrayService.maxElement(customArray);
    }

    @Test
    public void testMinElement() {
        customArrayService.minElement(customArray);
    }

    @Test
    public void testSearchPrimeNumbers() {
        assertion.assertNotNull(customArrayService.searchPrimeNumbers(customArray));
    }
}