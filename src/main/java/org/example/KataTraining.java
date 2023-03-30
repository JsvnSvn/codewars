package org.example;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class KataTraining {

    public String InsertDash(int num) {
        String s = String.valueOf(num);
        return IntStream.range(0, s.length()-1)
                .mapToObj(i -> s.charAt(i) + (s.charAt(i) % 2 != 0 && s.charAt(i+1) % 2 != 0 ? "-" : ""))
                .collect(Collectors.joining("")) + s.charAt(s.length()-1);

        }
}
