import java.io.*;

public class JUtil{
    public static String readString() throws IOException {
        DataInputStream A = new DataInputStream(System.in);
        return A.readLine();
    }

    public static short readShort() throws IOException {
        return Short.valueOf(readString()).shortValue();
    }

    public static int readInt() throws IOException {
        return Integer.valueOf(readString()).intValue();
    }

    public static float readFloat() throws IOException {
        return Float.valueOf(readString()).floatValue();
    }

    public static double readDouble() throws IOException {
        return Double.valueOf(readString()).doubleValue();
    }

    public static void pause() throws Exception {
        String a = readString();
    }
}
