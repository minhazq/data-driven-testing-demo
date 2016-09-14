package mq.data_driven_testing_demo;

public class Temp {

	public static void main(String[] args) {
		
		
		Object[][] obj = new Object[2][3];
		
		obj[0][0] = "a";
		obj[0][1] = "b";
		obj[0][2] = "c";
		obj[1][0] = "d";
		obj[1][1] ="e";
		obj[1][2]="f";
		
		int col = 0;
		int row = 0;
		
		for(row=0; row<2; row++){
			for(col = 0; col<3; col++){
				System.out.print(obj[row][col]);
			}
			System.out.println("");
			
		}
		

	}

}
