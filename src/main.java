import Folk_Dance.FolkDance;
import Generate_Array.Generate;

public class main {
    public static void main(String[] args) {
        int[] array = {3,0,1,8,7,2,5,4,9,6};
        int[] array2 =Generate.generateArray(3);

        System.out.println("\n"+FolkSortHw2(array2)/1000000 + "ms");


        int [] newArray = {12,7,10,9,5,4,11,1,6,8,2};
    }

    public static void MissingHw1(int[] arr){

    }

    public static long FolkSortHw2(int[] array){
        long startTime = System.nanoTime();
        FolkDance.FolkSort(array,0,array.length-1);
        FolkDance.writeArray(array);
        return System.nanoTime() - startTime;
    }
}
