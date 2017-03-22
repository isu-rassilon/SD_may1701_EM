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
 *         Utility class whose sole purpose is to store network configuration information among common classes. It will make it easy to make changes if the server's configuration changes.
 */

package networking;

public class ServerInformation {

	public final static String DAEMON_SERVER_ADDRESS = "proj-se491.cs.iastate.edu";
	public final static int SERVER_PORT = 1443;

	public final static String WEB_SERVER_ADDRESS = "may1701.sd.ece.iastate.edu";

	private ServerInformation() {
	};
}
