
public class Example34 {
    public static void main(String[] args) {
       double e = 1, denom = 1;

        for (int i = 1; i <= 1000; i++) {
            denom = denom * i;
            e = e + 1 / denom;
        }
        System.out.println(e);
    }
}
