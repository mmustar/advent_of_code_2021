package advent_code_21;

import java.io.IOException;
import java.util.List;

public class Day2 {

	public static void part1() throws IOException {
		String path = "C:\\Users\\XXXX\\Downloads\\AoC_2021\\day2_1_input.txt";
		List<String> commands = Utils.fileToArrayString(path);
		
		int horizontal =0;
		int depth = 0;
		String[] parts;
		int units =0 ;
		
		for(String command : commands) {
			parts = command.split(" ");
			units = Integer.valueOf(parts[1]);
			switch (parts[0]) {
			case "forward":
				horizontal += units;
				break;
			case "up":
				depth -= units;
				break;
			case "down":
				depth += units;
				break;

			default:
				break;
			}
		}
		System.out.println("HORIZONTAL : " + horizontal);
		System.out.println("DEPTH : " + depth);
		
		System.out.println("MULTIPLY : " + depth*horizontal);
	}
	
	public static void part2() throws IOException {
		String path = "C:\\Users\\XXXX\\Downloads\\AoC_2021\\day2_1_input.txt";
		List<String> commands = Utils.fileToArrayString(path);
		
		int horizontal =0;
		int depth = 0;
		String[] parts;
		int units =0 ;
		int aim=0;
		
		for(String command : commands) {
			parts = command.split(" ");
			units = Integer.valueOf(parts[1]);
			switch (parts[0]) {
			case "forward":
				horizontal += units;
				depth += (aim*units);
				break;
			case "up":
				//depth -= units;
				aim -= units;
				break;
			case "down":
				//depth += units;
				aim += units;
				break;

			default:
				break;
			}
			
			System.out.println("HORIZONTAL : " + horizontal);
			System.out.println("DEPTH : " + depth);
			System.out.println("\n");
		}
		System.out.println("HORIZONTAL : " + horizontal);
		System.out.println("DEPTH : " + depth);
		
		System.out.println("MULTIPLY : " + depth*horizontal);
	}
	
	public static void main(String[] args) throws IOException {
		part2();
	}
	
}
