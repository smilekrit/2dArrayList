package space.leafpy;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<ArrayList<Integer>> vectorArrayMap = new ArrayList<>(8);

        ArrayList<Integer> vectorMap1 = new ArrayList<Integer>( Arrays.asList(-1,-1));
        vectorArrayMap.add(vectorMap1);
        ArrayList<Integer> vectorMap2 = new ArrayList<>( Arrays.asList(-1, 0));
        vectorArrayMap.add(vectorMap2);
        ArrayList<Integer> vectorMap3 = new ArrayList<>( Arrays.asList(-1, 1));
        vectorArrayMap.add(vectorMap3);
        ArrayList<Integer> vectorMap4 = new ArrayList<>( Arrays.asList(0, -1));
        vectorArrayMap.add(vectorMap4);
        ArrayList<Integer> vectorMap5 = new ArrayList<>( Arrays.asList(0, 1));
        vectorArrayMap.add(vectorMap5);
        ArrayList<Integer> vectorMap6 = new ArrayList<>( Arrays.asList(1, -1));
        vectorArrayMap.add(vectorMap6);
        ArrayList<Integer> vectorMap7 = new ArrayList<>( Arrays.asList(1, 0));
        vectorArrayMap.add(vectorMap7);
        ArrayList<Integer> vectorMap8 = new ArrayList<>( Arrays.asList(1, 1));
        vectorArrayMap.add(vectorMap8);



        for(ArrayList<Integer> vector : vectorArrayMap) {
            System.out.println(vector);
            for(Integer num : vector){
                System.out.println(num);
            }
        }
    }
}

/*
        [-1, -1]
        -1
        -1
        [-1, 0]
        -1
        0
        [-1, 1]
        -1
        1
        [0, -1]
        0
        -1
        [0, 1]
        0
        1
        [1, -1]
        1
        -1
        [1, 0]
        1
        0
        [1, 1]
        1
        1

        Process finished with exit code 0
        */