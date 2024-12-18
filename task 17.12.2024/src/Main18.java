public class Main18{
    //indexOf( char[] a , int fromIndex)
    // metod vozvrasaet index dannoqo slova esli ono est nacinaya s fromIndex  , inace -1

    public static void main(String[] args) {
        char[] array = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
        char target = 'o';
        int fromIndex = 5; // Начальный индекс поиска

        int result = indexOf(array, target, fromIndex);
        System.out.println("Индекс символа '" + target + "' начиная с индекса " + fromIndex + ": " + result);
    }

    public static int indexOf(char[] array, char ch, int fromIndex) {
        // Проверка на допустимый индекс
        if (fromIndex < 0 || fromIndex >= array.length) {
            return -1; // Некорректный индекс
        }

        // Проходим массив от fromIndex до конца
        for (int i = fromIndex; i < array.length; i++) {
            if (array[i] == ch) {
                return i; // Возвращаем индекс найденного символа
            }
        }
        return -1; // Символ не найден
    }
}
