import java.util.ArrayList;

public class Manga {
    int codigo;
    String nome;
    String tipo;
    String autor;
    String editora;
    int numCapitulos;
    static ArrayList<Manga> manga = new ArrayList<Manga>();



    public Manga(int codigo, String nome, String tipo, String autor, String editora, int numCapitulos) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
        this.autor = autor;
        this.editora = editora;
        this.numCapitulos = numCapitulos;
    }



    public static void consultarManga(int v) {

        for (int i = 0; i < manga.size(); i++) {

            if (manga.get(i).codigo == v) {
                manga.get(i).imprimirManga();
            }
        }

    }

    public static void alterarManga(int v, String nA, String tipA, String autA, String ediA, int c) {
        for (int i = 0; i < manga.size(); i++) {
            if (manga.get(i).codigo == v) {
                System.out.println("Manga alterado com sucesso");

                manga.set(i, new Manga(v, nA, tipA, autA, ediA, c));

            }
        }
    }

    public static void inserirManga(String nA, String tipA, String autA, String ediA, int c) {


        manga.add(new Manga(manga.size() + 1, nA, tipA, autA, ediA, c));


    }

    public static void excluirManga(int v) {

        for (int i = 0; i < manga.size(); i++) {

            if (manga.get(i).codigo == v) {
                manga.remove(i);
                chamarManga();

            }


        }
    }
    public static void relatorioAutor(String s){
        for (int i = 0; i < manga.size(); i++) {

            if (manga.get(i).autor.equalsIgnoreCase(s) ) {
                manga.get(i).imprimirManga();
            }
        }
    }

    public static void relatorioTipo(String s){
        for (int i = 0; i < manga.size(); i++) {

            if (manga.get(i).tipo.equalsIgnoreCase(s) ) {
                manga.get(i).imprimirManga();
            }
        }
    }

    public static void relatorioQuantc(){


        for(int i=0;i<manga.size();i++){
            int indiceMenor= i;
        for (int j = i + 1; j < manga.size(); j++) {

            if (manga.get(j).numCapitulos > manga.get(indiceMenor).numCapitulos) {
                indiceMenor = j;
            }

        }


        if (indiceMenor != i) {
            Manga temp = manga.get(i);
            manga.set(i, manga.get(indiceMenor));
            manga.set(indiceMenor,temp);
        }

    }
        chamarManga();






    }
    public static void chamarManga() {
        for (int i = 0; i < Manga.manga.size(); i++) {
            Manga.manga.get(i).imprimirManga();

        }

    }


    public void imprimirManga() {
        System.out.println("MangasList" +
                "\nCodigo:" + codigo
                + "\tNome:" + nome +
                "\tTipo:" + tipo +
                "\tAutor:" + autor +
                "\tEditora:" + editora +
                "\tNumero de cápitulos:" + numCapitulos);

    }


}

