package org.example;

public class Solution {
    public String solution(String s) {
        int max=-Integer.MAX_VALUE, min=Integer.MAX_VALUE;
        for(String i : s.split(" ")) {
            int j = Integer.parseInt(i);

            if(j > max) max = j;
            if(j < min) min = j;
        }
        return String.format("%s %s", min, max);
    }
}