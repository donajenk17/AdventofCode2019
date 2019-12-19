package Day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class day1 {

	public static void main(String[] args) {
		try {
			//array list to hold requirements
			ArrayList<Integer> reqs = new ArrayList<Integer>();
			
			//read contents from file
			File file = new File("C:\\Users\\607703\\eclipse-workspace\\AdventofCode2019\\src\\Day1\\module.txt");
			Scanner myReader = new Scanner(file);
			
			//while file has a next line
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				int Snum = Integer.parseInt(data);
				int calcMass = getReq(Snum);
				reqs.add(calcMass);
				}
			//adds all the numbers in list together and gives final sum
			int finalSum = 0;
			for (int d : reqs) {
				finalSum += d;
			}
			System.out.println(finalSum);
			//closes scanner
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	//does math to mass
	public static int getReq(int num) {
		//divide mass by three
		int x = num / 3;
		//round x down
		int y = (int) x;
		//subtract 2
		int z = y - 2;
		//return final num
		return z;
	}
	
	

}
