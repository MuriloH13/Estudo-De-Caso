package modelo;

public class Aminoacido {

	private String code1Letra;
	private String code3Letras;
	private String nome;
	
	public Aminoacido() {
		
	}

	public Aminoacido(String code1Letra, String code3Letras, String nome) {
		this.code1Letra = code1Letra;
		this.code3Letras = code3Letras;
		this.nome = nome;
	}

	public String getCode1Letra() {
		return code1Letra;
	}

	public void setCode1Letra(String code1Letra) {
		this.code1Letra = code1Letra;
	}

	public String getCode3Letras() {
		return code3Letras;
	}

	public void setCode3Letras(String code3Letras) {
		this.code3Letras = code3Letras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
