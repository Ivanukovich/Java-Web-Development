package by.task_0_numbers;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String path = "input.txt";
        File file = new File(path);
        FileController fileController = new FileController(file);
        CustomNumberFactory factory = new CustomNumberFactory(fileController.readFile());
        CustomNumberController numberController = new CustomNumberController(factory.createCustomNumber());
        numberController.viewSize();
        numberController.viewNumbers();
        numberController.viewSum(0, 1);
        numberController.viewDif(0, 1);
        numberController.viewMult(0, 1);
        numberController.viewDiv(0, 1);
    }
}
