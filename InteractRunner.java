import java.util.Scanner; //импорт класса отвечающего за ввод с клавиатуры

public class InteractRunner{ //создание класса InteractRunner, которое совпадает с именем файла.(обязательно)
	public static void main(String[] args){ //точка входа в программу (главный метод класса, с этой строки всегда начинается выполнение кода в программе, если этого метода нет то класс джава не будет выполняться совсем, вместо этого в нем могут храниться методы и переменные для использования другими классами)
		Scanner read = new Scanner(System.in); //создание ссылки на объект под названием read с типом Scanner с последующим созданием нового объекта с типом Scanner, который слушает события системного ввода (клавиатура)
		try{
			Calculator calc = new Calculator();
			String exit = "no";
			int persistentResult = 0;
			int firstint = 0;
			String useResNxt = "no";
			while(!exit.equals("yes")){
				
				switch(useResNxt){
					case "yes":
						System.out.println("Your past result will be the first argument.");
						firstint = persistentResult;
						break;
					case "no":
						System.out.println("Enter first arg :");
						String first = read.next();
						firstint = Integer.valueOf(first);
						break;
					default: System.out.println("There is an error in answ switch");
						break;
				
				}
				System.out.println("Enter second arg :");
				String second = read.next();
				int secondint = Integer.valueOf(second);
				
				System.out.println("Enter operation symbol: ");
				String symb = read.next();
				
				
				switch(symb){
					case "+": calc.add(firstint, secondint);
						break;
					case "-": calc.sub(firstint, secondint);
						break;
					case "x": calc.mul(firstint, secondint);
						break;
					case "/": calc.div(firstint, secondint);
						break;
					case "pow": calc.power(firstint, secondint);
						break;
					default: System.out.println("Please enter valid operation symbol (+, -, x, /, pow)");
						break;
				}
				
				persistentResult = calc.getResult();
				calc.cleanResult();
				System.out.println("Result: " + persistentResult);
				System.out.println("Exit: yes\no ");
				exit = read.next();
				if(exit.equals("yes"))break;
				System.out.println("Will you use your result in the next operation? ");
				useResNxt = read.next();
			}
		}finally{
			read.close();
		}
	}
}
