package maximumProduct;

public class maximumProductOfFour {

	static int maxProduct(int numbersArray[], int n) {

//		Using Integer from MIN_VALUE:
		int max_product = Integer.MIN_VALUE;

//		For-loops to find the top 4 maximum numbers:
//		To find 4th largest number:
		for (int i = 0; i < n - 3; i++)

//			To find 3th largest number:
			for (int j = i + 1; j < n - 2; j++)

//				To find 2nd largest number:
				for (int k = j + 1; k < n - 1; k++)

//					To find 2st largest number:
					for (int l = k + 1; l < n; l++)

//						Then multiply them with each other to find the maximum product"
						max_product = Math.max(max_product,
								numbersArray[i] * numbersArray[j] * numbersArray[k] * numbersArray[l]);

//		To return the Max product of the equation:
		return max_product;
	}

//	Driver Code
	public static void main(String[] args) {

//		Array of numbers:
		int numbersArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

//		To find the length of array:
		int n = numbersArray.length;
		int max = maxProduct(numbersArray, n);

		System.out.println("The Equation is " + numbersArray[n - 4] + " x " + numbersArray[n - 3] + " x "
				+ numbersArray[n - 2] + " x " + numbersArray[n - 1] + " = " + max);
		System.out.println("Maximum product is " + "|| " + max + " ||");
	}
}