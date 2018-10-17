package POO;

public class Computador implements InterfaceComputador{
    @Override
    public Coordenadas Jogar(char[][] matriz) {
      Coordenadas coordenadas =  new Coordenadas();
        for(int linha =0;linha<3;linha++){
            for(int coluna =0;coluna<3;coluna++){
                if(matriz[linha][coluna] == ' '){
                    coordenadas.x = linha;
                    coordenadas.y = coluna;
                    return coordenadas;
                }

            }

        }
        return coordenadas;

    }
}
