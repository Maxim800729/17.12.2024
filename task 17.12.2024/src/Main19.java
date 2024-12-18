public class Main19{
    //lastIndexOf( char[] a , int fromIndex)
    // metod vozvrasaet index dannoqo slova s konca esli ono est nacinaya s fromIndex  , inace -1
    public static void main(String[] args) {
        char[] array = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
        char target = 'o';
        int fromIndex = 8; // Начальный индекс поиска с конца

        int result = lastIndexOf(array, target, fromIndex);
        System.out.println("Индекс символа '" + target + "' с конца, начиная с индекса " + fromIndex + ": " + result);
    }

    public static int lastIndexOf(char[] array, char ch, int fromIndex) {
        // Проверка допустимого индекса
        if (fromIndex >= array.length) {
            fromIndex = array.length - 1; // Если индекс выходит за пределы, начинаем с конца
        }
        if (fromIndex < 0) {
            return -1; // Некорректный индекс
        }

        // Обратный цикл от fromIndex до начала массива
        for (int i = fromIndex; i >= 0; i--) {
            if (array[i] == ch) {
                return i; // Возвращаем индекс при совпадении
            }
        }
        return -1; // Символ не найден
    }
}
