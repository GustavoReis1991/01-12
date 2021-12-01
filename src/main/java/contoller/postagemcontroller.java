package contoller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.postagem;
import repositorio.postagemrepositorio;

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class postagemcontroller {
	
	@Autowired
	private postagemrepositorio repositorio;
	
	@GetMapping
	public ResponseEntity<List<postagem>> GetAll(){
		return ResponseEntity.ok(repositorio.findAll());
	}
	
	

}
