package Shift;

public class Shift {
    private static void swap(int[] arr,int small,int big){
        int temp = arr[small];
        arr[small] = arr[big];
        arr[big] = temp;
    }
    private static void rightRotate(int[] A)
    {
        int last = A[A.length - 1];
        for (int i = A.length - 2; i >= 0; i--) {
            A[i + 1] = A[i];
        }

        A[0] = last;
    }

    public static void rightRotate(int[] A, int k)
    {
        if (k < 0 || k >= A.length) {
            return;
        }

        for (int i = 0; i < k; i++) {
            rightRotate(A);
        }

    }
    public static void insertationSort(int[] A){
        for (int i = 2; i <A.length ; i++) {
            for (int j = i; j >=1 ; j--) {
                if(A[j]<A[j-1]){
                    swap(A,j,j-1);
                }else break;

            }

        }

    }


}

