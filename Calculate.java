import java.lang.Math;

public class Calculate{
    public static void main(String[] args) {
        int first = Integer.valueOf(args[0]);
        String SymAction = args[1];
        int second = Integer.valueOf(args[2]);
        double result = 0;

        switch(SymAction){
            case "+": result = first + second;
                break;
            case "-": result = first - second;
                break;
            case "x": result = first * second;
                break;
            case "/": result = first / second;
                break;
            case "pow": result = Math.pow(first, second);
		break;
            default : System.out.println("Invalid expression.");
                break;
        }
        System.out.println(result);
    }
}
