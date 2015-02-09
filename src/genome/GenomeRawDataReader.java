package genome;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GenomeRawDataReader {
	
	static Genome read(String file, String chronoActual) {
		System.out.println("chronoActual=" + chronoActual);

		String line;
		BufferedReader buffer = null;
		Genome genomePerson = new Genome();
		String[] lineArray;
		SingleSNP content;
		double position;

		try {	
			File f = new File(file);
			buffer = new BufferedReader(new FileReader(f));
			while ((line = buffer.readLine()) != null){
				if(line.startsWith("#") == false){
					System.out.println(line);
					lineArray = line.split("\t");
					position  = Integer.parseInt(lineArray[2]);
					String chromo = lineArray[1];
					
					// Analyze by chunks, each chromo 
					if (!chromo.equals(chronoActual)) {
						System.out.print("break:" + chromo.toString() );
						break;
					}
					content = new SingleSNP(lineArray[0], chromo, position, lineArray[3].toCharArray());  
					genomePerson.addSNP(lineArray[0], content);
				}
			}
		} catch (IOException e){
			e.printStackTrace();
		} finally {
			try {
				buffer.close();
			} catch (IOException e){
				e.printStackTrace();
			}
		}
		return genomePerson;
	}	
}
