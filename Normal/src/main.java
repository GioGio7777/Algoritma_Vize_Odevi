import Akdeniz_Missing.Missing;
import Folk_Dance.FolkDance;
import Generate_Array.Generate;
import Shift.Shift;


public class main{
    public static void main(String[] args) {
        int[] array = {3,0,1,8,7,2,5,4,9,6};
        int[] array2 =Generate.generateArray(10000);

        //System.out.println("\n"+FolkSortHw2(array2)/1000000 + "ms");
        //int [] newArray = {12,7,10,4,5,3,11,1,6,8,2};

        //Missing.MissingElement(newArray,0, newArray.length-1);

        //FolkDance.writeArray(newArray);

        /*
        int[] A = {9,12,17,21,33,41};
        int k = 4;
        Shift.rightRotate(A,k);
        FolkDance.writeArray(A);

        System.out.println();
        Shift.insertationSort(A);
        FolkDance.writeArray(A);
        */

        /*

        int[] hw2Size = {10000,20000,30000,40000,50000,60000,70000,80000,90000,100000};

        for (int j : hw2Size) {
            int[] generatedArray = Generate.generateArray(j);
            System.out.println("\n" + FolkSortHw2(generatedArray) / 1000000 + "ms");
        }
         */




        int size =(int) Math.pow(2,16);

       int[] shifts = new int[17];

        for (int i = 0; i <16 ; i++) {
            shifts[i] =(int) Math.pow(2,i);
        }
        shifts[16] = size - 1;

        for (int shift : shifts) {
            System.out.println(BankShiftHw3(shift,size)/1000000 + "ms");
        }

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
