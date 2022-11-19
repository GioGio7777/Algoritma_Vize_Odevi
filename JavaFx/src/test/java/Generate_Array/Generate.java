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

    public static int[] generateArray2(int size){

        int[] array = new int[size];
        int[] newArray = new int[size - 1];
        int removeEleFromIndex = (int) (Math.random() * (size - 1));

        for (int i = 1; i <= size ; i++) {
            array[i-1] = i;
        }

        for(int j=0, k=0; j<array.length; j++) {
            if(j == removeEleFromIndex)
                continue;

            newArray[k++] = array[j];
        }

        return newArray;
    }
}
