public class Main9{
    public static void main(String[]args){
        String mainString="novaja stroka";
        String suffix="stroka";


        boolean result= endsWithString(mainString,suffix);
        System.out.println("stroka  "+mainString+"zakancivaetsa na "+suffix+"= "+result);
    }
    public static boolean endsWithString(String main, String suffix){
        return main.endsWith(suffix);
    }
    //endsWith        metod proveryayet zakancivaetsa li stroka na ukazannuyu stroku
}
