import java.io.*;
import java.util.ArrayList;

public class ObjectInputStreamA {
    public ObjectInputStreamA(String plik) {
        try (
                BufferedReader br = new BufferedReader(new FileReader("src/"+plik));
        ) {
            int i = Integer.parseInt(br.readLine());
            Pracownik[] prac = new Pracownik[i];
            System.out.printf("%-10s, %-10s, %-12s, %-10s, %-3s, %-7s\n", "nazwisko", "imie", "pesel", "stanowisko", "staz", "pensja");
            for (int j = 0; j < i; j++) {
                String temp = br.readLine();
                System.out.println(temp);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("brak pliku");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }
    }
}

