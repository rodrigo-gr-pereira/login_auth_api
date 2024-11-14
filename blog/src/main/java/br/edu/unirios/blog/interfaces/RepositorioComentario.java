package br.edu.unirios.blog.interfaces;

import br.edu.unirios.blog.entity.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioComentario  extends JpaRepository<Comentario, Integer> {
}
