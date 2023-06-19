package controle;

import java.util.HashMap;

import modelo.Aminoacido;
import modelo.IConverterDAO;

public class ConverterDAO implements IConverterDAO {

	private static ConverterDAO instanciar;
	private static HashMap<String, Aminoacido> codons = new HashMap<>();

	private ConverterDAO() {
	}

	public static ConverterDAO getInstance() {
		if (instanciar == null) {
			instanciar = new ConverterDAO();

			codons.put("GCU", new Aminoacido("A", "Ala", "Alanina"));
			codons.put("GCG", new Aminoacido("A", "Ala", "Alanina"));
			codons.put("GCC", new Aminoacido("A", "Ala", "Alanina"));
			codons.put("GCA", new Aminoacido("A", "Ala", "Alanina"));
			codons.put("GAU", new Aminoacido("D", "Asp", "Acido Aspártico"));
			codons.put("GAC", new Aminoacido("D", "Asp", "Acido Aspártico"));
			codons.put("UUU", new Aminoacido("F", "Phe", "Fenilalanina"));
			codons.put("UUC", new Aminoacido("F", "Phe", "Fenilalanina"));
			codons.put("GGU", new Aminoacido("G", "Gly", "Glicina"));
			codons.put("GGC", new Aminoacido("G", "Gly", "Glicina"));
			codons.put("GGA", new Aminoacido("G", "Gly", "Glicina"));
			codons.put("GGG", new Aminoacido("G", "Gly", "Glicina"));
			codons.put("CAU", new Aminoacido("H", "His", "Histidina"));
			codons.put("CAC", new Aminoacido("H", "His", "Histidina"));
			codons.put("AUU", new Aminoacido("I", "Ile", "Isoleucina"));
			codons.put("AUC", new Aminoacido("I", "Ile", "Isoleucina"));
			codons.put("AUA", new Aminoacido("I", "Ile", "Isoleucina"));
			codons.put("AAA", new Aminoacido("K", "Lys", "Lisina"));
			codons.put("AAG", new Aminoacido("K", "Lys", "Lisina"));
			codons.put("UUA", new Aminoacido("L", "Leu", "Leucina"));
			codons.put("UUG", new Aminoacido("L", "Leu", "Leucina"));
			codons.put("CUU", new Aminoacido("L", "Leu", "Leucina"));
			codons.put("CUC", new Aminoacido("L", "Lleu", "Leucina"));
			codons.put("CUA", new Aminoacido("L", "Leu", "Leucina"));
			codons.put("CUG", new Aminoacido("L", "Leu", "Leucina"));
			codons.put("AUG", new Aminoacido("M", "Met", "Metionina"));
			codons.put("AAU", new Aminoacido("N", "Asn", "Asparagina"));
			codons.put("AAC", new Aminoacido("N", "Asn", "Asparagina"));
			codons.put("CCU", new Aminoacido("P", "Pro", "Prolina"));
			codons.put("CCC", new Aminoacido("P", "Pro", "Prolina"));
			codons.put("CCA", new Aminoacido("P", "Pro", "Prolina"));
			codons.put("CCG", new Aminoacido("P", "Pro", "Prolina"));
			codons.put("CAA", new Aminoacido("Q", "Gln", "Glutamina"));
			codons.put("CAG", new Aminoacido("Q", "Gln", "Glutamina"));
			codons.put("CGC", new Aminoacido("R", "Arg", "Arginina"));
			codons.put("CGA", new Aminoacido("R", "Arg", "Arginina"));
			codons.put("CGG", new Aminoacido("R", "Arg", "Arginina"));
			codons.put("CGU", new Aminoacido("R", "Arg", "Arginina"));
			codons.put("AGA", new Aminoacido("R", "Arg", "Arginina"));
			codons.put("AGG", new Aminoacido("R", "Arg", "Arginina"));
			codons.put("UCU", new Aminoacido("S", "Ser", "Serina"));
			codons.put("UCC", new Aminoacido("S", "Ser", "Serina"));
			codons.put("UCA", new Aminoacido("S", "Ser", "Serina"));
			codons.put("UCG", new Aminoacido("S", "Ser", "Serina"));
			codons.put("AGU", new Aminoacido("S", "Ser", "Serina"));
			codons.put("AGC", new Aminoacido("S", "Ser", "Serina"));
			codons.put("ACU", new Aminoacido("T", "Thr", "Treonina"));
			codons.put("ACC", new Aminoacido("T", "Thr", "Treonina"));
			codons.put("ACA", new Aminoacido("T", "Thr", "Treonina"));
			codons.put("ACG", new Aminoacido("T", "Thr", "Treonina"));
			codons.put("GUU", new Aminoacido("V", "Val", "Valina"));
			codons.put("GUC", new Aminoacido("V", "Val", "Valina"));
			codons.put("GUA", new Aminoacido("V", "Val", "Valina"));
			codons.put("GUG", new Aminoacido("V", "Val", "Valina"));
			codons.put("UGG", new Aminoacido("W", "Trp", "Triptofano"));
			codons.put("UAU", new Aminoacido("Y", "Tyr", "Tirosina"));
			codons.put("UAC", new Aminoacido("Y", "tyr", "Tirosina"));
			codons.put("GAA", new Aminoacido("E", "Glu", "Ácido glutâmico"));
			codons.put("GAG", new Aminoacido("E", "Glu", "Ácido glutâmico"));
			codons.put("UGU", new Aminoacido("C", "Cys", "Cisteína"));
			codons.put("UGC", new Aminoacido("C", "Cys", "Cisteína"));
			codons.put("UAA", new Aminoacido("*", "Stop", "Códon de parada"));
			codons.put("UAG", new Aminoacido("*", "Stop", "Códon de parada"));
			codons.put("UGA", new Aminoacido("*", "Stop", "Códon de parada"));
		}

		return instanciar;
	}

	public String converter(String seq) {
		seq = seq.toUpperCase();
		if (seq.contains("T")) {
			seq = seq.replace("T", "U");
		}
		if (seq.length() % 3 != 0) {
			System.out.println("Sequência precisa ser múltiplo de 3");
			return "";
		}
		String proteina = "";
		for (int i = 0; i < seq.length(); i += 3) {
			String aa = seq.substring(i, (i + 3));
			proteina += codons.get(aa).getCode1Letra();
		}
		return proteina;

	}

	public String converter3(String seq) {
		seq = seq.toUpperCase();
		if (seq.contains("T")) {
			seq = seq.replace("T", "U");
		}
		if (seq.length() % 3 != 0) {
			System.out.println("Sequência precisa ser múltiplo de 3");
			return "";
		}
		String proteina = "";
		for (int i = 0; i < seq.length(); i += 3) {
			String aa = seq.substring(i, (i + 3));
			proteina += codons.get(aa).getCode3Letras();
		}
		return proteina;

	}

}
