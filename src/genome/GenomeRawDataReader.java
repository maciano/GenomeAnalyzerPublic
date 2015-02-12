package genome;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class GenomeRawDataReader {
	static long lastPosition;

	static Genome read(String fileUrl, String chronoActual) {
		String line;
		BufferedReader buffer = null;
		Genome genomePerson = new Genome();
		String[] lineArray;
		SingleSNP content;
		double position;

		try {	

			File f = new File(fileUrl);
			buffer = new BufferedReader(new FileReader(f));
			while ((line = buffer.readLine()) != null){
				if(line.startsWith("#") == false){
					System.out.println(line);
					lineArray = line.split("\t");
					position  = Integer.parseInt(lineArray[2]);
					String chromo = lineArray[1];
					
					// Analyze by chunks, each chromo 
					if (!chromo.equals(chronoActual)) {
						break;
					}
					content = new SingleSNP(lineArray[0], chromo, position, lineArray[3].toCharArray());  
					genomePerson.addSNP(lineArray[0], content);
				}
			}
		} catch (IOException e){
			System.out.print("ERROR: Missing File\n");
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
	
	public static Chromosome chomosomeReader(String filePath, String chomosome, int size) throws IOException{
		String line;
		String[] lineArray;
		Chromosome chromosome = new Chromosome();
		SingleSNP content;
		double position;
		String chronoInicial;

		RandomAccessFile file = new RandomAccessFile(filePath, "r");
		file.seek(lastPosition);
  		while ((line = file.readLine()) != null){
			if(line.charAt(0) != '#'){
				lineArray = line.split("\t");
				chronoInicial =  lineArray[1];
				if(lineArray[1].equals(chronoInicial)){
					System.out.println(line);
					position  = Integer.parseInt(lineArray[2]);
					content = new SingleSNP(lineArray[0], chronoInicial, position, lineArray[3].toCharArray());  
					chromosome.addSNP(lineArray[0], content);
					//line = file.readLine();
				}
		  		lastPosition = file.getFilePointer();
		  		break;
			}
  		}
		return chromosome;
	}
}
