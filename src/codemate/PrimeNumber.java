package codemate;

// 소수
public class PrimeNumber {
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static String printPrime(int n) {
        String s = isPrime(n) ? "은 소수입니다." : "은 소수가 아닙니다.";
        return n + s;
    }

    public static void main(String[] args) {
        System.out.println(printPrime(97));
        System.out.println(printPrime(100));
    }
}
