public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverseString("My School is ABC"));

    }public static String reverseString(String a){
        StringBuilder outputString = new StringBuilder();
        int count=a.length()-1;
        while ((count>=0)){
            outputString.append(a.charAt(count));
            count--;
        }
        return outputString.toString();
    }

}
