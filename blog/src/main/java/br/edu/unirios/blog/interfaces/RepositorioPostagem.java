package br.edu.unirios.blog.interfaces;

import br.edu.unirios.blog.entity.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioPostagem extends JpaRepository<Postagem, Integer> {
}
