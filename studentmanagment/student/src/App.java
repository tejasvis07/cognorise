import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        db ob = new db();
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();

        if (ch == 1) {
            ob.createtable();
        }
        sc.close();
    }
}
