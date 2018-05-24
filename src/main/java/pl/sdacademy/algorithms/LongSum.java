package pl.sdacademy.algorithms;

import java.math.BigInteger;

public class LongSum {

    public String sum(Long[] longs) {
        BigInteger result = new BigInteger("0");
        for (int i = 0; i < longs.length; i++) {
            result = result.add(BigInteger.valueOf(longs[i]));
        }

        return result.toString();
    }
}
