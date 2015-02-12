package genome;

import java.util.HashMap;
import java.util.Map;

public class Chromosome {
	Map<String, SingleSNP> chomo = new HashMap<String, SingleSNP>();

	public void addSNP(String rsid, SingleSNP content){
		chomo.put(content.getRsid(), content);
	}
	
	public float compareTo(Chromosome otherChomo, String chomosome){
		float snpEqual = 0;
		float chormoEquality = 0;
		double count = 0;
		for (Map.Entry<String, SingleSNP> entry : chomo.entrySet()){
			count++;
			String key = entry.getKey();
			if ((otherChomo.chomo.containsKey(key) && entry.getValue().equals(otherChomo.chomo.get(key)))){
				snpEqual++;
				System.out.println(snpEqual);
			}
		}
		chormoEquality = (float) (snpEqual/count);
		System.out.println(chormoEquality);
		//genomeStats.put(chomosome, chormoEquality);
		return (float) chormoEquality;
	}
}
