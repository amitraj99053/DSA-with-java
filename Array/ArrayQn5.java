public class ArrayQn5 {
// passing arrays as argument 

    public static void update(int marks[], int nonChangable){
        nonChangable = 10;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

   public static void main(String[] args) {
    int marks[] = {92,93,94};
    int nonChangable = 5;
    
    System.out.println("Before: ");
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);
    System.out.println(nonChangable);

    update(marks, nonChangable);
    System.out.println("After update: ");
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);
    System.out.println(nonChangable);
   }

}
