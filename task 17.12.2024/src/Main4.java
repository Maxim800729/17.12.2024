public class Main4 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        // Вызов метода для проверки равенства строк с учётом регистра
        boolean result = equalsWithCase(str1, str2);

        System.out.println("Строка 1: " + str1);
        System.out.println("Строка 2: " + str2);
        System.out.println("Результат сравнения: " + result);
    }

    /**
     * Метод для проверки равенства строк с учётом регистра
     * @param str1 - первая строка
     * @param str2 - вторая строка
     * @return true, если строки равны, иначе false
     */
    public static boolean equalsWithCase(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false; // Обработка случая с null
        }
        return str1.equals(str2); // Проверка равенства с учётом регистра
    }
}
