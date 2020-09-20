package ArrayTest;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] arrNumbers = new int[2][3];
		
		arrNumbers[0][0] = 100;
		arrNumbers[0][1] = 200;
		arrNumbers[0][2] = 300;
		arrNumbers[1][0] = 400;
		arrNumbers[1][1] = 500;
		arrNumbers[1][2] = 600;
		
		System.out.print(arrNumbers[0][3]);
		
		for(int rowindex = 0; rowindex < 2; rowindex++ ){
			for(int colindex = 0; colindex < 3; colindex++ ){
				System.out.print(arrNumbers[rowindex][colindex] + " ");
			}
			System.out.println();
		}
		// 600 500 400
		// 300 200 100
	}

}
