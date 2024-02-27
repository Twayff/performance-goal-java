package mercado.controller;

import java.util.ArrayList;




public class mercadoController implements MercadoRepository {
	
	private ArrayList<mercadoBase> listarContas = new ArrayList<mercadoBase>();
	int numero = 0;
	
	
	@Override
	public void procurarPorID(int id) {
		
	}
	@Override
	public void listarTodas() {
		for(var marcado: listarContas) {
			mercado.visualizar();
		}

	@Override
	public void cadastrar(Conta conta) {
			// TODO Auto-generated method stub

	}}
