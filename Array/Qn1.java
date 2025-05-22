public class Qn1 {
    // duplicate number tracking
    public boolean containDuplicate(int num[]) {
        for (int i=0; i<num.length - 1; i++) {
            for (int j=i+1; j<num.length; j++) {
                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int num1[] = {1, 2, 6, 8, 9, 3, 4};
        Qn1 qn1Object = new Qn1();

        // call the method on the object
        System.out.println(qn1Object.containDuplicate(num));
        System.out.println(qn1Object.containDuplicate(num1));
    }
}
