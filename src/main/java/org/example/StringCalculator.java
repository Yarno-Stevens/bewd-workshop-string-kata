package org.example;

public class StringCalculator {
//    public int add(String numbers){
//        if(numbers.isEmpty()){
//            return 0;
//        } else {
//            var results = numbers.split("[,\n]");
//            int sum = 0;
//            for (String number : results){
//                sum += Integer.parseInt(number);
//            }
//            return sum;
//        }
//    }

    public int add(String numbers){
        if(numbers.isEmpty()){
            return 0;
        }
        String delimiter = "[,\n]";
        String nums = numbers;
        if(numbers.startsWith("//")){
            int delimiterIndex = numbers.indexOf('\n');
            delimiter = Character.toString(numbers.charAt(2));
            nums = numbers.substring(delimiterIndex + 1);
        }
        String[] results = nums.split(delimiter);
        int sum = 0;
        for (String number : results){
            if (Integer.parseInt(number) <= 1000){
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }

}
