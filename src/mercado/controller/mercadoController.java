package mercado.controller;

import java.util.ArrayList;

import mercado.model.mercadoBase;
import mercado.repository.MercadoRepository;




public class mercadoController implements MercadoRepository {
	
	private ArrayList<mercadoBase> listarProdutos = new ArrayList<mercadoBase>();
	int numero = 0;
	
	
	@Override
	public void procurarPorID(int id) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void listarTodas() {
		// TODO Auto-generated method stub
	}

	@Override
	public void cadastrar(mercadoBase mercado) {
		listarProdutos.add(mercado);
		System.out.println("\nO produto de ID: " +mercado.getId() + " foi cadastrado com sucesso!");
		
	}
	@Override
	public void atualizar(mercadoBase mercado) {
		// TODO Auto-generated method stub
	}
	@Override
	public void deletar(int id) {
		// TODO Auto-generated method stub
	}
	
	public int gerarNumero() {
		return ++ numero;
	}
	}
