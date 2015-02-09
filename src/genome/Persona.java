package genome;

public class Persona {
	private String name;
	private Genome genomePersona = null;
	private static float simil;
	
	Persona(String Name, Genome genomePersona){
		this.name = Name;
		this.genomePersona = genomePersona;
	}
	
	String getName(){
		return name;
	}
	
	Genome getGenome(){
		return genomePersona;
	}
	
	public float similOf(Persona child){
		simil = genomePersona.compareTo(child.genomePersona);
		return simil;
	}
}
