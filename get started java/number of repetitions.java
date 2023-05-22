import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
      	//romina sahari moghadam
        int a[];
        Scanner hi = new Scanner(System.in);
        System.out.println("tedad aadad array ra bego");
        int n = hi.nextInt();
        a = new int[n];
        for(int i = 0; i < n; i ++){
            a[i] = hi.nextInt();
        }
        System.out.println("adad mored nazar ro bego");
        int x = hi.nextInt(), cnt = 0;
        for(int i = 0; i < n; i ++){
            if(x == a[i])
                cnt ++;
        }
        if(cnt != 0)
            System.out.println(cnt);
        else
            System.out.println("false");
    }
}