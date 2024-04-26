package block;

public class Main {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		System.out.println();
		
		//next block
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			//for(int k = 0; k<=)
			System.out.println();
		}
		System.out.println();
		
		//next block
		
		for(int i = 0; i < 5; i++) {
			for(int k = 0; k <= 5-i; k++ ) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//next block
		
		for( int i = 0; i < 5; i++) {
			for(int j = 0; j <= 5; j++) {
				if(i == 0 || i == 4 || j == 0 || j == 5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//next block
		int row = 5;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < row; j++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		//next block
		
		int row1 = 5;
		for(int i = 0; i <= row1; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		//next block
		
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j <= 5; j++) {
				System.out.print(j + 1 + " ");
			}
			System.out.println();
		}
		

	}

}
