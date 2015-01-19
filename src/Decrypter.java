/**
 * NOTE!!!!
 * This is part of Jhonti Todd-Simpson's EPQ project on cryptography!
 * This is not plagiarised!
 */

import java.math.BigInteger;

public class Decrypter {
    BigInteger cipher_text;
    BigInteger d;
    BigInteger n;

    Decrypter(long d, long n, long cipher_text){
        this.cipher_text = new BigInteger(Long.toString(cipher_text));
        this.d = new BigInteger(Long.toString(d));
        this.n = new BigInteger(Long.toString(n));

        BigInteger plain_text = this.cipher_text.modPow(this.d, this.n);
        System.out.println("PLAIN_TEXT: " + plain_text);
    }

}
