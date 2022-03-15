package DynamicProgramming;

public class numberOfUniqueWays {
	
	public static int ways(int x, int y) {
		
		if(x > 0 && y > 0)
			return ways(x - 1, y) + ways(x, y - 1);
		else if(y > 0)
			return ways(x, y - 1);
		else if(x > 0)
			return ways(x - 1, y);
		else if(x == 0 || y == 0)
			return 1;
		else return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 3;
		int B = 4;
		System.out.println(ways(A - 1, B - 1));
	}

}
