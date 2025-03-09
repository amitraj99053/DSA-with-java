public class Array2Qn {

    // sum of all the elements in an array
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum of array element no : "+ sum);
    }
}
