import java.util.Scanner;

public class ans1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("First Name:  ");
        String f_name = sc.next();
        System.out.print("Last Name:  ");
        String l_name = sc.next();
        System.out.print("Roll no. : ");
        int r_no = sc.nextInt();
        System.out.print("Field of Interest: ");
        String Field_of_interest= sc.next();
        System.out.println("Name : "+f_name +" "+l_name);
        System.out.println("Roll Number : "+ r_no);
        System.out.println("Field of Interest: "+Field_of_interest);
    }
}
