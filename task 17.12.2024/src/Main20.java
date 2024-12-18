public class Main20{

    //contains
    // metod proveryayet soderjit li stroka ukazannuyu stroku
    public static void main(String[] args) {
        String str = "Hello, World!";
        String substring = "World";

        boolean result = contains(str, substring);
        System.out.println("Строка содержит подстроку \"" + substring + "\": " + result);
    }

    public static boolean contains(String str, String substring) {
        // Проверка на пустую строку
        if (substring == null || substring.isEmpty()) {
            return false;
        }

        // Проверка наличия подстроки в строке
        for (int i = 0; i <= str.length() - substring.length(); i++) {
            int j;
            for (j = 0; j < substring.length(); j++) {
                if (str.charAt(i + j) != substring.charAt(j)) {
                    break;
                }
            }
            if (j == substring.length()) {
                return true; // Подстрока найдена
            }
        }
        return false; // Подстрока не найдена
    }
}
