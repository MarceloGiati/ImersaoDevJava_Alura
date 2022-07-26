import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorConteudoIMDB implements ExtratorConteudo {
    public List<Conteudo> extraiConteudos(String json) { // Extrair só os dados que interessam (titulo, poster, nota)
        JsonParser parser = new JsonParser();
        List<Map<String, String>> listaAtributos = parser.parse(json);

        List<Conteudo> conteudos = new ArrayList<>();

        // Popular a lista de conteudos
        for (Map<String, String> atributos : listaAtributos) {
            String titulo = atributos.get("title");
            String urlImg = atributos.get("image").replaceAll("(@+)(.*).jpg$", "$1.jpg");
            Conteudo conteudo = new Conteudo(titulo, urlImg);

            conteudos.add(conteudo);
        }
        return conteudos;
    }

}