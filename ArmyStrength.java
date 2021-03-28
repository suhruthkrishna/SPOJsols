import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public final static String GODZILLA = "Godzilla";
    public final static String MECHAGODZILLA = "MechaGodzilla";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int testcases = Integer.parseInt(in.readLine());
        while (testcases-- > 0) {
            in.readLine();
            StringTokenizer tokenizer = new StringTokenizer(in.readLine());
            int ng = Integer.parseInt(tokenizer.nextToken());
            int nm = Integer.parseInt(tokenizer.nextToken());


            int strongestOfGodzilla = 0;
            tokenizer = new StringTokenizer(in.readLine());
            for (int i = 0; i < ng; i++) {
                int strength = Integer.parseInt(tokenizer.nextToken());
                if (strength > strongestOfGodzilla)
                    strongestOfGodzilla = strength;
            }
            int strongestOfMechaGodzilla = 0;
            tokenizer = new StringTokenizer(in.readLine());
            for (int i = 0; i < nm; i++) {
                int strength = Integer.parseInt(tokenizer.nextToken());
                if (strength > strongestOfMechaGodzilla)
                    strongestOfMechaGodzilla = strength;
            }


            if (strongestOfGodzilla >= strongestOfMechaGodzilla)
                out.println(GODZILLA);
            else
                out.println(MECHAGODZILLA);
        }
        out.flush();
    }
}
