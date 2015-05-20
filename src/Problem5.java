import rx.Observable;

/**
 * Created by HP LAPTOP on 20-05-2015.
 */
public class Problem5 {


    //    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
    public static void main(String[] args) {
        Observable.range(2, Integer.MAX_VALUE -2)
                .takeWhile((i) ->!isEvenlyDivisible(i,20))
                .map((i)-> i +1)
                .last()
                .subscribe(System.out::println);
    }

    private static boolean isEvenlyDivisible(int x, int y) {
        for (int i = 1; i < y; i++) {
            if (x % i != 0) return false;
        }
        return true;
    }
}
