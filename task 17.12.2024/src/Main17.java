public class Main17 {
    public static void main(String[] args) {
        char[] array = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
        char target = 'o';

        int result = indexOf(array, target);
        System.out.println("Индекс символа '" + target + "' в массиве: " + result);
    }

    public static int indexOf(char[] array, char ch) {
        // Проходим массив в прямом порядке
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ch) {
                return i; // Возвращаем индекс при совпадении
            }
        }
        return -1; // Символ не найден
    }
}
