package advent_code_21;

import java.io.IOException;
import java.util.List;

public class Day1 {
	
	public static void part1() throws IOException {
		String path = "C:\\Users\\XXXX\\Downloads\\AoC_2021\\day1_1_input.txt";
		List<Integer> measures = Utils.fileToArrayInt(path);
		
		System.out.println("Number of lines in file : " + measures.size());
		
		int numberOfIncrease = 0;
		
		for(int i=1;i<measures.size();i++) {
			if(measures.get(i) > measures.get(i-1)) {
				numberOfIncrease++;
			}
		}
		
		System.out.println("Number of increase P1 : " + numberOfIncrease);
	}
	
	public static void part2() throws IOException {
		String path = "C:\\Users\\XXXX\\Downloads\\AoC_2021\\day1_1_input.txt";
		List<Integer> measures = Utils.fileToArrayInt(path);
		
		System.out.println("Number of lines in file : " + measures.size());
		
		int numberOfIncrease = 0;
		
		for(int i=3;i<measures.size();i++) {
			if(measures.get(i) + measures.get(i-1) + measures.get(i-2) 
					> 
			measures.get(i-1) + measures.get(i-2) + measures.get(i-3)) {
				numberOfIncrease++;
			}
		}
		
		System.out.println("Number of increase P2 : " + numberOfIncrease);
	}

	public static void main(String[] args) throws IOException {
		part2();
	}
}
