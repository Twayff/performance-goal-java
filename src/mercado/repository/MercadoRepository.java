package mercado.repository;

import mercado.model.mercadoBase;

public interface MercadoRepository {
	
	//CRUD ddo Mercado
			public void procurarPorID(int id);
			public void listarTodas();
			public void cadastrar(mercadoBase mercado);
			public void atualizar(mercadoBase mercado);
			public void deletar(int id);

}
