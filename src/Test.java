import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}};

        int rows = arr.length;
        int column = arr[0].length - 1;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j <= column; j++){
                if(i == 0 || j == 0 ||j == column || i == (rows - 1))
                    System.out.print(arr[i][j] + "  ");
            }

        }

     }
}

//int[] arr = {1, 2, 3, 4, 3, 4, 5, 5, 5, 6, 7};
//HashMap<Integer, Integer> map = new HashMap<>();
//
//        for(int i = 0; i < arr.length; i++){
//        if(!map.containsKey(arr[i])){
//        map.put(arr[i], 1);
//            }
//                    else{
//                    map.put(arr[i], map.get(arr[i]) + 1);
//        }
//        }
//        System.out.println(map);
//        System.out.println(map.size());
//        System.out.println(map.keySet());
//int count = 0;
//        for(Integer key : map.keySet()){
//count++;
//        }
//        System.out.println(count);

//Thread thread = new Thread(new Main());
//        thread.start();
//        System.out.printf("%d", 1);
//        thread.run();
//        System.out.printf("%d", 2);
//        int value = 3, sum = 6 + --value; //8
//        System.out.println(sum);
//        System.out.println(value);
//
//        int data = --value + ++value / sum++ * value++ + ++sum % value--;
//        //1+ 2/8 * 2 + 10 % 3 = 2+0
//        System.out.println(data);
//        System.out.println(sum);
//        System.out.println(value);


// Scanner sc = new Scanner(System.in);
//        System.out.println("Enter String");
//        String s = sc.nextLine();
//        s = s.toLowerCase();
//
//
//        HashMap<Character, Integer> map = new HashMap<>();
//        int count = 1;
//        for(int i = 0; i < s.length(); i++){
//            if(map.containsKey(s.charAt(i))){
//                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
//            }
//            else
//                map.put(s.charAt(i), count);
//
//        }
//        for(HashMap.Entry a: map.entrySet()){
//            System.out.println(a.getKey() + " " + a.getValue());
//        }
//            System.out.println(map);
