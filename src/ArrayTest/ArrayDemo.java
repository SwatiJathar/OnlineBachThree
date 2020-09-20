package ArrayTest;

public class ArrayDemo {

	public static int[] getSum(int[] arr){
	
		int[] sum = new int[5];
		//	0 = 0 + 10;
		//sum[0] = sum[0] + arr[index];
		for(int index = 0; index < 5; index++ ){
			sum[0] += arr[index];
		}
		sum[1] = 1000;
		return sum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20};
		
		System.out.println(arr[3]);
		System.out.println("--------------------------------");
		int[] arrIntNum = new int[50];
		
		arrIntNum[0] = 10;
		arrIntNum[3] = 20;
		arrIntNum[1] = 30;
		arrIntNum[2] = 40;
		arrIntNum[4] = 50;
		
		//System.out.println(arrIntNum[1]);
		//System.out.println(arrIntNum[4]);
		
		for(int index = 0; index < 5; index++ ){
			System.out.println(arrIntNum[index]);
		}
		
		for(int index = 4; index >= 0; index-- ){
			System.out.println(arrIntNum[index]);
		}
		System.out.println("--------------------------------");
		
		int[] SumOfNum = getSum(arrIntNum);
		System.out.println(SumOfNum[0]);
		System.out.println(SumOfNum[1]);
		System.out.println("--------------------------------");
		for(int index = 0; index < 5; index++ ){
			System.out.println(SumOfNum[index]);
		}
		
	}

}
