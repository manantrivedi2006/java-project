import java.util.Scanner;
public class main{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your starting point");
		String s1=sc.nextLine();
		System.out.println("enter your destination point");
		String s2=sc.nextLine();
		if (s1.equals("rajkot")&&s2.equals("mumbai")) {
			System.out.println("there are two trains");
			System.out.println("first train no is 17726");
			System.out.println("second train no is 17728");

		}
		System.out.println("enter your train no 1 or 2");
		int a=sc.nextInt();
		if(a==1){
			System.out.println("in first train there are five coaches s1,s2,b1,a1,h1");
			System.out.println("enter coaches name which you want");
			String coach=sc.nextLine();
			
		}

	}
}