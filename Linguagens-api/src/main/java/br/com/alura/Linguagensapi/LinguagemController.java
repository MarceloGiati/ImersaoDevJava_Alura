package br.com.alura.Linguagensapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class LinguagemController {

    // private List<Linguagem> linguagems = List.of(
    // new Linguagem("Java,
    // https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png",
    // 1),
    // new Linguagem("C#,
    // https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/c/c_256x256.png",
    // 2);
    // // new Linguagem("HTML,
    // https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/html/html_256x256.png",
    // 3),
    // // new Linguagem("CSS,
    // https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/css/css_256x256.png",
    // 4)
    // );

    // private List<Linguagem> linguagens =
    // List.of(
    // new Linguagem("Java",
    // "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png",
    // 1),
    // new Linguagem("Python",
    // "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/python/python_256x256.png",
    // 2)
    // );

    // @GetMapping("value=/linguagem-preferida")
    // public String processaLinguagemPreferida() {
    // return "Oi, Java!";
    // }

    @Autowired
    private LinguagemRepository repositorio;

    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagens() {
        List<Linguagem> linguagems = repositorio.findAll();
        return linguagems;
    }

    @PostMapping("/linguagens")
    public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem) {
        Linguagem linguagemSalva = repositorio.salve(linguagem);
        // Linguagem linguagemSalva;
        return linguagemSalva;
    }

}
