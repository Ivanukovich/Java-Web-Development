package by.task_0_numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomNumberFactory {
    private String text;

    public CustomNumberFactory(String text){
        this.text = text;
    }

    List<CustomNumber> createCustomNumber(){
        List<CustomNumber> numbers = new ArrayList<>();
        String regex = "\\d+\\.\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        String doubleString;
        while (matcher.find()) {
            doubleString = matcher.group();
            double value = Double.valueOf(doubleString);
            numbers.add(new CustomNumber(value));
        }
        return numbers;
    }

    public  String getText(){
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
