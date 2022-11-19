package Akdeniz_Missing;

public class Missing {


    public static void smallest(int[] arr){
        int small = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length - 1 ; i++) {
            if (arr[i] < small) {
                small = arr[i];
                index = i;
            }
        }
            swap(arr,index,arr.length - 1);
    }

    private static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int value = high;
        int j = 0;
        while(j<high){
            if(arr[j] - pivot == 1){
                swap(arr,high - 1,j);
                value--;
                break;
            }
            j++;
        }
        return value;
    }

    public static void MissingElement(int[] arr,int low,int high,int pivot){
        if(low < high){
            int index = partition(arr,low,high);
            if(pivot != index){
                MissingElement(arr,low,index,index);
            }else System.out.println("Missing element is:" + (arr[index] + 1));

        }
    }
}
