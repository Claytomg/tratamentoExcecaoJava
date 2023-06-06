import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraArquivoTxt {
    public static void main(String[] args){
        try{
            File arquivo = new File("src/Test/Poema.txt");
            Scanner scanner = new Scanner(arquivo);
            while (scanner.hasNextLine()){
                String linha = scanner.nextLine();
                System.out.format("%s%n", linha);
            }
        } catch (FileNotFoundException ex){
            System.out.format("Erro abertura do arquivo: %s.%n",ex.getMessage());
        }
    }

}
