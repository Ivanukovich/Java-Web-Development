package by.task_0_numbers;

public class CustomNuberOperations {
    public CustomNuberOperations(){}
    public CustomNumber sum(CustomNumber a, CustomNumber b){
        return new CustomNumber(a.getValue() + b.getValue());
    }

    public CustomNumber difference(CustomNumber a, CustomNumber b){
        return new CustomNumber(a.getValue() - b.getValue());
    }

    public CustomNumber multiply(CustomNumber a, CustomNumber b){
        return new CustomNumber(a.getValue() * b.getValue());
    }

    public CustomNumber divide(CustomNumber a, CustomNumber b){
        if (b.getValue() == 0){
            return null;
        }
        return new CustomNumber(a.getValue() / b.getValue());
    }
}
