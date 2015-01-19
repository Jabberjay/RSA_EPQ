import java.math.BigInteger;

public class Encrypter {

    BigInteger e, n, cipher_text, plain_text;

    Encrypter(long n, long e, long plain_text)
    {
        this.e = new BigInteger(Long.toString(e));
        this.n = new BigInteger(Long.toString(n));
        this.plain_text = new BigInteger(Long.toString(plain_text));

        cipher_text = this.plain_text.modPow(this.e, this.n);

        System.out.println("CIPHER_TEXT: " + cipher_text);
    }
}
