import java.io.*;
import java.util.ArrayList;

public class ObjectOutputStreamA {
    public ObjectOutputStreamA(String plik, Pracownik[] tab){
        try(
                BufferedWriter bw = new BufferedWriter(new FileWriter("src/"+plik));
        ){
            int i=0;
            for (Pracownik p :
                    tab) {
                if (p!=null)i++;
            }
            bw.write(i+"\n");
            for (Pracownik p : tab){
                if (p==null)break;
                bw.write(p+"\n");
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("brak pliku");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error");
        }
    }
}
