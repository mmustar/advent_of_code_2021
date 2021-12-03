package advent_code_21;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day3 {

	public static void part1() throws IOException {
		String path = "C:\\Users\\XXXX\\Downloads\\AoC_2021\\day3_input.txt";
		List<String> numbers = Utils.fileToArrayString(path);
		
		String gamma = "";
		String epsilon = "";
		
		int numberOne;
		int numberZero;
		
		for(int i=0; i<12; i++) {
			numberOne = 0;
			numberZero = 0;
			for(String number : numbers) {
				char bit = number.charAt(i);
				if('1' == bit)
					numberOne++;
				else
					numberZero++;		
			}
			
			if(numberOne > numberZero) {
				gamma += "1";
				epsilon += "0";
			} else {
				gamma += "0";
				epsilon += "1";
			}
		}
		
		System.out.println("GAMMA : " + gamma);
		int baseTenGamma = Integer.parseInt(gamma, 2);
		System.out.println("==> " + baseTenGamma);
		System.out.println("EPSILON : " + epsilon);
		int baseTenEpsilon = Integer.parseInt(epsilon, 2);
		System.out.println("==> " + baseTenEpsilon);
		
		System.out.println("Multiply : " + baseTenEpsilon * baseTenGamma);
		
	}
	
	public static char mostCommonChar(List<String> numbers, int position) {
		int numberOne = 0;
		int numberZero = 0;
		for(String number : numbers) {
			char bit = number.charAt(position);
			if('1' == bit)
				numberOne++;
			else
				numberZero++;
		}
			
		if(numberOne > numberZero) {
			return '1';
		} else if( numberZero > numberOne) {
			return '0';
		}
		return '\0';
			
		
	}
	
	public static void part2() throws IOException {
		String path = "C:\\Users\\XXXX\\Downloads\\AoC_2021\\day3_input.txt";
		List<String> C02 = Utils.fileToArrayString(path);
		List<String> oxygen = new ArrayList<>(C02);
		
		char mostCommonOxygen;
		char mostCommonC02;
		
		while(C02.size() > 1 && oxygen.size() > 1) {
			for(int i=0; i<12; i++) {
				final int index = i;
				if(C02.size() > 1) {
					mostCommonC02 = mostCommonChar(C02, i);
					
					if(mostCommonC02 == '0')
						C02.removeIf(n -> (n.charAt(index) == '0'));
					else
						C02.removeIf(n -> (n.charAt(index) == '1'));
				}
				
				if(oxygen.size() > 1) {
					mostCommonOxygen = mostCommonChar(oxygen, i);
					
					if(mostCommonOxygen == '0')
						oxygen.removeIf(n -> (n.charAt(index) == '1'));
					else
						oxygen.removeIf(n -> (n.charAt(index) == '0'));
				}
			}
		}
		
		System.out.println("OXYGEN : " + oxygen.get(0));
		int baseTenOxygen = Integer.parseInt(oxygen.get(0), 2);
		System.out.println("==> " + baseTenOxygen);
		System.out.println("C02 : " + C02.get(0));
		int baseTenC02 = Integer.parseInt(C02.get(0), 2);
		System.out.println("==> " + baseTenC02);
		
		System.out.println("Multiply : " + baseTenOxygen * baseTenC02);
		
	}
	
	public static void main(String[] args) throws IOException {
		part2();
	}
}
