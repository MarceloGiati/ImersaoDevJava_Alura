public enum EndPointApi {

    IMDB_TOP250_MOVIES("https://alura-imdb-api.herokuapp.com/movies",
            new ExtratorConteudoIMDB()),
    IMDB_MOST_POPULAR_MOVIES("https://api.mocki.io/v2/549a5d8b/MostPopularMovies",
            new ExtratorConteudoIMDB()),
    NASA_APOD("https://api.nasa.gov/planetary/apod?api_key=<>&start_date=2022-07-01&end_date=2022-07-05",
            new ExtratorConteudoNasa());

    private String url;
    private ExtratorConteudo extrator;

    EndPointApi(String url, ExtratorConteudo extrator) {
        this.url = url;
        this.extrator = extrator;
    }

    public String getUrl() {
        return url;
    }

    public ExtratorConteudo getExtrator() {
        return extrator;
    }
}