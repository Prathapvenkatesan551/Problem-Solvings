package Common_Interview;

public class NthPrimeNumber {
	public static int findNthPrime(int n) {
        int count = 0; 
        int num = 1;   

        while (count < n) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }
        return num; 
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true; 	    }

	  public static void main(String[] args) {
	        int n = 200;
	        int nthPrime = findNthPrime(n);
	        System.out.println("The " + n + "th prime number is: " + nthPrime);
	    }

	    
}
