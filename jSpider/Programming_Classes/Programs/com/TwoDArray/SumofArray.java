package twoDArray;

public class SumofArray {
	
	public static void main(String[] args) {
		int [][] arr= {{1,2,3}, {7,3},{9,2,3,3}};
		int sum=0;
		for(int[] ele:arr) {
			for(int ele2:ele) {
				sum+=ele2;
			}
		}
		System.out.println(sum);
	}

}
