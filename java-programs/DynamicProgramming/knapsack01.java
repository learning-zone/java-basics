package DynamicProgramming;

public class knapsack01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = { 10, 40, 30, 50 };
		int[] weight = { 5, 4, 6, 3 };
		int W = 10;

		int[] values2 = { 60, 100, 120 };
		int[] weight2 = { 10, 20, 30 };
		int w2 = 50;

		System.out.println(getMaxValue(values, weight, 0, W, 0));
		System.out.println(getMaxValue(values2, weight2, 0, w2, 0));
	}

	public static int getMaxValue(int[] values, int[] weight, int index, int w, int val) {
		// TODO Auto-generated method stub
		if (index == values.length)
			return val;

		if (w - weight[index] >= 0) {
			return Math.max(getMaxValue(values, weight, index + 1, w - weight[index], val + values[index]),
					getMaxValue(values, weight, index + 1, w, val));
		} else {
			return getMaxValue(values, weight, index + 1, w, val);
		}
	}

}
