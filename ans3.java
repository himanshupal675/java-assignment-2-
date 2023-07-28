import java.util.Scanner;

public class ans3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Marks :");
        int mark_1=sc.nextInt();
        int mark_2=sc.nextInt();
        int mark_3=sc.nextInt();
        System.out.println((mark_1+mark_2+mark_3));
        System.out.println((mark_1+mark_2+mark_3)/3+"%");
    }
}