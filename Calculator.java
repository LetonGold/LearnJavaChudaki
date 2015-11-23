public class Calculator{
	private int result;
	public void add(int ... params){
		for(Integer param: params){
			this.result += param;		
		}	
	}
	
	public void add(String ... params){
		for(String param: params){
			int additive = Integer.valueOf(param);
			this.result += additive;		
		}
	}
	
	public int getResult(){
		return this.result;
	}

	public void cleanResult(){
		this.result = 0;
	}
}
