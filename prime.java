package project;

public class prime {
	public static void main(String[] args) {
		int num = 105;
		int count =0;
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				count=count+1;
			
				}
		}
		if(count==2) {
			System.out.println(" Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
			}
	
	}

}
