public class Main11{
    public static void main(String[] args) {
        String str1 = "Hello";
        char[] charArray=toCharArray(str1);
        for (char c:charArray){
            System.out.print(c+ " , ");
        }
    //toCharArray              metod konvirtiruet stroku v massiv char
}

    public static char[] toCharArray(String str1){
        return  str1.toCharArray();
    }
}
