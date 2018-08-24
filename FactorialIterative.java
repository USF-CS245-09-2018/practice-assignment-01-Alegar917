public class FactorialIterative implements Factorial{
	public int factorial(int n){
		int total=1;
		for(int i=1;i>0;i--){
			total=total*i;
		}
		return total;
	}

}