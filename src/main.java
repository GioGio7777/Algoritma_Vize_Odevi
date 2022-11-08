import Folk_Dance.FolkDance;
import Generate_Array.Generate;

public class main {
    public static void main(String[] args) {
        int[] array = {3,0,1,8,7,2,5,4,9,6};
        int[] basic = {4,3,2,1};
        int [] array2 = Generate.generateArray(10000);
        FolkDance.FolkSort(array,0,array.length-1);
        FolkDance.writeArray(array);
    }
}
