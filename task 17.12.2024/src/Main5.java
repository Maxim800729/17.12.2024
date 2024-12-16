public class Main5{
    //startsWith              metod proveryayet nacinaetsa li stroka na ukazannuyu stroku
    public static void main(String[]args){
        String input = " Hello, world";
        String prefix ="Hello";
        boolean result=startsWithString(input,prefix);
        System.out.println("Stroka: [ " +input+"]");
        System.out.println("Prefix: [ " +prefix+"]");
        System.out.println("Nachinaetsa strjka s prefixa:  " +result);

    }
    public static boolean startsWithString(String str,String prefix){
        if (str==null||prefix==null){

            return false;

        }
        return str.startsWith(prefix);
    }
}
