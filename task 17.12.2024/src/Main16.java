public class Main16 {
    public static void main(String[] args) {
        char[] array = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
        char target = 'o';

        int result = lastIndexOf(array, target);
        System.out.println("Индекс символа '" + target + "' с конца: " + result);
    }

    public static int lastIndexOf(char[] array, char ch) {
        // Проходим массив в обратном порядке
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == ch) {
                return i; // Возвращаем индекс найденного символа
            }
        }
        return -1; // Если символ не найден
    }
}
