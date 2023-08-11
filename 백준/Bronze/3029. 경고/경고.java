import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String now = sc.next();
        String bombT = sc.next();

        sc.close();

        if (now.equals(bombT)) {
            System.out.print("24:00:00");
            System.exit(0);
        }

        int h = Integer.parseInt(bombT.split(":")[0]) - Integer.parseInt(now.split(":")[0]);
        int m = Integer.parseInt(bombT.split(":")[1]) - Integer.parseInt(now.split(":")[1]);
        int s = Integer.parseInt(bombT.split(":")[2]) - Integer.parseInt(now.split(":")[2]);

        if (s < 0) {
            s += 60;
            --m;
        }

        if (m < 0) {
            m += 60;
            --h;
        }

        if (h < 0) {
            h += 24;
        }

        System.out.format("%02d:%02d:%02d", h, m, s);
    }
}
