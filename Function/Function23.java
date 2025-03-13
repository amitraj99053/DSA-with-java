public class Function23 {
    //  methods of the Math class in Java without funtion
    public static void main(String[] args){
        
        // abs() return positive no
        System.out.println("Absolute number is: "+Math.abs(-10));

        // min() return the minimum of two numbers
        System.out.println("Minimum of two number is: "+ Math.min(10,20));

        // max() return the maximum of two numbers
        System.out.println("Maximum of two number is: "+ Math.max(10,20));

        // sqrt() return the square root of given number
        System.out.println("Square root of number is: "+ Math.sqrt(49));

        // pow() return the power of numbers (10,4 = 10000)
        System.out.println("Power of number is: "+ Math.pow(10, 4));

        //random() return the random number 
        System.out.println("Random number is: "+(int)(Math.random()*10) ); // it will return till 10 only

    }
}
