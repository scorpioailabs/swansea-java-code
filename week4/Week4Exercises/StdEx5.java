class StdEx5 {
	public static void main(String[]args) {
		int N = Integer.parseInt(args[0]);
		final int i = N + 10;
		do{
			System.out.println(N+=1);
		}
		while (N < i) ;

	}
}