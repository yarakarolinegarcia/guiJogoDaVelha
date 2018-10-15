package POO;

import javax.swing.*;
import java.awt.event.*;

public class Principal {

    private JPanel painelPrincipal;
    private JPanel Placar;
    private JPanel botao8;
    private JPanel botao9;
    private JButton novoJogoButton;
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
    private boolean jogador = false;

    public Principal() {
        botao00.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Cliquei no botao 00");
                atualizaJogador();
                atualizarPlacarJogador1();
                atualizarTabuleioro();
            }
        });

        botao01.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Cliquei no botao 01");
                atualizaJogador();
                atualizarPlacarJogador2();
            }
        });

        botao02.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Cliquei no botao 02");
                atualizaJogador();
            }
        });

        botao10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Cliquei no botao 10");
                atualizaJogador();
            }
        });

        botao11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Cliquei no botao 11");
                atualizaJogador();
            }
        });

        botao12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Cliquei no botao 12");
                atualizaJogador();
            }
        });

        botao20.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Cliquei no botao 20");
                atualizaJogador();
            }
        });

        botao21.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Cliquei no botao 21");
                atualizaJogador();
            }
        });

        botao22.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Cliquei no botao 22");
                atualizaJogador();
            }
        });
    }

    public void atualizaJogador(){
        if(jogador) {
            jogadorVez.setText("Jogador1");
        } else {
            jogadorVez.setText("Jogador2");
        }
        jogador =!jogador;
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

    public void atualizarTabuleioro(){
        botao00.setText("X");
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
