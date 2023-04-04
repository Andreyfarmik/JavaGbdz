import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\User\\untitled\\Filegb.txt");
        if (file.createNewFile()){
            System.out.println("Фаил создан");
        }
        else{
            System.out.println("Фаил уже создан!!!");
        }
        int count = 100;
        FileWriter writer = new FileWriter (file);
        for(int i = 0; i < count; i++) {
            writer.write("TEXT");
        }
        writer.close();
    }
}
