import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
    public static void main(String[] args) {
        String a = "aa";
        String b = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            b = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        char[] ch = b.toCharArray();
        String nextStep = String.valueOf(ch);
        String change = nextStep.replaceAll("[^a-z]", " ");
        System.out.println(a +"  "+ b + "  "+ change+"\n");
        System.out.println(a==change);
        String input = "\t!abc 1!!()абв~Ё";
        System.out.println(input.replaceAll("[^a-z]", ""));
    }
}
