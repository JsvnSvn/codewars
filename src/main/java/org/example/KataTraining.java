package org.example;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class KataTraining {

    public String InsertDash(int num) {
        /*Write a function that will insert dashes ('-') between each two odd digits in num.
        For example: if num is 454793 the output should be 4547-9-3. Don't count zero as an odd digit.
        Note that the number will always be non-negative (>= 0).*/

        String s = String.valueOf(num);
        return IntStream.range(0, s.length()-1)
                .mapToObj(i -> s.charAt(i) + (s.charAt(i) % 2 != 0 && s.charAt(i+1) % 2 != 0 ? "-" : ""))
                .collect(Collectors.joining("")) + s.charAt(s.length()-1);
        }
}
