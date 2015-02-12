package genome;

import java.util.HashMap;
import java.util.Map;

public class Genome {
	Map<String, SingleSNP> genome = new HashMap<String, SingleSNP>();
	Map<String, Float> genomeStats = new HashMap<String, Float>();
	
	public void addSNP(String rsid, SingleSNP content){
		genome.put(content.getRsid(), content);
	}
	
	public float compareTo(Genome otherGenome, String chomosome){
		float snpEqual = 0;
		float chormoEquality = 0;
		double count = 0;
		for (Map.Entry<String, SingleSNP> entry : genome.entrySet()){
			count++;
			String key = entry.getKey();
			if ((otherGenome.genome.containsKey(key) && entry.getValue().equals(otherGenome.genome.get(key)))){
				snpEqual++;
				//System.out.println(snpEqual);
			}
		}
		chormoEquality = (float) (snpEqual/count);
		System.out.println(chormoEquality);
		genomeStats.put(chomosome, chormoEquality);
		return (float) chormoEquality;
	}
	
	public void displayGenome(){
		for (Map.Entry<String, SingleSNP> entry : genome.entrySet()){
			System.out.println(entry.getKey() + "= " + String.valueOf(entry.getValue().getGenotype()));
		}
	}
}
