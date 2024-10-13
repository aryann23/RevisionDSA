import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main
{
    public static void main (String[] args)
    {
        Main obj = new Main();
        //obj.square('0');
        //obj.lhs_triangle('*');
        //obj.numberPattern(5);
        //obj.charPattern(5);

        List<Integer> listLeft = new ArrayList<>();
        List<Integer> listRight = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        int sumLeft = 0;
        listLeft.add(0);
        for(int i = 1; i < arr.size(); i++){
            sumLeft = sumLeft + arr.get(i-1);
            listLeft.add(sumLeft);
        }
        System.out.println(listLeft);
        int sumRight = 0;
        listRight.add(0);
        for(int i = arr.size() - 2; i >= 0; i--){
            sumRight = sumRight + arr.get(i + 1);
            listRight.add(sumRight);
        }

        Collections.reverse(listRight);
        System.out.println(listRight);

        for(int i = 0; i < arr.size(); i++) {
            if (listLeft.get(i) == listRight.get(i))
                System.out.println("YES");
            else
                System.out.println("NO");
        }


    }
    public void square(char a){
        for(int i = 1; i <= 4; i++ ){
            for(int j = 1; j <=6; j++){
                System.out.print(a);
            }
            System.out.println();
        }
    }

    public void lhs_triangle(char a){
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(a);
            }
            System.out.println();
        }
    }

    public void numberPattern(int n){
        int k = 1;
        for(int i = 1; i <= n; i++){
            k = i;
            for(int j = 1; j <= i; j++){
                System.out.print(k);
                k = k + 1;
            }
            System.out.println();
        }
    }
    public void charPattern(int n){
        char c = 'A';
        char k = 'A';
        for(int i = 1; i <= n; i++){
            k = c;
            for(int j = 1; j <= i; j++){
                System.out.print(k);
                k++;
            }
            c++;
            System.out.println();
        }
    }
}