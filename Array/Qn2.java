
import java.util.HashSet;

public class Qn2 {
    public static boolean containDuplicate(int num[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<num.length; i++) {
            if (set.contains(num[i])) {
                return true;
            } else {
                set.add(num[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num[] = {1, 3, 4, 5, 7, 9};
        int num1[] = {1, 1, 2, 9, 8, 7, 6, 8, 2, 1, 6, 5};
        Qn2 qn2Obj = new Qn2();

        System.err.println(qn2Obj.containDuplicate(num));
        System.err.println(qn2Obj.containDuplicate(num1));

    }
}
