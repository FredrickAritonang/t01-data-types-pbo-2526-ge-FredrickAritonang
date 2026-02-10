import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String soal = sc.next();

        switch (soal) {

            case "Soal1": {
                int a = sc.nextInt();
                int b = sc.nextInt();

                if ((b > 0 && a > Integer.MAX_VALUE - b) ||
                    (b < 0 && a < Integer.MIN_VALUE - b)) {
                    System.out.println("OVERFLOW");
                } else {
                    System.out.println(a + b);
                }
                break;
            }

            case "Soal2": {
                double x = sc.nextDouble();
                double y = sc.nextDouble();

                float f = (float) x + (float) y;
                double d = x + y;

                System.out.printf("%.6f%n", Math.abs(d - f));
                break;
            }

            case "Soal3": {
                int n = sc.nextInt();

                Integer a = n;
                Integer b = a;

                a = a + 1;

                System.out.println("==: " + (a == b));
                System.out.println("equals: " + a.equals(b));
                break;
            }

            case "Soal4": {
                String s = sc.next();

                String a = s;
                String b = new String(s);

                a = a + "X";

                System.out.println("==: " + (a == b));
                System.out.println("equals: " + a.equals(b));
                break;
            }

            case "Soal5": {
                int i = Integer.parseInt(sc.next());
                double d = Double.parseDouble(sc.next());
                boolean flag = Boolean.parseBoolean(sc.next());

                double result = i * d;
                if (!flag) result *= -1;

                System.out.printf("%.2f%n", result);
                break;
            }
        }

        sc.close();
    }
}