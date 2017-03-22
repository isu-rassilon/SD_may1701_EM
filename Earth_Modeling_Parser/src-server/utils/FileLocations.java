/*
 * 
 * Copyright (C) 2017 Anish Kunduru and Kellen Johnson
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
	// -------------- This needs to be changed whenever the server directory is moved. --------------
	public static final String CURRENT_WORKING_DIRECTORY_LOCATION = "C:\\EarthModellingDaemon\\";

	// ---- These need to be changed whenever if the installation parameters are changed from their defaults. ----
	public static final String PYTHON_EXECUTABLE_BINARY_LOCATION = "C:\\Python27\\ArcGISx6410.4\\python.exe";
	public static final String ARCSERVER_MANAGE_SERVICE_FILE_LOCATION = "C:\\Program Files\\ArcGIS\\Server\\tools\\admin\\manageservice.py";
	public static final String WINSCP_EXECUTABLE_LOCATION = "C:\\Program Files (x86)\\WinSCP\\WinSCP.exe";

	// --- This should be replaced with a new 0-byte file when testing core daemon map functionality for validity. ---
	// NOTE: Don't delete the old file on a working server! Simply test new functionality on a blank set, and copy the old one back once bug free.
	public static final String CONVERTED_FILE_LOCATION = CURRENT_WORKING_DIRECTORY_LOCATION + "resources\\converted.ser";

	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// -------------- The following don't need to be updated if the entire directory is copied. --------------
	// Directories that are by EarthModellingDaemon. These are autogenerated if missing.
	public static final String ASCII_INPUT_DIRECTORY_LOCATION = CURRENT_WORKING_DIRECTORY_LOCATION + "Original_ASCII_files\\";
	public static final String CSV_OUTPUT_DIRECTORY_LOCATION = CURRENT_WORKING_DIRECTORY_LOCATION + "Parsed_CSV_files\\";
	public static final String TEMP_WORKING_DIRECTORY_LOCATION = CURRENT_WORKING_DIRECTORY_LOCATION + "Temp_Working_Files\\";
	// Files that are used by EarthModellingDaemon.
	public static final String JAVASCRIPT_FILE_LOCATION = CURRENT_WORKING_DIRECTORY_LOCATION + "resources\\autoGeneratedJavaScript.js";
	// Security files that are used by EarthModellingDaemon. These should be updated to create new authentication information for client access.
	public static final String KEYSTORE_FILE_LOCATION = CURRENT_WORKING_DIRECTORY_LOCATION + "resources\\keystore.jks";
	public static final String APPROVED_CLIENTS_FILE_LOCATION = CURRENT_WORKING_DIRECTORY_LOCATION + "resources\\approvedClients.txt";

	// Location of Python scripts.
	public static final String PUBLISH_MAP_SCRIPT_LOCATION = CURRENT_WORKING_DIRECTORY_LOCATION + "Python_Scripts\\publish_map.py";
	public static final String PUBLISHING_PARAMS_SCRIPT_LOCATION = CURRENT_WORKING_DIRECTORY_LOCATION + "Python_Scripts\\publishing_params.py";

	// Directories that are used by Python scripts.
	public static final String ABS_CSV_OUTPUT_DIRECTORY_LOCATION = CURRENT_WORKING_DIRECTORY_LOCATION + "Parsed_CSV_files\\";
	public static final String MAP_TEMPLATES_DIRECTORY_LOCATION = CURRENT_WORKING_DIRECTORY_LOCATION + "Map_Templates\\";
	public static final String MAPS_PUBLISHING_DIRECTORY_LOCATION = CURRENT_WORKING_DIRECTORY_LOCATION + "Maps_Publishing\\";
	public static final String TEMP_PUBLISHING_FILES_DIRECTORY_LOCATION = CURRENT_WORKING_DIRECTORY_LOCATION + "temp_publishing\\";
	public static final String CREATED_LAYERS_DIRECTORY_LOCATION = CURRENT_WORKING_DIRECTORY_LOCATION + "Created_Layers\\";
	public static final String CREATED_GDBS_OUTPUT_DIRECTORY_LOCATION = CURRENT_WORKING_DIRECTORY_LOCATION + "Auto_GDB\\";
	public static final String CSV_TABLES_OUTPUT_DIRECTORY_LOCATION = CURRENT_WORKING_DIRECTORY_LOCATION + "CSV_Tables\\";
	public static final String ABS_MAPS_PUBLISHING_DIRECTORY_LOCATION = CURRENT_WORKING_DIRECTORY_LOCATION + "Maps_Publishing\\";
	public static final String ABS_CREATED_LAYERS_DIRECTORY_LOCATION = CURRENT_WORKING_DIRECTORY_LOCATION + "Created_Layers\\";
	public static final String ABS_CSV_TABLES_OUTPUT_DIRECTORY_LOCATION = CURRENT_WORKING_DIRECTORY_LOCATION + "CSV_Tables\\";
	public static final String ABS_AUTO_GDBS_OUTPUT_DIRECTORY_LOCATION = CURRENT_WORKING_DIRECTORY_LOCATION + "Auto_GDB\\";
	public static final String ABS_TEMP_PUBLISHING_FILES_DIRECTORY_LOCATION = CURRENT_WORKING_DIRECTORY_LOCATION + "temp_publishing\\";

	// Files that are used by Python scripts.
	public static final String BLANK_MAP_FILE_LOCATION = MAP_TEMPLATES_DIRECTORY_LOCATION + "blank_map.mxd";
	/////////////////////////////////////////////////////////////////////////////////////////////////////////

	private FileLocations() {
	};
}
