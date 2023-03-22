package com.unialfa.aula5.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.unialfa.aula5.service.comentarioService;

@Autowired
private comentarioServicie servicie;


@Controller
public class ComentarioController {
    //criação rota página principal da aplicação
    @RequestMapping("/")
    public String iniciar(Model model){
        model.addAttribute("bemVindo","Bem vindo ao nosso formulário");
        return "formulario";
    }
    //enviando informações pela rota
    @PostMapping("enviar")
    public String enviar(Comentario comentario){
        service.salvar(comentario);
        //
        service.listarComentarios().forEach(c -> {
            System.out.println(c.getTexto());
        });
        //redirecionamento da página
        return "redirect:/";
    }
}
