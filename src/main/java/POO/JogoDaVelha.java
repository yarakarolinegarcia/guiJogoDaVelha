package POO;

public class JogoDaVelha {
    public char[][] getMatriz() {
        return matriz;
    }
    public char matrizPosicao(int x, int y){
        return matriz[x][y];
    }
    private char[][] matriz= {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
    private char caracter = 'X';
    private int numeroJogadas = 0;

    public int getNumeroJogador() {
        return numeroJogador;
    }

    private int numeroJogador;
    public JogoDaVelha() {

    }

    private boolean validaJogada(int x, int y){
        if(matriz[x][y] == ' '){
            return true;
        } else {
            return false;
        }
    }
    public void reinicia(){
        for(int  linha = 0; linha < 3;linha++){
            for (int coluna =0; coluna < 3; coluna++){
                matriz[linha][coluna] = ' ';
            }
        }
        numeroJogadas = 0;

    }

    public boolean jogar(int x, int y, int numeroJogador) {
        numeroJogadas++;
        this.numeroJogador = numeroJogador;
        if (!validaJogada(x,y)) {
            System.out.println("Jogada invalida, posição já ocupada");
            return false;
        }

        if(numeroJogador == 1){
            caracter='X';
        } else {
            caracter ='O';
        }
        matriz[x][y] = caracter;


        return true;
    }

    public boolean limiteJogadas() {
        if(numeroJogadas < 9){
            return false;
        } else {
            return true;
        }
    }

    private boolean verificaVertical() {

        if (matriz[0][0] == caracter && matriz[0][1] == caracter && matriz[0][2] == caracter) {
            return true;

        } else if (matriz[1][0] == caracter && matriz[1][1] == caracter && matriz[1][2] == caracter) {

            return true;

        } else if (matriz[2][0] == caracter && matriz[2][1] == caracter && matriz[2][2] == caracter) {
            return true;
        } else {
            return false;
        }
    }



    private boolean vefificaHorizontal() {
        if (matriz[0][0] == caracter && matriz[1][0] == caracter && matriz[2][0] == caracter) {
            return true;

        } else if (matriz[0][1] == caracter && matriz[1][1] == caracter && matriz[2][1] == caracter) {

            return true;

        } else if (matriz[0][2] == caracter && matriz[1][2] == caracter && matriz[2][2] == caracter) {

            return true;
        } else {
            return false;
        }

    }

    private boolean verificaDiagonal() {
        if (matriz[0][0] == caracter && matriz[1][1] == caracter && matriz[2][2] == caracter) {

            return true;
        } else if (matriz[0][2] == caracter && matriz[1][1] == caracter && matriz[2][0] == caracter) {

            return true;
        } else {
            return false;
        }
    }

    public boolean ganhou(){
        if(vefificaHorizontal() || verificaDiagonal() || verificaVertical()) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimeJogoDaVelha(){
        limparTelaTerminalVT100();
        System.out.println( matriz[0][0]+ "  \u2502 "+matriz[0][1] + " \u2502 " +matriz [0][2]);
        System.out.println("\u2500\u2500\u2500\u253c\u2500\u2500\u2500\u253c\u2500\u2500\u2500");
        System.out.println( matriz[1][0]+"  \u2502 "+matriz[1][1] + " \u2502 " +matriz [1][2]);
        System.out.println("\u2500\u2500\u2500\u253c\u2500\u2500\u2500\u253c\u2500\u2500\u2500");
        System.out.println(matriz[2][0]+"  \u2502 "+matriz[2][1] + " \u2502 "+matriz [2][2]);
    }

    private void limparTelaTerminalVT100(){
        System.out.print("\033[H\033[2J");
        System.out.println("\n");

        System.out.flush();
    }
}
