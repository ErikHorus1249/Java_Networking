
package clientSide;

import java.io.IOException;

public class clientRun {
    public static void main(String[] args) throws IOException {
        new clientControl().listen();
    }
}
