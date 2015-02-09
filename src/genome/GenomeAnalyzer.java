package genome;

import java.util.ArrayList;
import java.util.List;

public class GenomeAnalyzer {
	
	public static void main(String[] args){
		float percent = 0;
		List<String> chromo_List = new ArrayList<String>();
		initCharSet(chromo_List);
		String chromo = "1";
		Persona gaston = new Persona("Gaston", GenomeRawDataReader.read("genome_Gaston_Juarez_Full_20150208054635.txt", chromo));
		Persona angel = new Persona("Angel", GenomeRawDataReader.read("genome_Angel_Roccasalva_Full_20140516214655.txt", chromo));
			
		percent = gaston.similOf(angel);
		
		System.out.print("Chromosome:" + chromo + " " + percent + " simil");

		// Display Gaston genoma
		gaston.getGenome().displayGenome();
	}
	
	private static void initCharSet(List<String> chromo_List){
		for (int i=1; i<= 22; i++){
			chromo_List.add(String.valueOf(i));
		}
		chromo_List.add("X");
		chromo_List.add("MT");
	}
}
