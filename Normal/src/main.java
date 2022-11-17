import Akdeniz_Missing.Missing;
import Folk_Dance.FolkDance;
import Generate_Array.Generate;
import Shift.Shift;


public class main{
    public static void main(String[] args) {
        int[] array = {3,0,1,8,7,2,5,4,9,6};
        int[] array2 =Generate.generateArray(10000);
        int[] arr = {12, 7, 10, 9, 5, 4, 11, 1, 6, 8, 2};


        Missing.smallest(arr);
        Missing.MissingElement(arr,0,arr.length - 1,arr.length - 1);
        FolkDance.writeArray(arr);

    }

    public static void MissingHw1(int[] arr){


    }

    public static long FolkSortHw2(int[] array){
        long startTime = System.nanoTime();
        FolkDance.FolkSort(array,0,array.length-1);
        return System.nanoTime() - startTime;
    }

    public static double BankShiftHw3(int shift,int size){
        int[] H3Array  = Generate.generateArraySorted(size);
        Shift.rightRotate(H3Array,shift);
        long startTime = System.nanoTime();
        Shift.insertationSort(H3Array);
        return System.nanoTime() - startTime;
    }
}
