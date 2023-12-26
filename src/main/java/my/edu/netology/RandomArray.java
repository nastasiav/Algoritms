package my.edu.netology;

import java.util.Random;

public class RandomArray {
    private Random random = new Random();
    public Integer[] setRandomIntegerArray(int lengthArray){
        Integer[] array = new Integer[lengthArray];
        for (int i = 0; i < array.length; i++) {
            int rand = random.nextInt(1000);
            array[i] = rand;
        }
        return array;
    }
}
