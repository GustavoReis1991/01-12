package repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.postagem;

@Repository
public interface postagemrepositorio extends JpaRepository<postagem, Long> {
	
	public List<postagem> findAllByTituloContainingIgnoreCase (String titulo);
	
}
