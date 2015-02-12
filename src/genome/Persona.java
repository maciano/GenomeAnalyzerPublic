package genome;

public class Persona {
	private String name;
	private Genome genomePersona = null;
	private Chromosome chromosomePersona = null;
	private static float simil;
	
	Persona(String Name, Genome genomePersona){
		this.name = Name;
		this.genomePersona = genomePersona;
	}
	
	Persona(String Name, Chromosome chromosomePersona){
		this.name = Name;
		this.chromosomePersona = chromosomePersona;
	}
	
	String getName(){
		return name;
	}
	
	Genome getGenome(){
		return genomePersona;
	}
	
	public float similOf(Persona child, String chomo){
		simil = genomePersona.compareTo(child.genomePersona, chomo);
		return simil;
	}
	public float similOfChromo(Persona child, String chomo){
		simil = chromosomePersona.compareTo(child.chromosomePersona, chomo);
		return simil;
	}
}
