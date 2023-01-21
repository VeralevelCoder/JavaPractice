import java.util.HashMap;

public class CharactersCount {

    public static void main(String[] args) {

        String a = "Good looking";
        String b = a.toLowerCase().replaceAll("\\s","");
        HashMap<Character, Integer> output = new HashMap<>();
        for (int i = 0; i < b.length(); i++) {
            if (output.containsKey(b.charAt(i))) {
                int count = output.containsKey(b.charAt(i)) ? output.get(b.charAt(i)) : 0;
                output.put(b.charAt(i), count + 1);
            } else {
                output.put(b.charAt(i), 1);
            }
        }System.out.println(output);
    }}


