public class Main6{
    //replace              metod zamenyayet staruyu stroku na novuyu
    public static void main(String[]args){
        String input= "Hello, my name is Maxim ";
        String oldString = "Maxim";
        String newStrig = "Oleg";
        String result = replaceString(input,oldString,newStrig);
        System.out.println("Original :"+ input);
        System.out.println("Result :"+ result);
    }
    public static String replaceString(String input,String oldString,String newString){
        if (input==null||oldString==null||newString==null){
            return null;
        }
        return input.replace(oldString,newString);
    }
}
