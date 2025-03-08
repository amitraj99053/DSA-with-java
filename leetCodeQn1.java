import java.util.Scanner;
import java.util.HashMap;
// roman number to integer number (conversion)
public class leetCodeQn1 {

        public int romanToInt(String s) {
            if(s == null || s.length() == 0){
                return 0;
            }

            HashMap<Character,Integer> romanMap = new HashMap<>();
            romanMap.put('I',1);
            romanMap.put('V',5);
            romanMap.put('X',10);
            romanMap.put('L',50);
            romanMap.put('C',100);
            romanMap.put('D',500);
            romanMap.put('M',1000);

            int result = 0;
            int prevValue = 0;

            for(int i = s.length() -1; i >= 0; i--){
                int currentValue = romanMap.get(s.charAt(i));

                if(currentValue < prevValue){
                    result -= currentValue;
                }else{
                    result += currentValue;
                }

                prevValue = currentValue;
            }
            return result;

        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a random numeral: ");
        String ramanNumeral = in.nextLine();
        leetCodeQn1 solution = new leetCodeQn1();
        int integerValue = solution.romanToInt(ramanNumeral);
        System.out.println("Integer value: "+ integerValue);
        in.close();
    }
}
