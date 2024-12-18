public class Main10{
    public static void main(String[]args){
        String mainString="novaja stroka";
        int startIndex =8;
        int endIndex=12;
        String result =extractSubstring(mainString,startIndex,endIndex);
        System.out.println("Ishodnaja straka  :"+mainString);
        System.out.println("izvlechennaja podstroka  :" +result);
    //substring   metod izvlekaet pod stroku iz tekusey straki
}
public static String extractSubstring(String str, int start,int end){
    return str.substring(start,end);
    }
}
