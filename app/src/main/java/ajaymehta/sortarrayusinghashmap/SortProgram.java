package ajaymehta.sortarrayusinghashmap;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Avi Hacker on 7/9/2017.
 */

// // hasmap stores Integer Elements in accending order..but but but ..(0-9) ..it sorts element upto 10...


public class SortProgram {

    HashMap<Integer,Integer> map = new HashMap<>();


    public void sortArray(int arr[]) {

        for(int i: arr){

            map.put(i, 1);  // we just need key..kuch bhi daal do value main..
        }
    }

    public void printArray() {

        Set<Map.Entry<Integer,Integer>> entrySet = map .entrySet();

        for(Map.Entry<Integer,Integer> i : entrySet) {

            System.out.println(i.getKey()); // we dont care about value ..we just have to get key (array element) n print it..
        }
    }


    public static void main(String args[]) {

        SortProgram program = new SortProgram();

        program.sortArray(new int[] {4,7,9,2,4,6,3,6,1,1,5,8,7,1,4,5,6,8,0,5,2,4,8,9});

        program.printArray();

    }
}
