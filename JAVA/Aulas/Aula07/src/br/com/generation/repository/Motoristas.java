package br.com.generation.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import br.com.generation.Model.Caminhao;
import br.com.generation.Model.Motorista;
import br.com.generation.Model.Seguro;

public class Motoristas {
	
	private Map<String, Optional<Motorista>> motoristas = new HashMap<>();
	
	public Motoristas() {
		
		Seguro seguro = new Seguro("Parcial - n�o cobre roubo", 5000.00);
		Caminhao caminhao = new Caminhao("Mercedes Benz", Optional.ofNullable(seguro));
		
		Optional<Motorista> motoristaJoao = Optional.ofNullable(new Motorista("Jo�o", 40, Optional.ofNullable(caminhao))); //Cria��o de obketo "Motoristas"
		Optional<Motorista> motoristaJose = Optional.ofNullable(new Motorista("Jose", 25, Optional.ofNullable(null)));
		
		motoristas.put("Jo�o", motoristaJoao);  //Colocando no map
		motoristas.put("Jose", motoristaJose);
	}
	public Optional<Motorista> porNome(String nome) {
		return motoristas.get(nome);
	}
}
