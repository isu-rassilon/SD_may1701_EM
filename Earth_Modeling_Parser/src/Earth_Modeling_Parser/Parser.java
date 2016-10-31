package Earth_Modeling_Parser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Parser {

	public static void main(String args[]) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("ch4y2001m2.txt"));
		
		Scanner scanner;
		try {
			PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("generated_values.csv")));
			output.println("latitude,longitude,value");
			scanner = new Scanner(f);
			
			String headers = scanner.nextLine();
			Scanner scanheaders = new Scanner(headers);
			scanheaders.next();
			double ncols = scanheaders.nextDouble();
			
			headers = scanner.nextLine();
			headers = scanner.nextLine();
			scanheaders = new Scanner(headers);
			scanheaders.next();
			double nrows = scanheaders.nextDouble();
			
			headers = scanner.nextLine();
			headers = scanner.nextLine();
			scanheaders = new Scanner(headers);
			scanheaders.next();
			double xllcorner = scanheaders.nextDouble();
			
			headers = scanner.nextLine();
			headers = scanner.nextLine();
			scanheaders = new Scanner(headers);
			scanheaders.next();
			double yllcorner = scanheaders.nextDouble();
			
			headers = scanner.nextLine();
			headers = scanner.nextLine();
			scanheaders = new Scanner(headers);
			scanheaders.next();
			double cellsize = scanheaders.nextDouble();
			//cellsize = 0.08333333333;
			headers = scanner.nextLine();
			headers = scanner.nextLine();
			scanheaders = new Scanner(headers);
			scanheaders.next();
			double NODATA_value = scanheaders.nextDouble();
			//NODATA_value = 0.083333333333;
			scanheaders.close();
			
			System.out.println(ncols + " ");
			int counter = 0;
			double longitude = xllcorner;
			double latitude = yllcorner + (cellsize * (nrows - 1));
			int rows = 0;
			int columns = 0;
			while(scanner.hasNextLine()){
				String scanning = scanner.nextLine();
				Scanner linescan = new Scanner(scanning);
				while(linescan.hasNext()){
					double value = linescan.nextDouble();
					if(value != NODATA_value){
					output.println((latitude - rows * cellsize)+ "," + (longitude + columns * cellsize)  +"," + value);
					}
					columns++;
					if(columns % 1404 == 0){
						if(rows < 923){
							columns = 0;
						}
						rows++;
					}
					counter++;
				}
				linescan.close();
			}
			//System.out.println(rows + " " + columns);
			//System.out.println(counter);
			output.close();
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	
	
}
