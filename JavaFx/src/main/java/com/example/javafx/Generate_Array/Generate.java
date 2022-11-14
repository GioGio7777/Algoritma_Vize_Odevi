package Generate_Array;

import java.util.Random;
import java.util.stream.IntStream;

public class Generate {

    public static int[] generateArray(int size){

        return IntStream.generate(() -> new Random().nextInt(size)).limit(size).toArray();
    }

    public static int[] generateArraySorted(int size){

        int[] array = new int[size];

        for (int i = 1; i <= size ; i++) {
            array[i-1] = i;
        }

        return array;
    }
}
