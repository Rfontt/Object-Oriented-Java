package br.com.bytebank.stream;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("tec.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = bufferedReader.readLine();

        while(line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
    }
}
