import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String soal = sc.next();

        if (soal.equals("Soal1")) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // Deteksi integer overflow tanpa long / try-catch
            if ((b > 0 && a > Integer.MAX_VALUE - b) ||
                (b < 0 && a < Integer.MIN_VALUE - b)) {
                System.out.println("OVERFLOW");
            } else {
                System.out.println(a + b);
            }

        } else if (soal.equals("Soal2")) {

            // Parsing TERPISAH untuk float dan double
            String xs = sc.next();
            String ys = sc.next();

            float xf = Float.parseFloat(xs);
            float yf = Float.parseFloat(ys);

            double xd = Double.parseDouble(xs);
            double yd = Double.parseDouble(ys);

            float sumFloat = xf + yf;
            double sumDouble = xd + yd;

            double diff = Math.abs(sumDouble - sumFloat);
            System.out.printf("%.6f%n", diff);

        } else if (soal.equals("Soal3")) {
            int N = sc.nextInt();

            Integer a = N;
            Integer b = a;

            a = a + 1;

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));

        } else if (soal.equals("Soal4")) {
            String S = sc.next();

            String a = S;
            String b = new String(S);

            a = a + "X";

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));

        } else if (soal.equals("Soal5")) {
            String intStr = sc.next();
            String doubleStr = sc.next();
            String boolStr = sc.next();

            int i = Integer.parseInt(intStr);
            double d = Double.parseDouble(doubleStr);
            boolean flag = Boolean.parseBoolean(boolStr);

            double result = i * d;
            if (!flag) {
                result *= -1;
            }

            System.out.printf("%.2f%n", result);
        }

        sc.close();
    }
}