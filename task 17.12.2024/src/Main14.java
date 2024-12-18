public class Main14{
//lastIndexOf( char a)   metod vozvrasaet index dannoqo simvola s konca , inace -1
public static void main(String[] args) {
    String str = "   Hello, World!   ";
    char target = 'o';
    int result=lastIndexOf( str,target);
        System.out.println("index dannoqo simvola :'" + target + "' s konca = "  + result);
    }
    public static int lastIndexOf(String str,char a){

        for (int i = str.length()-1; i>=0;i--){
            if (str.charAt(i)==a){
                return i;
            }
        }
        return -1;
    }
}

