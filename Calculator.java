import java.lang.Math; //Импорт библиотеки с математическими методами

//Важно отметить что этот калькулятор не претендует на звание самого точного, наоборот он был создан в качестве выполнения задания и основным результатом решения является integer

public class Calculator{ //Создание класса Калькулятор, совпадающее с названием файла в котором написан данный класс(иначе не сработает)
	private int result; //приватная(доступна только в этом классе) integer(целочисленная) переменная под названием result, в которую будет записываться результат математической операции.
	
	public void add(int ... parameters){ //метод названный add который выполняет функцию сложения. Параметры попадающие в метод сохраняются в интовый массив с названием parameters
		for(Integer param: parameters){ //цикл for в котором выполняется действие в блоке кода, столько раз, сколько находится в массиве parameters значений
			this.result += param; // в this.result "this" выполняет функцию указателя на переменную result в "этом" конкретном объекте. += param добавляет к значению result текущее значение переменной param		
		}	
	}
		
	public void sub(int ... parameters){ //метод называнный мной sub который выполняет функцию вычитания. Параметры записываются в массив parameters
		this.result = parameters[0] - parameters[1]; // в переменную result этого объекта будет записан результат вычитания числа в первом индексе массива parameters из числа в нулевом индексе массива parameters(в джава индексы начинаются с "0") 
	}
	
	public void mul(int ... parameters){ //метод с названием mul который выполняет функию умножения. Параметры записываются в массива parameters
		this.result = 1; // в результат сначала вносится "1" поскольку изначально в result хранится значение "0", что при дальнейшем вычислении даст результатом первого вычисления "1" 
		for(Integer param: parameters){
			this.result = this.result * param;
		}
	}
	
	public void div(int ... parameters){
		this.result = parameters[0]/ parameters[1];
	}
	
	public void power(int ... parameters){
		double firstNum = (double) parameters[0];
		double secondNum = (double) parameters[1];
		double tempRes = Math.pow(firstNum, secondNum);
		this.result = (int) tempRes;
	}
	
	public int getResult(){
		return this.result;
	}

	public void cleanResult(){
		this.result = 0;
	}
}
