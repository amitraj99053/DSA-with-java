public class countPrimes {
    //Qn 204. count primes
    public int countPrimes(int n) {
        if (n <= 2) {
             return 0;
            }
 
         boolean[] isPrime = new boolean[n];
         for (int i = 2; i < n; i++) {
             isPrime[i] = true;
            }
 
         for (int i = 2; i * i < n; i++) {
             if (isPrime[i]) {
                 for (int j = i * i; j < n; j += i) {
                     isPrime[j] = false;
                    }
                }
            }
 
         int count = 0;
         for (int i = 2; i < n; i++) {
             if (isPrime[i]) {
                 count++;
                }
            }
 
        return count; 
    }

    public static void main(String[] args) {
        countPrimes solution = new countPrimes();

        // Example 1
        int n1 = 10;
        int result1 = solution.countPrimes(n1);
        System.out.println("Example 1: n = " + n1 + ", Result = " + result1); // Output: 4

        // Example 2
        int n2 = 0;
        int result2 = solution.countPrimes(n2);
        System.out.println("Example 2: n = " + n2 + ", Result = " + result2); // Output: 0

        // Example 3
        int n3 = 1;
        int result3 = solution.countPrimes(n3);
        System.out.println("Example 3: n = " + n3 + ", Result = " + result3); // Output: 0

        // Example 4
        int n4 = 500000;
        int result4 = solution.countPrimes(n4);
        System.out.println("Example 4: n = " + n4 + ", Result = " + result4);

    }
}
