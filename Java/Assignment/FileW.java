import java.io.FileReader;
import java.io.FileWriter;

public class FileW {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("../../Python/testFile.txt");
            FileWriter  fileWriter = new FileWriter("./testFile2.txt");
            int no;
            while (( no = fileReader.read()) != -1){
                fileWriter.write(no);
            }
            fileReader.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
