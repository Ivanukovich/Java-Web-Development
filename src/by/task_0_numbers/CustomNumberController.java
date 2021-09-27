package by.task_0_numbers;

import java.util.List;

public class CustomNumberController {
    private List<CustomNumber> numbers;
    private CustomNuberOperations operations;
    public CustomNumberController(List<CustomNumber> numbers){
        this.numbers = numbers;
        operations = new CustomNuberOperations();
    }

    void viewNumbers(){
        for (CustomNumber oneNumber : numbers){
            System.out.println(oneNumber.getValue());
        }
    }

    void viewSize(){
        System.out.println("Amount of numbers: " + numbers.size());
    }

    void viewSum(int index1, int index2){
        if (numbers.size() > index1 && numbers.size() > index2){
            CustomNumber sum = operations.sum(numbers.get(index1), numbers.get(index2));
            System.out.println(numbers.get(index1).getValue() + " + " + numbers.get(index2).getValue() + " = " + sum);
        }
    }

    void viewDif(int index1, int index2){
        if (numbers.size() > index1 && numbers.size() > index2){
            CustomNumber dif = operations.difference(numbers.get(index1), numbers.get(index2));
            System.out.println(numbers.get(index1).getValue() + " + " + numbers.get(index2).getValue() + " = " + dif);
        }
    }

    void viewMult(int index1, int index2){
        if (numbers.size() > index1 && numbers.size() > index2){
            CustomNumber mult = operations.multiply(numbers.get(index1), numbers.get(index2));
            System.out.println(numbers.get(index1).getValue() + " + " + numbers.get(index2).getValue() + " = " + mult);
        }
    }

    void viewDiv(int index1, int index2){
        if (numbers.size() > index1 && numbers.size() > index2){
            CustomNumber div = operations.divide(numbers.get(index1), numbers.get(index2));
            System.out.println(numbers.get(index1).getValue() + " + " + numbers.get(index2).getValue() + " = " + div);
        }
    }
}
