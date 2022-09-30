// класс Primes предназначен для поиска и вывода на экран всех простых чисел от 2 до 100
public class Primes {
    // метод main предназначен для вывода на экран всех простых чисел от 2 до 100
    public static void main(String[] args) {
        for (int j = 2; j < 101; j++) {
            if (isPrime(j)) {
                System.out.print(j + " ");
            }
        }
        System.out.println("");
    }
    // метод isPrime предназначен для проверки, является число простым или нет
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++)
            if (n % i == 0) {
                return false;
            }
        return true;
    }
}
