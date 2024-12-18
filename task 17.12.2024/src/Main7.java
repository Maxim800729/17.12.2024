public class Main7 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
//    equalsIgnoreCase                           +      metod proveryayet  bez uceta registra
        boolean result = equalsIgnoreCase(str1, str2);

        System.out.println("Строка 1: " + str1);
        System.out.println("Строка 2: " + str2);
        System.out.println("Результат сравнения: " + result);
    }

    public static boolean equalsIgnoreCase(String str1, String str2) {

        return str1.toLowerCase().equals(str2.toLowerCase()); // Проверка равенства с учётом регистра
    }
}
