package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;
//Jean Valente

	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
