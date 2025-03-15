import java.util.*;

public class DataTypeSize {
    
    public static int dataTypeSize(String str) {
        // code here
        switch(str) {
            case "Character" :
                return 2;
            case "Integer" :
                return 4;
            case "Long" :
                return 8;
            case "Float" :
                return 4;
            case "Double" :
                return 8;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter data type: ");
        String dataType = in.next();

        int size = dataTypeSize(dataType);
        System.out.println("Output: "+ size);
       
        in.close();

    }
}