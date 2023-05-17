package teste;

import java.util.HashMap;

public class Converter {
	
	

	private HashMap<String, Aminoacidos> codons = new HashMap<>();
    public Converter() {
    
    	codons.put("GCU",new Aminoacidos("A","Ala","Alanina"));
    	codons.put("GCG",new Aminoacidos("A","Ala","Alanina"));
    	codons.put("GCC",new Aminoacidos("A","Ala","Alanina"));
    	codons.put("GCA",new Aminoacidos("A","Ala","Alanina"));
    	codons.put("GAU",new Aminoacidos("D","Asp","Acido Aspártico"));
    	codons.put("GAC",new Aminoacidos("D","Asp","Acido Aspártico"));
    	codons.put("UUU", new Aminoacidos("F", "Phe", "Fenilalanina"));
		codons.put("UUC", new Aminoacidos("F", "Phe", "Fenilalanina"));
		codons.put("GGU", new Aminoacidos("G", "Gly", "Glicina"));
		codons.put("GGC", new Aminoacidos("G", "Gly", "Glicina"));
		codons.put("GGA", new Aminoacidos("G", "Gly", "Glicina"));
		codons.put("GGG", new Aminoacidos("G", "Gly", "Glicina"));
		codons.put("CAU", new Aminoacidos("H", "His", "Histidina"));
		codons.put("CAC", new Aminoacidos("H", "His", "Histidina"));
		codons.put("AUU", new Aminoacidos("I", "Ile", "Isoleucina"));
		codons.put("AUC", new Aminoacidos("I", "Ile", "Isoleucina"));
		codons.put("AUA", new Aminoacidos("I", "Ile", "Isoleucina"));
		codons.put("AAA", new Aminoacidos("K", "Lys", "Lisina"));
		codons.put("AAG", new Aminoacidos("K", "Lys", "Lisina"));
		codons.put("UUA", new Aminoacidos("L", "Leu", "Leucina"));
		codons.put("UUG", new Aminoacidos("L", "Leu", "Leucina"));
		codons.put("CUU", new Aminoacidos("L", "Leu", "Leucina"));
		codons.put("CUC", new Aminoacidos("L", "Lleu", "Leucina"));
		codons.put("CUA", new Aminoacidos("L", "Leu", "Leucina"));
		codons.put("CUG", new Aminoacidos("L", "Leu", "Leucina"));
		codons.put("AUG", new Aminoacidos("M", "Met", "Metionina"));
		codons.put("AAU", new Aminoacidos("N", "Asn", "Asparagina"));
		codons.put("AAC", new Aminoacidos("N", "Asn", "Asparagina"));
		codons.put("CCU", new Aminoacidos("P", "Pro", "Prolina"));
		codons.put("CCC", new Aminoacidos("P", "Pro", "Prolina"));
		codons.put("CCA", new Aminoacidos("P", "Pro", "Prolina"));
		codons.put("CCG", new Aminoacidos("P", "Pro", "Prolina"));
		codons.put("CAA", new Aminoacidos("Q", "Gln", "Glutamina"));
		codons.put("CAG", new Aminoacidos("Q", "Gln", "Glutamina"));
		codons.put("CGC", new Aminoacidos("R", "Arg", "Arginina"));
		codons.put("CGA", new Aminoacidos("R", "Arg", "Arginina"));
		codons.put("CGG", new Aminoacidos("R", "Arg", "Arginina"));
		codons.put("CGU", new Aminoacidos("R", "Arg", "Arginina"));
		codons.put("AGA", new Aminoacidos("R", "Arg", "Arginina"));
		codons.put("AGG", new Aminoacidos("R", "Arg", "Arginina"));
		codons.put("UCU", new Aminoacidos("S", "Ser", "Serina"));
		codons.put("UCC", new Aminoacidos("S", "Ser", "Serina"));
		codons.put("UCA", new Aminoacidos("S", "Ser", "Serina"));
		codons.put("UCG", new Aminoacidos("S", "Ser", "Serina"));
		codons.put("AGU", new Aminoacidos("S", "Ser", "Serina"));
		codons.put("AGC", new Aminoacidos("S", "Ser", "Serina"));
		codons.put("ACU", new Aminoacidos("T", "Thr", "Treonina"));
		codons.put("ACC", new Aminoacidos("T", "Thr", "Treonina"));
		codons.put("ACA", new Aminoacidos("T", "Thr", "Treonina"));
		codons.put("ACG", new Aminoacidos("T", "Thr", "Treonina"));
		codons.put("GUU", new Aminoacidos("V", "Val", "Valina"));
		codons.put("GUC", new Aminoacidos("V", "Val", "Valina"));
		codons.put("GUA", new Aminoacidos("V", "Val", "Valina"));
		codons.put("GUG", new Aminoacidos("V", "Val", "Valina"));
		codons.put("UGG", new Aminoacidos("W", "Trp", "Triptofano"));
		codons.put("UAU", new Aminoacidos("Y", "Tyr", "Tirosina"));
		codons.put("UAC", new Aminoacidos("Y", "tyr", "Tirosina"));
		codons.put("GAA", new Aminoacidos("E", "Glu", "Ácido glutâmico"));
		codons.put("GAG", new Aminoacidos("E", "Glu", "Ácido glutâmico"));
		codons.put("UGU", new Aminoacidos("C", "Cys", "Cisteína"));
		codons.put("UGC", new Aminoacidos("C", "Cys", "Cisteína"));
		codons.put("UAA", new Aminoacidos("*", "Stop", "Códon de parada"));
		codons.put("UAG", new Aminoacidos("*", "Stop", "Códon de parada"));
		codons.put("UGA", new Aminoacidos("*", "Stop", "Códon de parada"));
	
    	}
    
	public String converter(String seq) {
		seq = seq.toUpperCase();
        if(seq.contains("T")){
            seq = seq.replace("T","U");
        }
        if(seq.length()%3!=0) {
        	System.out.println("Sequência precisa ser múltiplo de 3");
        	return "";
        }
        String proteina ="";
        for (int i = 0; i < seq.length(); i+=3) {
            String aa = seq.substring(i,(i+3));
            proteina += codons.get(aa).code1Letra;
        }
        return proteina;

	}		
		
	public String converter3(String seq) {
		seq = seq.toUpperCase();
        if(seq.contains("T")){
            seq = seq.replace("T","U");
        }
        if(seq.length()%3!=0) {
        	System.out.println("Sequência precisa ser múltiplo de 3");
        	return "";
        }
        String proteina ="";
        for (int i = 0; i < seq.length(); i+=3) {
            String aa = seq.substring(i,(i+3));
            proteina += codons.get(aa).code3Letras;
        }
        return proteina;

	}
}





