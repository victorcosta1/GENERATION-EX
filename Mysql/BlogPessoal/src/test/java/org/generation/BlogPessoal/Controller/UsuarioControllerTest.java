package org.generation.BlogPessoal.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.generation.BlogPessoal.Service.UsuarioService;
import org.generation.BlogPessoal.model.Usuario;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UsuarioControllerTest {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Autowired
	private UsuarioService usuarioService;

	@Test
	@Order(1)
	public void deveCadastrarUmUsuario() {
		HttpEntity<Usuario> requisicao = new HttpEntity<Usuario>(
				new Usuario(0L, "Zé Mario", "zemario@hotmail.com", "1223456789"));

		ResponseEntity<Usuario> resposta = testRestTemplate.exchange("/user/cadastar", HttpMethod.POST, requisicao,
				Usuario.class);

		assertEquals(HttpStatus.CREATED, resposta.getStatusCode());
		assertEquals(requisicao.getBody().getUsuario(), resposta.getBody().getUsuario());

	}

	@Test
	@Order(2)
	private void deveAtualizarUmUsuario() {
		Optional<Usuario> usuarioCreate = usuarioService
				.CadastrarUsuario(new Usuario(0L, "TinkWink", "tinkwink@telletubies.com.br", "bolsavermelha"));

		Usuario usuarioUpdate = new Usuario(usuarioCreate.get().getId(), "TinkWink da silva",
				"tinkwink@telletubies.com.br", "bolsavermelha");

		HttpEntity<Usuario> requisicaoAtualizacao = new HttpEntity<Usuario>(usuarioUpdate);

		ResponseEntity<Usuario> respostaAtualizacao = testRestTemplate.withBasicAuth("root", "root")
				.exchange("/usuarios/atualizar", HttpMethod.PUT, requisicaoAtualizacao, Usuario.class);

		assertEquals(HttpStatus.OK, respostaAtualizacao.getStatusCode());

	}

}
