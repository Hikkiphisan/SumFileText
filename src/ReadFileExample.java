import java.io.*;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if(!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(filePath));
                String line = " ";
                int sum = 0;
                while ((line = br.readLine()) != null ) {
                    System.out.println(line);
                    sum += Integer.parseInt(line);
                }
                br.close();
            System.out.println("Tong = " + sum);


        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Flle co loi");
        }

    }
}
