package controle;

import java.util.ArrayList;
import java.util.Random;

import modelo.IRandomCodon;

public class RandomCodon implements IRandomCodon {

	public static ArrayList<String> codonsTabela;
	private static ConverterDAO instanciar;

	public static ConverterDAO getInstance() {
		if (instanciar == null) {
			instanciar = new ConverterDAO();
			codonsTabela = new ArrayList<>();

			codonsTabela.add("AAA");
			codonsTabela.add("AAC");
			codonsTabela.add("AAG");
			codonsTabela.add("AAT");
			codonsTabela.add("ACA");
			codonsTabela.add("ACC");
			codonsTabela.add("ACG");
			codonsTabela.add("ACT");
			codonsTabela.add("AGC");
			codonsTabela.add("AGG");
			codonsTabela.add("AGT");
			codonsTabela.add("ATC");
			codonsTabela.add("ATG");
			codonsTabela.add("ATT");
			codonsTabela.add("CAA");
			codonsTabela.add("CAC");
			codonsTabela.add("CAG");
			codonsTabela.add("CAT");
			codonsTabela.add("CCA");
			codonsTabela.add("CCG");
			codonsTabela.add("CCT");
			codonsTabela.add("CGA");
			codonsTabela.add("CGC");
			codonsTabela.add("CGG");
			codonsTabela.add("CTA");
			codonsTabela.add("CGT");
			codonsTabela.add("CTC");
			codonsTabela.add("CTT");
			codonsTabela.add("GAA");
			codonsTabela.add("GAC");
			codonsTabela.add("GAG");
			codonsTabela.add("GAT");
			codonsTabela.add("GCA");
			codonsTabela.add("GCC");
			codonsTabela.add("GCG");
			codonsTabela.add("GCT");
			codonsTabela.add("GGC");
			codonsTabela.add("GGG");
			codonsTabela.add("GGT");
			codonsTabela.add("GTA");
			codonsTabela.add("GTC");
			codonsTabela.add("GTG");
			codonsTabela.add("GTT");
			codonsTabela.add("TAA");
			codonsTabela.add("TAC");
			codonsTabela.add("TAG");
			codonsTabela.add("TAT");
			codonsTabela.add("TCA");
			codonsTabela.add("TCC");
			codonsTabela.add("TCG");
			codonsTabela.add("TCT");
			codonsTabela.add("TGA");
			codonsTabela.add("TGC");
			codonsTabela.add("TGG");
			codonsTabela.add("TGT");
			codonsTabela.add("TTA");
			codonsTabela.add("TTC");
			codonsTabela.add("TTG");
			codonsTabela.add("TTT");

		}

		return instanciar;
	}

	private static final String[] CODONS = { "AAA", "AAC", "AAG", "AAT", "ACA", "ACC", "ACG", "ACT", "AGA", "AGC",
			"AGG", "AGT", "ATA", "ATC", "ATG", "ATT", "CAA", "CAC", "CAG", "CAT", "CCA", "CCC", "CCG", "CCT", "CGA",
			"CGC", "CGG", "CGT", "CTA", "CTC", "CTG", "CTT", "GAA", "GAC", "GAG", "GAT", "GCA", "GCC", "GCG", "GCT",
			"GGA", "GGC", "GGG", "GGT", "GTA", "GTC", "GTG", "GTT", "TAA", "TAC", "TAG", "TAT", "TCA", "TCC", "TCG",
			"TCT", "TGA", "TGC", "TGG", "TGT", "TTA", "TTC", "TTG", "TTT" };

	public static String generateRandomCodon() {
		Random random = new Random();
		int index = random.nextInt(CODONS.length);
		return CODONS[index];
	}

	public String generatedcodon(String seq) {
		String randomCodon = generateRandomCodon();

		return randomCodon;
	}

	@Override
	public boolean inserir(String px) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterar(String px) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluir(String px) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<String> mostrar() {
		// TODO Auto-generated method stub
		return null;
	}
}
