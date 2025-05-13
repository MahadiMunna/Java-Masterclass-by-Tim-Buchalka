
public class LargestPrimeNumber {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int n) {
        if (n < 2) {
            return -1;
        }
        int prime = -1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                boolean isPrime = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    prime = i;
                }
            }
        }
        return prime;
    }
}
