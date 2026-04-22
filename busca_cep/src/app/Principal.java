package app;

import client.ConsultaCep;
import model.Endereco;
import util.GeradorDeArquivo;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();
        Endereco novoEndereco = null;
        String cep = "";
        while(!cep.equalsIgnoreCase("sair")){
            System.out.println("digite o CEP para consulta: ");
            cep = leitura.nextLine();
            if(cep.equalsIgnoreCase("sair")){
                System.out.println("Encerrando...");
                break;
            }
            try{

                novoEndereco = consultaCep.buscaEndereco(cep);
                System.out.println(novoEndereco);
                GeradorDeArquivo geradorArquivo = new GeradorDeArquivo();
                geradorArquivo.geraArquivoJson(novoEndereco);
            }catch(RuntimeException | IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
