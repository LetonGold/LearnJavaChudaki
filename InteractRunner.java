import java.util.Scanner;

public class InteractRunner{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit = "no";
			while(!exit.equals("yes")){
				System.out.println("Enter first arg :");
				String first = read.next();
				System.out.println("Enter second arg :");
				String second = read.next();
				calc.add(Integer.valueOf(first), Integer.valueOf(second));
				System.out.println("Result: " + calc.getResult());
				calc.cleanResult();
				System.out.println("Exit: yes\no ");
				exit = read.next();
			}
		}finally{
			read.close();
		}
	}
}