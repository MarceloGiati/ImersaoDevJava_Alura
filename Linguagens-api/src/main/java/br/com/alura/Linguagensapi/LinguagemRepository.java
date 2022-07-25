package br.com.alura.Linguagensapi;

import java.util.List;
import org.springframework.data.mongodb.repository.cdi.MongoRepositoryBean;

public class LinguagemRepository extends MongoRepositoryBean<Linguagem, String> {

    public List<Linguagem> findAll() {
        return null;
    }

    public Linguagem salve(Linguagem linguagem) {
        return null;
    }

}