package app;

import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Statistics {

	public static void main(String[] args) throws Exception {
		URL ukrstat = new URL("http://www.ukrstat.gov.ua/express/expr2016/02/27xl.zip");
		URLConnection conn = ukrstat.openConnection();
		InputStream in = conn.getInputStream();
		FileOutputStream out = null;

	}

}
