import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao=0;

        Scanner receber = new Scanner(System.in);
        Metodos metodos = new Metodos();


        //Mangas já cadastrados como exemplo
        Manga.manga.add(new Manga (1,"Dragon ball","Shounen","AkiraToriyama","Shounen Jump",42));
        Manga.manga.add(new Manga (2,"Dragon ball z","Shounen","AkiraToriyama","Shounen Jump",519));
        Manga.manga.add(new Manga(3,"Saiki kusuo no psi-nan","Comedia", "SuichiAso","Shounen Jump",25));
        Manga.manga.add(new Manga(4,"One piece","Shounen", "EichiroOda","Shounen Jump",1130));
        Manga.manga.add(new Manga(5,"Re:zero","Isekai", "TappeiNagatsuki","Kadowaka",60));
        Manga.manga.add(new Manga(6,"Gintama","Comedia", "HideakiSorachi","Shounen Jump",704));
        Manga.manga.add(new Manga(7,"Jujutsu Kaisen","Shounen", "GegeAkutami","Shounen Jump",271));


        System.out.println("Seja bem-vindo ao MangaList, sua wikipedia de mangas favorita!!");


        while(opcao<=0 || opcao>5) {
            metodos.exibirMenu();
            opcao = receber.nextInt();
            int valor = 0;
            int codmanga=0;
            int copiasA;
            String nomeA = "", tipoA, autorA, editoraA;
            String valorS;

            switch (opcao) {
                case 1:
                    System.out.println("Digite o numero do codigo para consulta manga desejado");
                    valor = receber.nextInt();

                    Manga.consultarManga(valor);

                    break;

                case 2:

                        System.out.println("Digite o nome");
                        nomeA = receber.next();
                        System.out.println("Digite o tipo");
                        tipoA = receber.next();
                        System.out.println("Digite o autor");
                        autorA = receber.next();
                        System.out.println("Digite a editora");
                        editoraA = receber.next();
                        System.out.println("Digite o numero de copias");
                        copiasA = receber.nextInt();

                        Manga.inserirManga(nomeA, tipoA, autorA, editoraA, copiasA);
                        Manga.chamarManga();
                        break;

                case 3:
                    System.out.println("escreva o numero desejado para alterar");
                    valor = receber.nextInt();

                    System.out.println("Digite o nome");
                    nomeA = receber.next();
                    System.out.println("Digite o tipo");
                    tipoA = receber.next();
                    System.out.println("Digite o autor");
                    autorA = receber.next();
                    System.out.println("Digite a editora");
                    editoraA = receber.next();
                    System.out.println("Digite o numero de copias");
                    copiasA = receber.nextInt();

                    Manga.alterarManga(valor,nomeA,tipoA,autorA,editoraA,copiasA);
                    Manga.chamarManga();
                    break;


                case 4:

                            System.out.println("informe qual o codigo do manga deseja remover");
                            valor = receber.nextInt();
                            Manga.excluirManga(valor);

                            break;

                case 5:
                    System.out.println("Digite a opção desejada para relatório" +
                            "\n1-Autor" +
                            "\n2- Tipo" +
                            "\n3-Numero de captulos");

                        valor = receber.nextInt();
                        switch(valor){
                            case 1:
                                System.out.println("Digite o nome do autor");
                                valorS = receber.next();
                                Manga.relatorioAutor(valorS);

                                break;

                            case 2:
                                System.out.println("Digite o tipo de Manga");
                                valorS = receber.next();
                                Manga.relatorioTipo(valorS);
                                break;

                            case 3:
                                Manga.relatorioQuantc();
                                break;

                            default:
                                System.out.println("Opção invalida");
                                break;
                        }
                    break;
                case 6:
                    return;

                default:
                    System.err.println("Opção invalida tente novamente");
                    break;
            }






        }
    }
}