
public class Main {
    public static void main(String[] args) {
        int arr[] = {3, 1, 5, 4, 11, 13, 12};
        int minIndex;

        for(int i=0;i<arr.length-1;i++){
            minIndex = i;
            for(int j=i+1;j<arr.length-i-1; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }
}