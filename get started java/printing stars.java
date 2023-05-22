import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        //romina sahari moghadam
        Scanner hi = new Scanner(System.in);
        int a = hi.nextInt(), b = hi.nextInt();
        System.out.println("addad az bein 1 ta 4 entekhab konid");
        System.out.println("1 : jam 2 adad");
        System.out.println("2 : ekhtelaf adad bozorg az kochak");
        System.out.println("3 : zarb 2 adad");
        System.out.println("4 : taghsim 2 adad");
        int i = hi.nextInt();
        switch(i){
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                int x = a, y = b;
                if(b > a){
                    y = a;
                    x = b;
                }
                System.out.println(x - y);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if(b == 0)
                    System.out.println("tarif nashode");
                else
                    System.out.println((double)a/ b);
                break;

        }

    }
}