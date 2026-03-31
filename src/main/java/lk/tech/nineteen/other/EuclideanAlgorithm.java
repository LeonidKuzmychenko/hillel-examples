package lk.tech.nineteen.other;

public class EuclideanAlgorithm {

    // Метод для знаходження НЗД двох чисел
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int m = 32;
        int n = 24;
        int gcd = findGCD(m, n);
        System.out.println("Найбільший загальний дільник для " + m + " і " + n + " = " + gcd);
    }

}