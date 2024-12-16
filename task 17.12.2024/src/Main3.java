public class Main3 {
    public static void main(String[] args) {
        String input = "   Hello, World!   ";
        String result = Trim(input);
        System.out.println("Оригинал: [" + input + "]");
        System.out.println("Результат: [" + result + "]");
    }

    /**
     * Метод Trim удаляет пробелы с обеих сторон строки
     * @param str - входная строка
     * @return строка без пробелов слева и справа
     */
    public static String Trim(String str) {
        if (str == null) {
            return null; // Обработка null
        }

        int start = 0; // Начальный индекс непустого текста
        int end = str.length() - 1; // Конечный индекс непустого текста

        // Удаляем пробелы слева
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Удаляем пробелы справа
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        // Возвращаем подстроку между индексами start и end включительно
        return str.substring(start, end + 1);
    }
}