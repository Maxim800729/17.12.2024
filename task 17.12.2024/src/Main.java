//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


//lTrim                                      +      metod udalyayet probeli s leva
public class Main {
    public static void main(String[]args){
        String input = "   Hello, World!   ";
        String result = lTrim(input);
        System.out.println("Оригинал: [" + input + "]");
        System.out.println("Результат: [" + result + "]");

}
public static String lTrim(String str) {
    if (str == null) {
        return null; // Обработка null
    }

    int start = 0; // Начальный индекс непустого текста
    int end = str.length() - 1; // Конечный индекс непустого текста

    // Удаляем пробелы слева
    while (start <= end && str.charAt(start) == ' ') {
        start++;
    }

    // Возвращаем подстроку между индексами start и end включительно
    return str.substring(start, end + 1);
}
    }
