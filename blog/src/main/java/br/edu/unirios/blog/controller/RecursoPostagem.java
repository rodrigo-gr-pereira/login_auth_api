package br.edu.unirios.blog.controller;

import br.edu.unirios.blog.entity.Postagem;
import br.edu.unirios.blog.service.ServicoPostagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/postagem")
public class RecursoPostagem {

    @Autowired
    private ServicoPostagem servico;

    //@PostMapping("/postagem")
    @RequestMapping(method= RequestMethod.POST)
    public ResponseEntity<Void> salvar(@RequestBody Postagem obj){
        obj = servico.salvar(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    //buscar todos
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Postagem>> buscarTodos(){
        List<Postagem> list = servico.buscarTodos();
        return ResponseEntity.ok().body(list);
    }
    //buscar
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Postagem> buscar(@PathVariable Integer id){
        Postagem obj = servico.buscar(id);
        return ResponseEntity.ok().body(obj);
    }
    //editar
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> editar(@RequestBody Postagem obj, @PathVariable Integer id){
        obj.setId(id);
        obj = servico.editar(obj);
        return ResponseEntity.noContent().build();
    }
    //deletar
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deletar(@PathVariable Integer id){
        servico.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
