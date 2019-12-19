package day2;

public class ProgramAlarm {

	public static void main(String[] args) {
		// practice array to test
		int[] nums = { 1, 12, 2, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 1, 9, 19, 1, 19, 5, 23, 2, 6, 23, 27, 1, 6,
				27, 31, 2, 31, 9, 35, 1, 35, 6, 39, 1, 10, 39, 43, 2, 9, 43, 47, 1, 5, 47, 51, 2, 51, 6, 55, 1, 5, 55,
				59, 2, 13, 59, 63, 1, 63, 5, 67, 2, 67, 13, 71, 1, 71, 9, 75, 1, 75, 6, 79, 2, 79, 6, 83, 1, 83, 5, 87,
				2, 87, 9, 91, 2, 9, 91, 95, 1, 5, 95, 99, 2, 99, 13, 103, 1, 103, 5, 107, 1, 2, 107, 111, 1, 111, 5, 0,
				99, 2, 14, 0, 0 };
		// variables to hold the numbers
		int firstNum;
		int secondNum;
		int thirdNum;
		int fourthNum;

		for (int i = 0; i < nums.length; i++) {
			try {
				// assigning first group of four

				firstNum = nums[i];
				secondNum = nums[i + 1];
				thirdNum = nums[i + 2];
				fourthNum = nums[i + 3];
				// stepping forward every 4 numbers
				if (i % 4 == 0) {
					// self - explanatory
					if (firstNum == 1) {
						int addPosition1 = nums[secondNum];
						int addPosition2 = nums[thirdNum];
						nums[fourthNum] = addPosition1 + addPosition2;
					} else if (firstNum == 2) {
						int mulPosition1 = nums[secondNum];
						int mulPosition2 = nums[thirdNum];
						nums[fourthNum] = mulPosition1 * mulPosition2;
					} else if (firstNum == 99) {
						break;
					} else {
						System.out.println("Something has went wrong!");
						break;
					}

				}
			} catch (Exception e) {
				System.out.println("There's not enough numbers to get calculations from!");
				break;
			}
		}
		for (int x = 0; x < nums.length; x++) {
			System.out.println(nums[x]);
		}
		System.out.println("The value at position 0 is " + nums[0] + ".");
	}
}
