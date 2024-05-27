package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import entites.Votation;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Map <String, Integer> mapVotes = new TreeMap<>();

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while (line != null) {
				
				String[] fields = line.split(",");
				String candidate = fields[0];
				Integer count = Integer.parseInt(fields[1]);
				
				if (mapVotes.containsKey(candidate)) {
					count += mapVotes.get(candidate);
				}
				mapVotes.put(candidate,count);
				
				line = br.readLine();
			}
			for (String name: mapVotes.keySet()) {
				System.out.println(name + ": " + mapVotes.get(name));
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		finally {
			sc.close();
		}
	}
}