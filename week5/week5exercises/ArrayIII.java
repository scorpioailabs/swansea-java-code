import java.util.Scanner;
public class ArrayIII{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int N = Integer.parseInt(args[0]);
		int [] a = new int [N]; //declared and creted array with size N

		for (int i = 0; i < N -1 ; i++){ //initialised array 
			a[i] = input.nextInt();
		}
	}
}

