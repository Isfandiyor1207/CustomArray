package uz.epam.task.util;

import java.util.Random;

public class RandomNumberGenerator{

    private static final Random random = new Random();

    public int generateRandomNumber(int from, int to) {
        return random.nextInt(to - from) + from;
    }

}
