public class Main13 {
//indexOf( char a , int fromIndex)
// metod vozvrasaet index dannoqo slova esli ono est nacinaya s fromIndex , inace -1

    public static void main(String[] args) {
        String str = "   Hello, World!   ";
        char target = 'o';
        int fromIndex = 5;
        int result = indexOf( target, fromIndex,str);
        System.out.println("index dannoqo slova  " + target + " nacinaya s" + fromIndex + " :" + result);
    }

    public static int indexOf(char a, int fromIndex, String str) {
        if (fromIndex < 0 || fromIndex >= str.length()) {
            return -1;
        }
        for (int i = fromIndex; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                return i;
            }
        }
        return -1;
    }
}
