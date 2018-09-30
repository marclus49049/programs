import java.io.*;

class FileDatabse extends Emp{
    public static void main(String[] args) {
        try {
            BufferedReader fileOpened = new BufferedReader(new FileReader("./data.txt"));
            String line;
            int cnt = 0;
            Emp[] empObjs = new Emp[6];
            while (( line = fileOpened.readLine()) != null){
                String[] words=line.split(" ");
                empObjs[cnt] = new Emp(Integer.parseInt(words[0]), Integer.parseInt(words[2]), words[1]);
                cnt++;
            }
            fileOpened.close();
            for (int i=0; i<empObjs.length; i++){
              empObjs[i].printDetails();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
