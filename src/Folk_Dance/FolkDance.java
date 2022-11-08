package Folk_Dance;

public class FolkDance {

    private static void swapArray(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int FolkPartition(int[] arr, int low, int high) {
        int pivot = low;
        int indexer = high;
        int multiply = -1;
        int x = 0;

        for (int i = 0; i <(high - low); i++) {
            if(x == 0){
                if(arr[pivot]>=arr[indexer]){
                    swapArray(arr,pivot,indexer);
                    int temp = pivot;
                    pivot = indexer;
                    indexer = temp;
                    x=1;
                    multiply = 1;
                }
            }

            if(x == 1){
                if(arr[pivot]<arr[indexer]){
                    swapArray(arr,pivot,indexer);
                    int temp = pivot;
                    pivot = indexer;
                    indexer = temp;
                    x=0;
                    multiply = -1;
                }

            }

            indexer += multiply;

        }

        return pivot;
    }

    public static void FolkSort(int[] arr,int low,int high){
        if(low<high){
            int index = FolkPartition(arr,low,high);
            FolkSort(arr,low,index - 1);
            FolkSort(arr,index + 1, high);

        }
    }

    public static void writeArray(int[] sortedArray){
        for (int value:sortedArray) {
            System.out.print(value+",");
        }

    }
}
