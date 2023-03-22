package com.unialfa.aula5.service;

import com.unialfa.aula5.model.Comentario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//utilização de injeção de dependencia
@Service
public class comentarioService {
    private List<Comentario> comentarios = new ArrayList<>();

    public void salvar(Comentario comentario){
        comentarios.add(comentario);
    }

    public List<Comentario> listarComentarios() {
        return comentarios;
    }
}
