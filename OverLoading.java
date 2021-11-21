class OverLoading{
	public void addition(int num1, int num2){
	System.out.println("Sum is " + (num1+num2));
		}
	public void addition(String num1, int num2){
	System.out.println("2nd Addition is "+ (num1+num2));
		}
	public static void main(String args[]){
	OverLoading sum = new OverLoading();
	sum.addition(10,20);
	sum.addition("B",10);
		}

}