package Generate_Array;

import java.util.Random;
import java.util.stream.IntStream;

public class Generate {

    public static int[] generateArray(int size){

        return IntStream.generate(() -> new Random().nextInt(size)).limit(size).toArray();
    }
}
