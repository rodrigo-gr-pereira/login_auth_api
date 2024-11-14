package br.edu.unirios.blog.service;

import br.edu.unirios.blog.entity.Postagem;
import br.edu.unirios.blog.interfaces.RepositorioPostagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoPostagem {

    @Autowired
    private RepositorioPostagem repo;

    public List<Postagem> buscarTodos(){
        return repo.findAll();
    }

    public Postagem buscar(int id) {
        Optional<Postagem> obj = repo.findById(id);
        return obj.orElse(null);
    }


    public Postagem salvar(Postagem obj){
        obj.setId(null);
        return repo.save(obj);
    }

    public  void deletar(int id){
        buscar(id); // existe, ou ira gerar expection
        repo.deleteById(id);
    }

    public Postagem editar(Postagem obj){
        Postagem newObj = buscar(obj.getId());
        modificar(newObj, obj);
        return repo.save(newObj);
    }

    public void modificar(Postagem newObj,Postagem obj){
        newObj.setAutor(obj.getAutor());
        newObj.setComentarios(obj.getComentarios());
        newObj.setTexto(obj.getTexto());
        newObj.setTitulo(obj.getTitulo());
    }
}
