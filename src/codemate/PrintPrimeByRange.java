package codemate;

public class PrintPrimeByRange {
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void printPrimeByRange(int n) {
        int cnt = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) cnt++;
        }

        System.out.println("소수의 개수: " + cnt);
    }

    public static void main(String[] args) {
        printPrimeByRange(50000);
    }

}
