package day3.collection.SetPrac;

import java.util.HashSet;

public class Duplicated {
    public static void main(String[] args) {

        RandomNumberGenerator rdng = new RandomNumberGenerator();
         HashSet<Integer> numbers = new HashSet<>();
        for(int i=0; i<50; i++) {
            int r = rdng.generate(10);
            numbers.add(r);
//            System.out.println(r);

        }
        System.out.println(numbers);
    }
}
