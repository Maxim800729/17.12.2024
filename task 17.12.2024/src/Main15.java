public class Main15 {
    //lastIndexOf( char a , int fromIndex)
    // metod vozvrasaet index dannoqo slova s konca esli ono est nacinaya s fromIndex , inace -1
    public static void main(String[] args) {
        String str = "Hello, World!";
        char target = 'o';
        int fromIndex = 10; // Начальный индекс поиска с конца

        int result = lastIndexOf(str, target, fromIndex);
        System.out.println("Индекс символа '" + target + "' начиная с конца и с индекса " + fromIndex + ": " + result);
    }

    public static int lastIndexOf(String str, char ch, int fromIndex) {
        // Проверка допустимого диапазона
        if (fromIndex >= str.length()) {
            fromIndex = str.length() - 1; // Если индекс за пределами, начинаем с конца строки
        }
        if (fromIndex < 0) {
            return -1; // Невалидный индекс
        }

        // Проходим строку в обратном порядке
        for (int i = fromIndex; i >= 0; i--) {
            if (str.charAt(i) == ch) {
                return i; // Возвращаем индекс при совпадении
            }
        }
        return -1; // Символ не найден
    }
}
