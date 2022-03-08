package org.generation.BlogPessoal.Controller;

import java.util.Optional;

import javax.validation.Valid;

import org.generation.BlogPessoal.Repository.UsuarioRepository;
import org.generation.BlogPessoal.Service.UsuarioService;
import org.generation.BlogPessoal.model.UserLogin;
import org.generation.BlogPessoal.model.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {
	
	private UsuarioService usuarioService;
	
	private UsuarioRepository usuarioRepository;
	
	@PostMapping("/logar")
	public ResponseEntity<UserLogin> Autentication(@RequestBody Optional <UserLogin> user){
		return usuarioService.Logar(user).map(resp ->ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	@PostMapping("/cadastar")
	public ResponseEntity<Usuario> Post(@Valid @RequestBody Usuario usuario){
		return usuarioService.CadastrarUsuario(usuario).map(resp -> ResponseEntity.status(HttpStatus.CREATED).body(resp))
				.orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());
	}
}
