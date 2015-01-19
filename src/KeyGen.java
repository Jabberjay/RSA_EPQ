/**
 * NOTE!!!!
 * This is part of Jhonti Todd-Simpson's EPQ project on cryptography!
 * This is not plagiarised!
 */

import java.math.BigInteger;
import java.util.Random;

public class KeyGen {
    long i;
    BigInteger d, e, phi, n;

    KeyGen(long p, long q){

        n = new BigInteger(Long.toString(p * q));

        phi = new BigInteger(Long.toString((p - 1) * (q - 1)));

        Random random = new Random();

        do
        {
            i = (long)(random.nextDouble() * phi.longValue());
        }
        while(i < 2 || i > phi.longValue() || phi.gcd(new BigInteger(Long.toString(i))).intValue() != 1);

        e = new BigInteger(Long.toString(i));

        d = e.modInverse(phi);

        System.out.println("PUBLIC KEY: n = " + n + ", e = " + e);
        System.out.println("PRIVATE KEY: n = " + n + ", d = " + d);
    }
}