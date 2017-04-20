import java.util.Scanner;

public class AddRowsAndColumns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int NumberOfRows;
		int NumberOfColumns;
		int RowOne;
		int RowTwo;
		int temp = 0;
		System.out.println("Give the number of rows and number of columns: ");
		NumberOfRows = sc.nextInt();
		NumberOfColumns = sc.nextInt();
		
		
		for (int i = 1; i <= NumberOfRows; i++) {
			for (int j = 1; j<= NumberOfColumns; j++) {
				System.out.println("Input a number for row " + i + ":");
				RowOne = sc.nextInt();
				temp += RowOne;
				
			}
		}
		System.out.println("The grand total is: " + temp);
		
		

	}
	
	

}
