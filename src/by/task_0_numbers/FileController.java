package by.task_0_numbers;

import java.io.*;
import java.util.Scanner;

public class FileController {
    private File file;

    public FileController(File file){
        this.file = file;
    }

    public String readFile(){
        StringBuilder text = new StringBuilder();
        try {
            Scanner reader = new Scanner(new FileReader(file));
            while (reader.hasNextLine()) {
                text.append(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return text.toString();
    }

    File getFile(){
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}

