package p1;

/**
 * Created by Misha on 03.06.2017.
 */

import java.io.*;
import java.util.*;

public class Task {

    void solve(Scanner in, PrintWriter out) {
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int nBulls = 0;
        int nCows = 0;
        for (int p1 = 1; p1 <= 1000; p1*=10) {
            for (int p2 = 1; p2 < 1000; p2*=10) {
                if (n1 / p1 % 10 == n2 / p2 % 10) {
                    if (p1 == p2) {
                        nBulls++;
                    } else {
                        nCows++;
                    }
                }
            }
        }
        out.println(nBulls + " " + nCows);
    }

    void run() {
        try {
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out);

            solve(in, out);
        } finally {

          }
    }

    public static void main(String args[]) {
        new Task().run();
        int a = 0;


            }
}

