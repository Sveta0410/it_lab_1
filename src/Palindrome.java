// класс Palindrome предназначен для определениия, является ли слово палиндромом
public class Palindrome {
    // метод main предназначен для считывания входных данных и вывода на экран результата программы
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)){
                System.out.println(s + " - палиндром");
            }
            else{
                System.out.println(s + " - НЕ палиндром");
            }
        }
    }
    // метод reverseString предназначен для перестановки символов в строке в обратоном порядке
    public static String reverseString(String s) {
        String sReversed = "";
        for (int i = (s.length()- 1); i > -1; i--){
            sReversed += s.charAt(i);
        }
        return sReversed;
    }
    //метод isPalindrome предназначен для сравнения "перевёрнутой" строки с исходной
    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
}
