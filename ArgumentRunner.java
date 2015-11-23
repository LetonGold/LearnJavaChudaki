public class ArgumentRunner{
	public static void main(String[] args){
		Calculator calc = new Calculator();
		calc.add(args);
		System.out.println("Result is : " + calc.getResult());
	}
}