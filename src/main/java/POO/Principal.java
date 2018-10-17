package POO;

import javax.swing.*;
import java.awt.event.*;

public class Principal {

    private JPanel painelPrincipal;
    private JPanel Placar;
    private JLabel jogadorVez;
    private JPanel botao8;
    private JPanel botao9;
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
    private int jogador = 1;
    JogoDaVelha jogo;
    int tipoPartida = 0;
    Computador computador;

    public Principal() {
        jogo = new JogoDaVelha();
        computador = new Computador();

        botao00.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Cliquei no botao 00");
                if(jogo.jogar(0,   0,jogador)==true) {
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
                if(jogo.jogar(0,   1,jogador)==true) {
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
                if( jogo.jogar(0,   2,jogador)==true) {
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
                if(jogo.jogar(1,   0,jogador)==true) {
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
                if( jogo.jogar(1,   1,jogador)==true) {
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
                if(jogo.jogar(1,   2,jogador)==true) {
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
                if(jogo.jogar(2,   0,jogador)==true) {
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

                if(jogo.jogar(2,   1,jogador)==true) {
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
                if(jogo.jogar(2,   2,jogador)==true) {
                    atualizarTabuleiro();
                } else{
                    //TODO criar uma janela de aviso
                }
            }
        });

        reiniciarPartidaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogo.reinicia();
                tipoPartida = 0;
                teste =false;
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
    boolean teste = true;
    public void atualizaJogador(){
        teste = !teste;
        if(teste == true) {
            jogadorVez.setText("Jogador1");

            jogador = 1;
        } else {
            jogadorVez.setText("Jogador2");
            jogador = 0;
            if(tipoPartida == 1) {
                Coordenadas posicaoJogadaComputador = computador.Jogar(jogo.getMatriz());
                int x = posicaoJogadaComputador.x;
                int y = posicaoJogadaComputador.y;
                jogo.jogar(x, y, 2);
                atualizarTabuleiro();
            }


        }

    }


    public void atualizarPlacarJogador1(){
        String pontuacao1 =  pontuacaoJogador1.getText();
        int p1 = Integer.parseInt(pontuacao1);
        p1++;
        pontuacaoJogador1.setText(String.valueOf(p1));
    }

    public void atualizarPlacarJogador2(){
        String pontuacao2 =  pontuacaoJogador2.getText();
        int p2 = Integer.parseInt(pontuacao2);
        p2++;
        pontuacaoJogador2.setText(String.valueOf(p2));

    }

    public void verificaGanhador(){
        if(jogo.limiteJogadas()){
            System.out.println("deu velha");
            //TODO janela pra avisar que deu velha
            return;
        }

        if(jogo.ganhou()){
            System.out.println("ganhou" + jogador);
            //TODO janela pra avisar que ganhou
            if(jogo.getNumeroJogador()==1){
                atualizarPlacarJogador1();
            } else{
                atualizarPlacarJogador2();
            }
            return;
        }
        atualizaJogador();

    }


    public void atualizarTabuleiro(){

        botao00.setText(String.valueOf(jogo.matrizPosicao(0,0)));
        botao01.setText(String.valueOf(jogo.matrizPosicao(0,1)));
        botao02.setText(String.valueOf(jogo.matrizPosicao(0,2)));
        botao10.setText(String.valueOf(jogo.matrizPosicao(1,0)));
        botao11.setText(String.valueOf(jogo.matrizPosicao(1,1)));
        botao12.setText(String.valueOf(jogo.matrizPosicao(1,2)));
        botao20.setText(String.valueOf(jogo.matrizPosicao(2,0)));
        botao21.setText(String.valueOf(jogo.matrizPosicao(2,1)));
        botao22.setText(String.valueOf(jogo.matrizPosicao(2,2)));
        verificaGanhador();
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
    }
