package genome;

import java.util.Arrays;


public class SingleSNP {
	
	String rsid;
	String chromosome;	// 1 to 22, X Y MT position
	double position; // Position in the Chromosome
	char[] genotype = new char[2];	// Genotype ACGT Charset
	
	/**
     * @return the type either recessive(0) or dominant(1)
     */
	SingleSNP(String rsid, String chromosome, double position, char[] genotype){
		this.rsid = rsid;
		this.chromosome = chromosome;
		this.position = position;
		this.genotype = genotype;
	}
	
	/**
     * @return true or false comparing if both genotypes are equal.
     */
	boolean equals(SingleSNP snp){
		return Arrays.equals(this.genotype, snp.genotype);
	}
	
	/**
     * @return String representation of rsId Number and genotype value.
     */
	public String toString(){
		return this.rsid + " " + String.valueOf(this.genotype);
	}
	
	String getRsid(){
		return this.rsid;
	}
	
	char[] getGenotype(){
		return this.genotype;
	}
	
	String getChromosome(){
		return this.chromosome;
	}
	
	double getPosition(){
		return this.position;
	}
}