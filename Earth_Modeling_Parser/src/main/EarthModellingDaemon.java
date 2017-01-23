/**
 * Main server thread that wakes up to check if any ASCII files have been added.
 * 
 * @author Anish Kunduru
 */

package main;

import java.io.File;
import java.io.IOException;

import org.pmw.tinylog.Logger;

import parser.AsciiToCsv;

public class EarthModellingDaemon {

	public static final String INPUT_DIRECTORY_LOCATION = "Original_ASCII_files\\";
	public static final Long TIME_TO_SLEEP = 600000L; // 10 minutes before this daemon wakes up again.

	public static void main(String[] args) throws IOException, InterruptedException {
		File inputDir = new File(INPUT_DIRECTORY_LOCATION);
		ConvertedSet convertedSet = new ConvertedSet();

		while (true) {

			Logger.info("Server daemon waking up...");

			while (inputDir.list().length > 0) {
				// ASCII to CSV
				String firstFileLocation = inputDir.getAbsolutePath() + "\\" + inputDir.list()[0];

				if (!convertedSet.add(inputDir.list()[0])) {
					Logger.warn("The file " + firstFileLocation + " has already been converted!");
				} else {
					convertAsciiToCsv(firstFileLocation);
					// TO-DO: CSV to Geodatabase
				}

				deleteFile(firstFileLocation);
			}
			Thread.sleep(TIME_TO_SLEEP);
		}
	}

	/**
	 * Deletes the file at the specified location.
	 * 
	 * @param fileLocation
	 *           - The absolute file path of the file on the disk.
	 */
	private static void deleteFile(String fileLocation) {
		File f = new File(fileLocation);
		if (f.delete())
			Logger.info("File is deleted!");
		else
			Logger.error("Delete operation failed!"); // SEVERE, shouldn't happen.
	}

	/**
	 * Converts an ASCII file to a CSV file via AsciiToCsv.java
	 * 
	 * @param fileLocation
	 *           - The absolute file path of the ascii.txt file on the disk.
	 * @throws IOException
	 */
	private static void convertAsciiToCsv(String fileLocation) throws IOException {
		Logger.info("Converting file: " + fileLocation);
		String[] arguments = { fileLocation };
		AsciiToCsv.main(arguments);
		Logger.info("File converted!");
	}
}
