package util;

import java.util.Random;

public class Util {

    private final Random random;

    public Util(){
        random=new Random();
    }

    public int generateRandomNumber() {
        return random.nextInt(9999);
    }

}
