public class Main8{
    public static void main(String[] args) {
        String originalString="tekusaja stroka";
        String newString= " novuya stroka";

        String result = addString(originalString,newString);
        System.out.println("resultat :"+result);
    }

    public static String addString(String current,String toAdd){
        return current.concat(toAdd);
    }
    //concat         metod kotoriy dobovlyayew k tekusey stroke novuyu stroku

}
