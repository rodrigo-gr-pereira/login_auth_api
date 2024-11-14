package br.edu.unirios.blog.interfaces;

import br.edu.unirios.blog.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioAutor  extends JpaRepository<Autor, Integer> {
}
