package org.generation.BlogPessoal.Repository;

import java.util.List;

import org.generation.BlogPessoal.model.PostModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository								//Metodos http	//Long é a Variavél da classe primaria
public interface PostRepository extends JpaRepository<PostModel, Long> {
	
	public List<PostModel> findAllByTitleContainingIgnoreCase(String title);

}

/*Dicionario:
 * Post = Postagem
 * Nome do BD: bd_blogpessoal
 * PostModel: PostagemModelo
 * PostRepository: PostagemRepository
 * Title: Titulo
 * Description: Texto/text
 *nome da lista de postagem no tema = post*/