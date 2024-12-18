public class Main21{
    //split
    // metod razdelyayet stroku na pod stroku
    public static void main(String[] args) {
        String str = "Hello,World,This,Is,Java";
        char delimiter = ',';

        String[] result = split(str, delimiter);

        System.out.println("Результат разбиения строки:");
        for (String part : result) {
            System.out.println(part);
        }
    }

    public static String[] split(String str, char delimiter) {
        // Подсчёт количества разделителей
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == delimiter) {
                count++;
            }
        }

        // Создаём массив для подстрок
        String[] parts = new String[count];
        int partIndex = 0;
        StringBuilder current = new StringBuilder();

        // Проходим по строке и разбиваем её
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == delimiter) {
                parts[partIndex++] = current.toString();
                current.setLength(0); // Очищаем текущий буфер
            } else {
                current.append(str.charAt(i));
            }
        }
        parts[partIndex] = current.toString(); // Добавляем последнюю подстроку

        return parts;
    }
}
