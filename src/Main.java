import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        input = input.toLowerCase();
        char[] charArray = input.toCharArray();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i<charArray.length;i++)
        {
        if (input.lastIndexOf(input.charAt(i)) != (input.indexOf(input.charAt(i)))) {
                str.append(")");
        }
        else str.append("(");
        }

        System.out.println("input: " + input);
        System.out.println("output " + str);
    }
}
