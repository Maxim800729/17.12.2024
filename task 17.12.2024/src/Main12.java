public class Main12{
    public static void main(String[]args){
        String str = "Hello, World!";
        char target = 'o';
        int index = indexOf(str,target);
        System.out.println("index dannoqo simvola " +target+ " =" +index);

    }

    public static int indexOf(String str, char ch){
        for (int i=0; i<str.length();i++){
            if (str.charAt(i)==ch){
                return i;
            }
        };
       return -1;
    }
    //indexOf( char a)          metod vozvrasaet index dannoqo simvola
}
