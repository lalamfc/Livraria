package livraria;

public class CadastroLivro {
	private String nomeLivro;
	private float preço;
	private int quantidade;
	private float impostoISS;
	private float impostoXLP;
	

	public CadastroLivro(float preço, int quantidade, float impostoISS, float impostoXLP, String nomeLivro) {
		super();
		this.nomeLivro = nomeLivro;
		this.preço = preço;
		this.quantidade = quantidade;
		this.impostoISS = impostoISS;
		this.impostoXLP = impostoXLP;
	}


	public CadastroLivro() {
		// TODO Auto-generated constructor stub
	}


	public String getNomeLivro() {
		return nomeLivro;
	}


	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}


	public float getPreço() {
		return preço;
	}


	public void setPreço(float preço) {
		this.preço = preço;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public float getImpostoISS() {
		return impostoISS;
	}


	public void setImpostoISS(float impostoISS) {
		this.impostoISS = impostoISS;
	}


	public float getImpostoXLP() {
		return impostoXLP;
	}


	public void setImpostoXLP(float impostoXLP) {
		this.impostoXLP = impostoXLP;
	}
	
	@Override
    public String toString() {
        return "\n################################################\n" +
                "Livro : \n" +
                "\n Valor unitário do livro = " + preço +
                "\n Quantidade de livros = '" + quantidade +
                "\n \n ***" + quantidade + "livros com o título" + nomeLivro + "custando" + "R$" + preço + "cadastrados com sucesso." +
                "\n \n Imposto por cada livro" + 
                "\n Imposto ISS = " + impostoISS + "(30% do valor de cada livro)" +
                "\n Impostos XLP = " + impostoXLP + "(30% do valor de cada livro)" +
                "\n################################################\n";
    }
}
