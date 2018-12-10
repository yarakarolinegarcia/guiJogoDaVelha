package POO;

import java.util.ArrayList;
import java.util.Collections;

public class Computador implements InterfaceComputador{
    private int[][] tabuleiro;
    private ArrayList<Eixo> eixos;

    @Override
    public Coordenadas Jogar(int[][] tabuleiro) {
        eixos = new ArrayList<>();
        this.tabuleiro = tabuleiro;

        ganhouHorizontal();
        ganhouVertical();
        ganhouDiagonal();

        Collections.sort(eixos);

        Coordenadas coordenadas =  verificaPosicaoLivreGanhar();

        if(coordenadas != null )
            return coordenadas;

        return verificaPosicaoLivreEmpatar();

    }

    public Coordenadas verificaPosicaoLivreGanhar() {

        for (int h=0; h < eixos.size();h++){
            Eixo eixo = eixos.get(h);

            if(eixo.getValor() == -2) {
                return  pegaPosicaoLivre(eixo);
            }
        }

        return null;
    }


    public Coordenadas verificaPosicaoLivreEmpatar(){

        for (int h=0; h< eixos.size();h++) {

            Eixo eixo = eixos.get(h);

            System.out.println(eixo);
            Coordenadas cod =  pegaPosicaoLivre(eixo);

            if(cod != null)
                return  pegaPosicaoLivre(eixo);
        }

        return   null;
    }

    public Coordenadas pegaPosicaoLivre(Eixo eixo) {

        if (eixo.getId() < 3) {

            for (int i = eixo.getId(); i < 3; i++) {

                for (int j = 0; j < 3; j++) {
                    if (this.tabuleiro[i][j] == 0) {
                        return new Coordenadas(i, j);
                    }
                }
            }
        }

        if (eixo.getId() > 2) {

            for (int j = eixo.getId() - 3; j < 3; j++) {

                for (int i = 0; i < 3; i++) {
                    if (this.tabuleiro[i][j] == 0) {
                        return new Coordenadas(i, j);
                    }
                }
            }
        }

        if (eixo.getId() == 6) {

            if (tabuleiro[0][0] == 0)
                return new Coordenadas();

            if (tabuleiro[1][1] == 0)
                return new Coordenadas(1, 1);


            if (tabuleiro[2][2] == 0)
                return new Coordenadas(2, 2);
        }

        if (eixo.getId() == 7) {

            if (tabuleiro[0][2] == 0)
                return new Coordenadas(0, 2);

            if (tabuleiro[1][1] == 0)
                return new Coordenadas(1, 1);


            if (tabuleiro[2][0] == 0)
                return new Coordenadas(2, 0);
        }

        return null;
    }

    public void ganhouHorizontal() {

        for (int i = 0; i < 3; i++) {
            int soma = 0;
            for (int j = 0; j < 3; j++) {
                soma = (this.tabuleiro[i][j]) + soma;
            }
            Eixo eixo = new Eixo(i,soma);
            eixos.add(eixo);
        }
    }

    public void ganhouVertical(){
        for (int j = 0; j< 3; j++) {
            int soma = 0;
            for (int i = 0; i < 3; i++) {
                soma = (this.tabuleiro[i][j]) + soma;
            }
            Eixo eixo = new Eixo(j+3,soma);
            eixos.add(eixo);
        }
    }

    public void ganhouDiagonal(){
        int soma;

        soma = tabuleiro[0][0]+  tabuleiro[1][1]+ tabuleiro[2][2];

        Eixo eixo = new Eixo(6,soma);
        eixos.add(eixo);

        soma = tabuleiro[0][2]+  tabuleiro[1][1]+ tabuleiro[2][0];

        Eixo eixo2 = new Eixo(7,soma);
        eixos.add(eixo2);

    }
}
