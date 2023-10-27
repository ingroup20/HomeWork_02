package hw4;

public class ArrayAvgMax {
	/*
	 * • 有個一維陣列如下: {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
	 * 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
	 */

	public double getAvg(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		double avg = sum / array.length;
		return avg;
	}

	public void maxAvg(int[] array, double avg) {
		int[] pickMaxNumber = new int[array.length];
		int indexCount = 0;
		int originalIndex = 0;
		while (originalIndex < array.length) {
			if (array[originalIndex] > avg) {
				pickMaxNumber[indexCount] = array[originalIndex];
				indexCount++;
				originalIndex++;
			} else
				originalIndex++;
		}
		System.out.print("大於平均值的元素 : ");
		printArray(pickMaxNumber, indexCount);

	}

	/****陣列印出多型*******************************************************/
	public void printArray(int[] array, int endIndex) {

		int printCount = 0;
		while (printCount < endIndex) {
			System.out.print(array[printCount] + "\t");
			printCount++;
		}
		System.out.println();
	}
	
	
	public void printArray(String[] array, int endIndex) {

		int printCount = 0;
		while (printCount < endIndex) {
			System.out.print(array[printCount] + "\t");
			printCount++;
		}
		System.out.println();
	}
/*************************************************************/
	public static void main(String[] args) {
		ArrayAvgMax a1 = new ArrayAvgMax();
		int[] array = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		System.out.println("陣列元素: ");
		a1.printArray(array, array.length);

		double avg = a1.getAvg(array);
		System.out.println("陣列元素平均值= " + avg);

		a1.maxAvg(array, avg);

	}
}
