package project;

public class LaegestofNnum {
	public static void main(String[] args) {
			int[] num = {5,45,32,68,94,32,99,58};
			int largest = num[0];
			for(int i=0;i<num.length;i++) {
				if(num[i]>largest) {
					largest= num[i];
				}
			}System.out.println(largest);
		}
	}

