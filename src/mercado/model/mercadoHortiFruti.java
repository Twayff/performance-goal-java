package mercado.model;

public class mercadoHortiFruti extends mercadoBase {
	
	private float validade;
	public mercadoHortiFruti(int id, int tipo, float preco, String nome) {
		super(id, tipo, preco, nome);
	}
	
	public float getValidade() {
		return validade;
	}
	public void setValidade(float validade) {
		this.validade = validade;
	}
	
	
	@Override
	
	public void visualizar() {
	super.visualizar();
	System.out.println("Aniversário da Conta" + this.validade);
	}
	
}



