import java.lang.Math;

public class Calculator{
	private int result;
	
	public void add(int ... parameters){
		for(Integer param: parameters){
			this.result += param;		
		}	
	}
		
	public void sub(int ... parameters){
		this.result = parameters[0] - parameters[1];
	}
	
	public void mul(int ... parameters){
		this.result = 1;
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
