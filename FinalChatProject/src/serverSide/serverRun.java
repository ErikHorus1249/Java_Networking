/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverSide;

import java.io.IOException;

/**
 *
 * @author erik
 */
public class serverRun {

    public static void main(String[] args) throws IOException {// thong bao khoi tao server
        new serverControl(1249).run(); // chay ham run
    }
}
