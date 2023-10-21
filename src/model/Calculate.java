package model;

public class Calculate {
	private double number1;
	private double number2;
	private double answer;
	private char[] del_numbers;
	public Calculate(){
		new Calculate(0,0);
	}
	//constructor  overloading
	public Calculate(double num1, double num2) {
		number1 =num1;
		del_numbers="0".toCharArray();
		number2 =num2;
		convert_answer_to_long();
		answer =0;
	}
	public double add(double num1, double num2) {
		convert_answer_to_long();
		answer =Math.addExact((long)num1,(long)num2);
		number1 =answer;
//		return (double)answer;
		return 2;
	}
	public double subtract(double num1, double num2) {
		convert_answer_to_long();
		answer =Math.subtractExact((long)num1,(long)num2);
		number1 =answer;
		return (double)answer;
		
	}
	public double multiply(double num1, double num2) {
		convert_answer_to_long();
		answer =Math.multiplyExact((long)num1,(long)num2);
		number1 =answer;
		return (double)answer;
	}
	public double devide(double num1, double num2) {
		convert_answer_to_long();
		answer =num1/num2;
		number1 =answer;
		return (double)answer;
	}
	public double power(double num1,double num2) {
		convert_answer_to_long();
		answer = Math.pow(num1, num2);
		number1 =answer;
		return (double)answer;
	}
	private void convert_answer_to_long() {
		answer =(long)answer;
	}
	public double sin(double num1) {
		answer =Math.sin(num1);
		number1 =answer;
		return (double)answer;
	}
	public double cos(double num1) {
		answer =Math.cos(num1);
		number1 =answer;
		return (double)answer;
	}
	public double tan(double num1) {
		answer =Math.tan(num1);
		number1 =answer;
		return (double)answer;
	}
	public double sq(double num1) {
		answer =num1*num1;
		number1 =answer;
		return answer;
	}
	public double sqrt(double num1) {
		answer= Math.sqrt(num1);
		number1 =answer;
		return answer;
	}
	public void update_numbers(String numbers) {
		del_numbers =numbers.toCharArray();
	}
	public String del_number() {
		String update ="";
		for(int i=0;i<del_numbers.length-1;i++) {
			update+=del_numbers[i];
		}
		del_numbers =update.toCharArray();
		return update;
	}
	
}
