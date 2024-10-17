//Problem Statement: https://www.hackerrank.com/challenges/sherlock-and-array/problem

import java.util.ArrayList;
import java.util.List;

public class SherlockAndArray {
    public static String balancedSums(List<Integer> arr) {
        // Write your code here
        List<Integer> listLeft = new ArrayList<>();
        List<Integer> listRight = new ArrayList<>();

        int totalSum = 0;
        for(int i = 0; i < arr.size(); i++){
            totalSum = totalSum + arr.get(i);
        }

        boolean flag = false;
        int currSum = 0;
        for(int i = 0; i < arr.size(); i++){
            currSum = currSum + arr.get(i);
            if(currSum == totalSum){
                flag = true;
                break;
            }
            totalSum = totalSum-arr.get(i);
        }

        if(flag)
            return "YES";

        else
            return "NO";

    }
}
