import java.util.Scanner;

public class CacaPalavras {
    public CacaPalavras(){
        String palavras [][] = new String [5][2];
        char mapa [][] = new char [10][5];

        mapaEntrada(mapa);
        palavraEntrada(palavras);
        mapaPesquisa(palavras, mapa);

        Scanner input = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("_____ Menu: Caça Palavras _____");
            System.out.println("1. listar palavras");
            System.out.println("2. listar mapa");
            System.out.println("3. listar respostas");
            System.out.println("4. sair");
            System.out.print("__opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    palavraImprimir(palavras);
                    break;
                case 2:
                    mapaImprimir(mapa);
                    break;
                case 3:
                    palavrasRespostas(palavras);
                    break;
                default:
                System.out.println("Opção ERRADA, tente novamente!...");
                    break;
            }
        } while (opcao != 4);
        
        input.close();
    }
    
    public void palavraEntrada(String [][] palavras){
        palavras[0][0] = "IFELSE";  
        palavras[1][0] = "FORA";  
        palavras[2][0] = "WHILE";  
        palavras[3][0] = "OBJETO";  
        palavras[4][0] = "VETOR";  
    }
    
    public void palavraImprimir(String [][] palavras){
        int linhas = palavras.length;

        for (int i = 0; i < linhas; i++) {
            System.out.print(palavras[i][0]);
            System.out.println();
        }
    }
    
    public void palavrasRespostas(String [][] palavras){
        for (int i = 0; i < palavras.length; i++) {
         
            if (!(palavras[i][1] == null)){
                System.out.print(palavras[i][1] + " - " + palavras[i][0]); 
                System.out.println();

            } 
            else{
                System.out.print("Palavra NÃO encontrada: "+ palavras[i][0]); 
                System.out.println();
            }
        }
    }
    
    public void mapaEntrada(char [][] mapa){
        mapa[0][0]='D';  mapa[0][1]='C';  mapa[0][2]='Q';  mapa[0][3]='W';  mapa[0][4]='E';
        mapa[1][0]='I';  mapa[1][1]='X';  mapa[1][2]='F';  mapa[1][3]='O';  mapa[1][4]='R';
        mapa[2][0]='F';  mapa[2][1]='F';  mapa[2][2]='R';  mapa[2][3]='G';  mapa[2][4]='F';
        mapa[3][0]='E';  mapa[3][1]='L';  mapa[3][2]='I';  mapa[3][3]='H';  mapa[3][4]='W';
        mapa[4][0]='L';  mapa[4][1]='S';  mapa[4][2]='F';  mapa[4][3]='O';  mapa[4][4]='U';
        mapa[5][0]='S';  mapa[5][1]='D';  mapa[5][2]='G';  mapa[5][3]='T';  mapa[5][4]='S';
        mapa[6][0]='E';  mapa[6][1]='J';  mapa[6][2]='H';  mapa[6][3]='E';  mapa[6][4]='T';
        mapa[7][0]='I';  mapa[7][1]='I';  mapa[7][2]='I';  mapa[7][3]='J';  mapa[7][4]='M';
        mapa[8][0]='X';  mapa[8][1]='C';  mapa[8][2]='K';  mapa[8][3]='B';  mapa[8][4]='G';
        mapa[9][0]='V';  mapa[9][1]='E';  mapa[9][2]='T';  mapa[9][3]='O';  mapa[9][4]='R';
    }
    
    public void mapaImprimir(char [][] mapa){
        int linhas = mapa.length;
        int colunas = mapa[0].length;

        System.out.println("Elementos da matriz:");

        System.out.println("---------------------");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("| "+mapa[i][j]+" ");
                if (j == colunas - 1) {
                    System.out.print("|");
                }
            }
            System.out.println("\n---------------------");
        }
    }
    
    public void mapaPesquisa(String[][] palavras, char[][] mapa) {
        int mapaLinhaTamanho = mapa.length;
        int mapaColunaTamanho = mapa[0].length;
    
        for (int iPalavra = 0; iPalavra < palavras.length; iPalavra++) {
            String palavraCorrente = palavras[iPalavra][0];
            int palavraCorrenteTamanho = palavraCorrente.length();
            boolean palavraEncontrada = false;
    
            for (int i = 0; i < mapaLinhaTamanho; i++) {
                for (int j = 0; j < mapaColunaTamanho; j++) {
                    if (mapa[i][j] == palavraCorrente.charAt(0)) {
                        boolean encontrada = true;
    
                        // Verificar horizontalmente para a direita
                        if (j + palavraCorrenteTamanho <= mapaColunaTamanho) {
                            for (int k = 0; k < palavraCorrenteTamanho; k++) {
                                if (mapa[i][j + k] != palavraCorrente.charAt(k)) {
                                    encontrada = false;
                                    break;
                                }
                            }
                            if (encontrada) {
                                palavraEncontrada = true;
                                palavras[iPalavra][1] = "["+(i) + ", " + (j)+"]";
                                break;
                            }
                        }
    
                        // Verificar horizontalmente para a esquerda
                        if (!palavraEncontrada && j - palavraCorrenteTamanho + 1 >= 0) {
                            encontrada = true;
                            for (int k = 0; k < palavraCorrenteTamanho; k++) {
                                if (mapa[i][j - k] != palavraCorrente.charAt(k)) {
                                    encontrada = false;
                                    break;
                                }
                            }
                            if (encontrada) {
                                palavraEncontrada = true;
                                palavras[iPalavra][1] = "["+(i) + ", " + (j)+"]";
                                break;
                            }
                        }
    
                        // Verificar verticalmente para baixo
                        if (!palavraEncontrada && i + palavraCorrenteTamanho <= mapaLinhaTamanho) {
                            encontrada = true;
                            for (int k = 0; k < palavraCorrenteTamanho; k++) {
                                if (mapa[i + k][j] != palavraCorrente.charAt(k)) {
                                    encontrada = false;
                                    break;
                                }
                            }
                            if (encontrada) {
                                palavraEncontrada = true;
                                palavras[iPalavra][1] = "["+(i) + ", " + (j)+"]";
                                break;
                            }
                        }
    
                        // Verificar verticalmente para cima
                        if (!palavraEncontrada && i - palavraCorrenteTamanho + 1 >= 0) {
                            encontrada = true;
                            for (int k = 0; k < palavraCorrenteTamanho; k++) {
                                if (mapa[i - k][j] != palavraCorrente.charAt(k)) {
                                    encontrada = false;
                                    break;
                                }
                            }
                            if (encontrada) {
                                palavraEncontrada = true;
                                palavras[iPalavra][1] = "["+(i) + ", " + (j)+"]";
                                break;
                            }
                        }
                    }
                }
                
                if (palavraEncontrada) {
                    break;
                }
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        new CacaPalavras();
    }
}
