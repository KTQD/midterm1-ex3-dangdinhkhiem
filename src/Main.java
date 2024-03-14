import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Đường dẫn của file input và output
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try {
            // Đọc file input.txt
            FileReader fileReader = new FileReader(inputFilePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Tạo và chuẩn bị file output.txt
            FileWriter fileWriter = new FileWriter(outputFilePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;

            // Đọc từng dòng trong file input.txt
            while ((line = bufferedReader.readLine()) != null) {
                // Thay thế từ "Nha Trang" thành "Vũng Tàu" và ghi vào file output.txt
                line = line.replaceAll("Nha Trang", "Vũng Tàu");
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            // Đóng file input và output
            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("");
        } catch (IOException e) {
            System.out.println("" + e.getMessage());
            e.printStackTrace();
        }
    }
}
