package mercado.model;

public  abstract class mercadoBase {
	
	private int id;
	private String nome;
	private int tipo;
	private float preco;
	
	public mercadoBase(int id, int tipo, float preco, String nome) {
		this.id = id;
		this.tipo = tipo;
		this.preco = preco;
		this.nome = nome;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualizar() {
		
		String tipoMercado = "";
		
		switch(this.tipo) {
		case 1:
			tipoMercado = "Hort-Frut";
			break;
		case 2:
			tipoMercado = "Limpeza";
			break;
		}
	
	
	System.out.println("*****************************************");
	System.out.println("Dados do Produto");
	System.out.println("*****************************************");
	System.out.println("Nome do Produto: " + this.nome);
	System.out.println("ID do Produto: " + this.id);
	System.out.println("Tipo do Produto: " + tipoMercado);
	System.out.println("Preço do Produto: " + this.preco);
	
}
}
	
	
	


