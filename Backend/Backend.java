package Backend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Models.Especies.Especie;

public class Backend {

    public static List<String> lerLinhasDeArquivo(String nomeArquivo) {
        List<String> linhas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                linhas.add(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return linhas;
    }

    public static List<Especie> getListaEspecies(String nomeDoArquivo){

        List<Especie> especies = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nomeDoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] palavrasDoArquivo = linha.split(";");
                Especie especie = new Especie(palavrasDoArquivo[0], palavrasDoArquivo[1], palavrasDoArquivo[2]);
                especies.add(especie);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return especies;
    }
}