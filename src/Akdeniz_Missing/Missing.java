package Akdeniz_Missing;

public class Missing {

    private boolean compareValue(int s,int a){
        return s == a;
    }

    private static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = j;
        arr[j] = temp;
    }
    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <high - 1 ; j++) {
            if(arr[j] <= pivot){
                i = i + 1;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    public void MissingElement(int[] arr,int low,int high){
        int i = partition(arr,low,high);
    }

    public static void writeMissing(String missing){
        System.out.println(missing);
    }
}
