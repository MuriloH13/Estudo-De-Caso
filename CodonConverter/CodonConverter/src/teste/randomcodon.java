package teste;
import java.util.Random;

public class randomcodon {

	    private static final String[] CODONS = {
	        "AAA", "AAC", "AAG", "AAT", "ACA", "ACC", "ACG", "ACT",
	        "AGA", "AGC", "AGG", "AGT", "ATA", "ATC", "ATG", "ATT",
	        "CAA", "CAC", "CAG", "CAT", "CCA", "CCC", "CCG", "CCT",
	        "CGA", "CGC", "CGG", "CGT", "CTA", "CTC", "CTG", "CTT",
	        "GAA", "GAC", "GAG", "GAT", "GCA", "GCC", "GCG", "GCT",
	        "GGA", "GGC", "GGG", "GGT", "GTA", "GTC", "GTG", "GTT",
	        "TAA", "TAC", "TAG", "TAT", "TCA", "TCC", "TCG", "TCT",
	        "TGA", "TGC", "TGG", "TGT", "TTA", "TTC", "TTG", "TTT"
	    };

	    public static String generateRandomCodon() {
	        Random random = new Random();
	        int index = random.nextInt(CODONS.length);
	        return CODONS[index];
	    }

	    public String generatedcodon(String seq) {
	        String randomCodon = generateRandomCodon();
	    
	        return randomCodon;
	    }
	}

