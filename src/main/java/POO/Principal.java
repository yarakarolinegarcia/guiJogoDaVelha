package POO;

import javax.swing.*;
import java.awt.event.*;

public class Principal {

    private JPanel painelPrincipal;
    private JPanel Placar;
    private JLabel jogadorVez;
    private JLabel adicionaNome;
    private JLabel botao00;
    private JLabel botao01;
    private JLabel botao02;
    private JLabel botao10;
    private JLabel botao11;
    private JLabel botao12;
    private JLabel botao20;
    private JLabel botao21;
    private JLabel botao22;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel pontuacaoJogador1;
    private JLabel pontuacaoJogador2;
    private JButton reiniciarPartidaButton;
    private JButton pessoaContraComputadorButton;
    private JPanel JPanel;
    JogoDaVelha jogo;
    int tipoPartida = 1;
    Computador computador;

    public Principal() {
        jogo = new JogoDaVelha();
        computador = new Computador();

        botao00.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Cliquei no botao 00");
                if(jogo.jogar(0,   0)==true) {
                    atualizarTabuleiro();
                } else{
                    //TODO criar uma janela de aviso
                }
            }
        });

        botao01.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Cliquei no botao 01");
                if(jogo.jogar(0,   1)==true) {
                    atualizarTabuleiro();
                } else{
                    //TODO criar uma janela de aviso
                }
            }
        });

        botao02.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Cliquei no botao 02");
                if( jogo.jogar(0,   2)==true) {
                    atualizarTabuleiro();
                } else{
                    //TODO criar uma janela de aviso
                }
            }
        });

        botao10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Cliquei no botao 10");
                if(jogo.jogar(1,   0)==true) {
                    atualizarTabuleiro();
                } else{
                    //TODO criar uma janela de aviso
                }

            }
        });

        botao11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Cliquei no botao 11");
                if( jogo.jogar(1,   1)==true) {
                    atualizarTabuleiro();
                } else{
                    //TODO criar uma janela de aviso
                }
            }
        });

        botao12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Cliquei no botao 12");
                if(jogo.jogar(1,   2)==true) {
                    atualizarTabuleiro();
                } else{
                    //TODO criar uma janela de aviso
                }
            }
        });

        botao20.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Cliquei no botao 20");
                if(jogo.jogar(2,   0)==true) {
                    atualizarTabuleiro();
                } else{
                    //TODO criar uma janela de aviso
                }
            }
        });

        botao21.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Cliquei no botao 21");

                if(jogo.jogar(2,   1)==true) {
                    atualizarTabuleiro();
                } else{
                    //TODO criar uma janela de aviso
                }
            }
        });

        botao22.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Cliquei no botao 22");
                if(jogo.jogar(2,   2)==true) {
                    atualizarTabuleiro();
                } else{
                    //TODO criar uma janela de aviso
                }
            }
        });

        reiniciarPartidaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogo.iniciarTabuleiro();
                atualizarTabuleiro();
            }
        });

        pessoaContraComputadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tipoPartida = 1;

            }
        });
    }

    public void atualizarPlacarJogador1(){
        pontuacaoJogador1.setText(String.valueOf(jogo.getPlacarJogador1()));
    }

    public void atualizarPlacarJogador2(){
        pontuacaoJogador2.setText(String.valueOf(jogo.getPlacarJogador2()));
    }




    public void atualizarTabuleiro(){

        if(jogo.matrizPosicao(0,0) ==1)
            botao00.setText("X");
        else  if(jogo.matrizPosicao(0,0) ==-1)
            botao00.setText("O");
        else  botao00.setText("");

        if(jogo.matrizPosicao(0,1) ==1)
            botao01.setText("X");
        else  if(jogo.matrizPosicao(0,1) ==-1)
            botao01.setText("O");
        else  botao01.setText("");

        if(jogo.matrizPosicao(0,2) ==1)
            botao02.setText("X");
        else  if(jogo.matrizPosicao(0,2) ==-1)
            botao02.setText("O");
        else  botao02.setText("");

        if(jogo.matrizPosicao(1,0) ==1)
            botao10.setText("X");
        else  if(jogo.matrizPosicao(1,0) ==-1)
            botao10.setText("O");
        else  botao10.setText("");

        if(jogo.matrizPosicao(1,1) ==1)
            botao11.setText("X");
        else  if(jogo.matrizPosicao(1,1) ==-1)
            botao11.setText("O");
        else  botao11.setText("");

        if(jogo.matrizPosicao(1,2) ==1)
            botao12.setText("X");
        else  if(jogo.matrizPosicao(1,2) ==-1)
            botao12.setText("O");
        else  botao12.setText("");

        if(jogo.matrizPosicao(2,0) ==1)
            botao20.setText("X");
        else  if(jogo.matrizPosicao(2,0) ==-1)
            botao20.setText("O");
        else  botao20.setText("");

        if(jogo.matrizPosicao(2,1) ==1)
            botao21.setText("X");
        else  if(jogo.matrizPosicao(2,1) ==-1)
            botao21.setText("O");
        else  botao21.setText("");

        if(jogo.matrizPosicao(2,2) ==1)
            botao22.setText("X");
        else  if(jogo.matrizPosicao(2,2) ==-1)
            botao22.setText("O");
        else  botao22.setText("");

        verificaGanhador();
    }

    public void verificaGanhador(){

        if(jogo.tabuleiroCheio()){
            System.out.println("deu velha");
            //TODO janela pra avisar que deu velha
            return;
        }

        jogo.ganhou();

        atualizarPlacarJogador2();

        atualizaJogador();
    }

    private void atualizaJogador() {
        if(jogo.isJogadorDaVez()) {
            jogadorVez.setText("Jogador1");

        } else {
            jogadorVez.setText("Jogador2");

            if(tipoPartida == 1) {
                Coordenadas posicaoJogadaComputador = computador.Jogar(jogo.getMatriz());
                int x = posicaoJogadaComputador.x;
                int y = posicaoJogadaComputador.y;
                jogo.jogar(x, y);
                atualizarTabuleiro();
            }

        }
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Principal");
        frame.setContentPane(new Principal().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
//        frame.setVisible(true);

        frame.setLocationRelativeTo(null);

        frame.setResizable(false);

        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
