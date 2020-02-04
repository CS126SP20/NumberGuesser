package edu.illinois;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Source: http://www.java2s.com/Code/Java/Development-Class/Generatesarandomintegerinsidetheloandhiinterval.htm
 */
public class Utils {
    /**
     * Generates a random integer inside the lo and hi interval.
     * @param lo
     * @param hi
     * @return the generated int.
     */
    public static int randomInteger(int lo, int hi) {
        java.util.Random rn = new java.util.Random();
        int n = hi - lo + 1;
        int i = rn.nextInt() % n;
        if (i < 0) i = -i;
        return lo + i;
    }

    /**
     * Creates an InputStream from the inputted string.
     * @param input
     * @return the newly created InputStream.
     */
    public static ByteArrayInputStream fromString(String input) {
        return new ByteArrayInputStream(input.getBytes());
    }
}
