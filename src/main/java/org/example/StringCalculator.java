package org.example;

public class StringCalculator {
    public int add(String numbers){
        if(numbers.isEmpty()){
            return 0;
        } else {
            var results = numbers.split("[,\n]");
            int sum = 0;
            for (String number : results){
                sum += Integer.parseInt(number);
            }
            return sum;
        }
    }
}
