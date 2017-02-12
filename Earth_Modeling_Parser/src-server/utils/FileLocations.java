/*
 * 
 * Copyright (C) 2017 Anish Kunduru
 * 
 * This file is part the Visual Earth Modeling System (VEMS).
 * 
 * VEMS is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * 
 * VEMS is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with VEMS. If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * @author Anish Kunduru
 * 
 *         Utility class whose sole purpose is to store directory locations among common classes. It will make it easy to change drive parameters on the disk.
 */

package utils;

public class FileLocations {

	public static final String ASCII_INPUT_DIRECTORY_LOCATION = "Original_ASCII_files\\";
	public static final String CSV_OUTPUT_DIRECTORY_LOCATION = "Parsed_CSV_files\\";
	public static final String CONVERTED_FILE_LOCATION = "resources\\converted.txt";
	public static final String PYTHON_BINARY_LOCATION = "C:\\Python27\\python.exe";
	// C:\\Python27\\ArcGISx6410.4\\python.exe --OR-- C:\\Python27\\ArcGIS10.4\\python.exe
	public static final String CSV_TO_GEODATABASE_SCRIPT_LOCATION = "C:\\Users\\Anish Kunduru\\Documents\\Spring 2017\\SE 492\\git\\SD_may1701_EM\\Earth_Modeling_Parser\\src\\parser\\CsvToGeodatabase.py";
	// C:\\EarthModeling\\SD_may1701_EM\\Earth_Modeling_Parser\\src\\parser\\CsvToGeodatabase.py
	public static final String APPROVED_CLIENTS_FILE_LOCATION = "approvedClients.txt";
	public static final String TEMP_WORKING_DIRECTORY_LOCATION = "Temp_Working_Files\\";

	private FileLocations() {
	};
}
