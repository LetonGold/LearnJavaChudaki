import java.util.Scanner; //импорт класса отвечающего за ввод с клавиатуры

public class InteractRunner{ //создание класса InteractRunner, которое совпадает с именем файла.(обязательно)
	public static void main(String[] args){ //точка входа в программу (главный метод класса, с этой строки всегда начинается выполнение кода в программе, если этого метода нет то класс джава не будет выполняться совсем, вместо этого в нем могут храниться методы и переменные для использования другими классами)
		Scanner read = new Scanner(System.in); //создание ссылки на объект под названием read с типом Scanner с последующим созданием нового объекта с типом Scanner, который слушает события системного ввода (клавиатура)
		try{
			Calculator calc = new Calculator(); // создание ссылки на объект calc с типом Calculator и присвоение ему нового объекта с типом Calculator; 
			String exit = "no"; // переменная, в которой хранится текстовое значение, сверяя с которым цикл while сможет закрыть программу, если там окажется значение "yes"
			int persistentResult = 0; // результат, хранимый в этом классе и необходимый в случае если нужно использовать результат предыдущего вычисления
			int firstint = 0; // заранее инициализированная переменная firstint значением 0
			String useResNxt = "no";// переменная, в которой хранится текстовое значение, сверяя с которым переключатель switch(useResNxt) способен выбрать какой вариант первого числа в вычислении предпочитаем, изначальное значение no
			while(!exit.equals("yes")){ //цикл, который будет выполняться до тех пор, пока значение переменной exit не станет равно "yes" после выхода из цикла программа завершится
				
				switch(useResNxt){ // переключатель, который выбирает какой вариант первого числа использовать в текущей итерации
					case "yes": // значение yes в переменной useResNxt выбирает вариант использования в качестве первого числа значение хранимое в переменной persistentResult
						System.out.println("Your past result will be the first argument.");//вывод на экран сообщения что первое число было взято из результата предыдущего решения
						firstint = persistentResult; // присвоение переменной firstint значения хранимого в переменной persistentResult
						break;//остановка(останавливает код в этом месте и выходит из выполнения цикла или не позволяет использовать дальнейший код в switch)
					case "no": // значение no (по умолчанию) выбирает вариант использования первого числа запрашиваемого у пользователя с последующей записью с клавиатуры значения
						System.out.println("Enter first arg :"); // вывод на экран запроса ввода первого числа
						int firstint = read.nextInt(); // ожидание ввода от пользователя первого числа и запись полученного числа в переменную first
						break;
					default: System.out.println("There is an error in useResNxt switch"); //значение switch которое должно существовать в любом случае, в данном переключателе я поставил его вернуть значение, с написанной ошибкой если в переменной не хранится "yes" или "no"
						break;
				
				}
				
				System.out.println("Enter operation symbol: ");
				String symb = read.next();
				
				System.out.println("Enter second arg :");
				int secondint = read.nextInt();
				
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
