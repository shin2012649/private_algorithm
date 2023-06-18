import java.util.Arrays;
import java.util.Scanner;

class Member implements Comparable <Member> {
    int age;
    String name;
    
    Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
    

    public int compareTo(Member other) {
        return Integer.compare(this.age, other.age);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
        
        Member[] members = new Member[N];
        
        for (int i = 0; i < N; i++) {
            String[] input = sc.nextLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];
            members[i] = new Member(age, name);
        }
        
        Arrays.sort(members);
        
        for (Member member : members) {
            System.out.println(member.age + " " + member.name);
        }
    }
}
