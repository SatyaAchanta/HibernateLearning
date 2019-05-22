package com.satya.udemy.product.entities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.Stream;

public class FileReaderUtil {
	
	private String convertStringToBytes(String filePathToRead) throws FileNotFoundException {
		
		FileReader fr = new FileReader(filePathToRead);
		
		StringBuilder sBuilder = new StringBuilder();
		
		try (Stream<String> stream = Files.lines( Paths.get(filePathToRead), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> sBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
 
		/**
		 * Converting xml content to byte[] using Base64 encoder
		 */
		byte[] outputString = Base64.getEncoder().encode(sBuilder.toString().getBytes());
		// System.out.println(Arrays.toString(outputString));
		
		/**
		 * Converting byte[] to String
		 */
		String xmlString = new String(outputString);
		
		System.out.println("encoded xml string is------------");
		System.out.println(xmlString);
		
		byte[] decodedString = Base64.getDecoder().decode(xmlString);
		System.out.println("Decoder String is------------------");
		System.out.println(Arrays.toString(decodedString));

        return sBuilder.toString();
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		String filePath = "C:\\Users\\sachanta\\OneDrive - Infor\\Documents\\PBC\\SRM\\SRMBODs\\LoadPlanningSchedule-infor-1.xml";

		FileReaderUtil fUtil = new FileReaderUtil();
		
		String result = fUtil.convertStringToBytes(filePath);
		
		// System.out.println(result);

	}

}
