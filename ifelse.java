package project;

public class ifelse {
	public static void main(String[] args) {
		int[] num = {5,45,32,68,94,32};
		int max = num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max = num[i];
			}
		}System.out.println(max);
	}

}
