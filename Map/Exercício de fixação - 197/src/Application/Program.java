package Application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> mapList = new LinkedHashMap<>();

		System.out.print("Enter file path: ");
		File file = new File(sc.nextLine());

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = br.readLine();
			while (line != null) {

				String[] lines = line.split(",");
				String name = lines[0];
				Integer votes = Integer.parseInt(lines[1]);

				if (mapList.containsKey(name)) {
					int newVotes = mapList.get(name);
					mapList.put(name, votes + newVotes);
				} 
				
				else {
					mapList.put(name, votes);
				}
				
				line = br.readLine();
			}

			for (String key : mapList.keySet()) {
				System.out.println(key + ": " + mapList.get(key));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
