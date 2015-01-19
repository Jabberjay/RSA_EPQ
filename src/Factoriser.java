/**
 * NOTE!!!!
 * This is part of Jhonti Todd-Simpson's EPQ project on cryptography!
 * This is not plagiarised!
 */

public class Factoriser {

    Factoriser(String to_parse){
        long to_factor = Long.parseLong(to_parse);

        long start_time = System.nanoTime();
        while (to_factor % 2 == 0)
        {
            to_factor = to_factor/2;
        }

        for (int i = 3; i <= Math.sqrt(to_factor); i += 2)
        {
            while (to_factor % i == 0)
            {
                System.out.println(i);
                to_factor = to_factor / i;
            }
        }

        if (to_factor > 2)
        {
            System.out.println(to_factor);
        }

        long end_time = System.nanoTime();
        double time_taken = (end_time - start_time) / 1000000000.0;

        System.out.printf("That took %f seconds\n", time_taken);
    }
}
