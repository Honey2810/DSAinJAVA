package sorting;

public class b2 {
    public static void main(String[] args) {
        int arr[] = {4,2,5,1,3};
        int n = arr.length;
        //bubble sort
        for (int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            
        }
        System.out.println("Array after sorting:");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
