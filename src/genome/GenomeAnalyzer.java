package genome;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenomeAnalyzer {
	
	public static void main(String[] args) throws IOException{
		float percent = 0;
		long startTime = System.nanoTime();
		List<String> chromo_List = new ArrayList<String>();
		initCharSet(chromo_List);
		String chromo = "1";
		
		Persona gaston = new Persona("Gaston", GenomeRawDataReader.read("genome_child_Full_20150208054635.txt", chromo));
		Persona angel = new Persona("Angel", GenomeRawDataReader.read("genome_father_Full_20140516214655.txt", chromo));
			
		percent = gaston.similOf(angel, chromo);
		
		long endTime = System.nanoTime();
		System.out.print("Chromosome:" + chromo + " " + percent + " simil");
		long duration = (endTime - startTime)/1000000;
		System.out.print("\nExecution Time:" + duration + "ms");
	}
	
	private static void initCharSet(List<String> chromo_List){
		for (int i=1; i<= 22; i++){
			chromo_List.add(String.valueOf(i));
		}
		chromo_List.add("X");
		chromo_List.add("MT");
	}
}
