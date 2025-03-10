public class ArrayQn8 {
    // Linear search 

    public static int linearSearch(String[] menuList, String check){
        for(int i=0; i<menuList.length; i++){
            if(menuList[i].equals(check)){
                return i; // return the index
            }
        }
        return -1; // if not return found
    }

    public static void main(String[] args) {
        String menuList[] = {"Samosha", "Chole", "Coffie", "Chai", "Biscut"};
        String check = "Chole";

        int index = linearSearch(menuList, check);
        if(index == -1){
            System.out.println("Not found");
        }else {
            System.out.println("Check is at index : "+ index);
        }

    }
    
}
