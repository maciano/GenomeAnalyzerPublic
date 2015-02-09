package genome;

import java.util.HashMap;
import java.util.Map;

public class Genome {
	Map<String, SingleSNP> genome = new HashMap<String, SingleSNP>();
	
	public void addSNP(String rsid, SingleSNP content){
		genome.put(content.getRsid(), content);
	}
	
	public float compareTo(Genome otherGenome){
		float snpEqual = 0;
		double count = 0;
		for (Map.Entry<String, SingleSNP> entry : genome.entrySet()){
			count++;
			String key = entry.getKey();
			if ((otherGenome.genome.containsKey(key) && entry.getValue().equals(otherGenome.genome.get(key)))){
				snpEqual++;
				System.out.println(snpEqual);
			}
		}
		System.out.println(snpEqual/count);
		return (float) (snpEqual/count);
	}
	
	public void displayGenome(){
		for (Map.Entry<String, SingleSNP> entry : genome.entrySet()){
			System.out.println(entry.getKey() + "= " + String.valueOf(entry.getValue().getGenotype()));
		}
	}
}
