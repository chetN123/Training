import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class PrimeNumberCheck {



    public static void main(String[] args) {
        List<Integer> numToCheck = Arrays.asList(1,2,3,4,5,6,7,8,9,10);


        List<Integer> primeNo = numToCheck.stream().filter(x -> {
            for (int i = 2; i * i <= x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;



        }).collect(Collectors.toList());
        System.out.println(primeNo);
    }
}