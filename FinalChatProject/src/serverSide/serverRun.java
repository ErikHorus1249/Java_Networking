
package serverSide;

import java.io.IOException;

public class serverRun {

    public static void main(String[] args) throws IOException {// thong bao khoi tao server
        new serverControl(1249).run(); // chay ham run
    }
}
