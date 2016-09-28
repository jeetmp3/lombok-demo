package demo.lombok;

import lombok.Cleanup;

import java.io.*;

/**
 * @author Jitendra Singh.
 */
public class NonNullDemo {

    public static void main(String []args) throws IOException {
        @Cleanup("close1") SomeStream someStream = new SomeStream();
        someStream.greet();
    }
}
