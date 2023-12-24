//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};

        for(int i = 0; i < arr.length - 1; i++) {
            int max = 0;
            for(int j = i + 1; j < arr.length; j++) {
                if(max < arr[j]) {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        arr[arr.length - 1] = -1;
        for(int n : arr)
            System.out.print(n + " ");
    }
}