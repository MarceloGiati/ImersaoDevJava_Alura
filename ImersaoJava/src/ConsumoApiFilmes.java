import java.io.InputStream;
import java.net.URL;
import java.util.List;
// import java.net.URI;
// import java.util.Map;
// import java.net.http.HttpClient;
// import java.net.http.HttpRequest;
// import java.net.http.HttpResponse;
// import java.net.http.HttpResponse.BodyHandlers;

public class ConsumoApiFilmes {

    public static void main(String[] args) throws Exception {

        // String url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";
        // ExtratorConteudo extrator = new ExtratorConteudoImdb();

        String url = "https://api.nasa.gov/planetary/apod?api_key=JC9PMT8QkCH1iJrxOppJVAwWP9GwBzxpD37JG1wL&start_date=2022-06-12&end_date=2022-06-14";
        ExtratorConteudoNasa extrator = new ExtratorConteudoNasa();

        ClienteHttp http = new ClienteHttp();
        String json = http.buscaDdados(url);

        // extrair e manipular os dados
        List<Conteudo> conteudos = extrator.extraiConteudos(json);

        // exibir e manipular dados
        for (int i = 0; i < 3; i++) {
            GeradorDeFiguras geradora = new GeradorDeFiguras();
            Conteudo conteudo = conteudos.get(i);

            InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();
            String nomeArquivo = conteudo.getTitulo().replace(":", "-") + ".png";

            geradora.cria(inputStream, nomeArquivo);

            System.out.println(conteudo.getTitulo());
            System.out.println();
        }

    }
}
