import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        //romina sahari moghadam
        int a[], mx = -1000;
        Scanner hi = new Scanner(System.in);
        int n = hi.nextInt();
        a = new int[n];
        for(int i = 0; i < n; i ++){
            int x = hi.nextInt();
            if(x > mx)
                mx = x;
        }
        System.out.println(mx);
    }
}