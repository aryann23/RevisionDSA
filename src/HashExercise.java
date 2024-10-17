import java.util.HashMap;
import java.util.Map;

public class HashExercise {

    public static void main(String[] args){
        int arr[] = new int[]{3, 2, 3, 3, 2, 4, 8};

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        int maxValue = 0;
        int minValue = Integer.MAX_VALUE;

        for(int value: map.values()){
            minValue = Math.min(minValue, value);
            maxValue = Math.max(maxValue, value);
        }

        System.out.println("Max Value " + maxValue);
        System.out.println("Min Value " + minValue);

        int maxKey = 0;
        int minKey = Integer.MAX_VALUE;

        for(int key: map.keySet()){
            minKey = Math.min(minKey, key);
            maxKey = Math.max(maxKey, key);
        }

        System.out.println("Max Key " + maxKey);
        System.out.println("Min Key " + minKey);

        int minFreq = 0;
        int maxFreq = Integer.MAX_VALUE;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == minValue)
                minFreq = entry.getKey();
            if(entry.getValue() == maxValue)
                maxFreq = entry.getKey();
        }
        System.out.println("Max Frequency " + maxFreq);
        System.out.println("Min Frequency " + minFreq);
    }
}
