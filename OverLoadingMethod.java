class OverLoadingMethod{
	
	public int sum(int num1, int num2){
	return (num1+num2);
		}
	public float sum(float num3, float num4){
	return (num3+num4);
		}
	public static void main(String args[]){
	OverLoadingMethod add= new OverLoadingMethod();
	add.sum(20,30);
	add.sum(10.2f,20.2f);
	System.out.println("The Addition of Two Over Loading Method is "+add.sum(20,20));
	System.out.println("The Addition of Two Over Loading Method is "+add.sum(20.2f,20.2f));
	}

}