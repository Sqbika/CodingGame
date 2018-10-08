import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/


class Player {

    static int W; // width of the building.
    static int H; // height of thae building.
    static int N; // maximum number of turns before game over.
    static int X0;
    static int Y0;
    static int curPosX;
    static int curPosY;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        W = in.nextInt();
        H = in.nextInt();
        N = in.nextInt();
        X0 = in.nextInt();
        Y0 = in.nextInt();
        curPosX = X0;
        curPosY = Y0;

        int minX = 0, maxX = W, minY = 0, maxY = H;

        int i = 0;
        boolean first = true;

        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            System.err.println(bombDir);
            if (!first) {
                switch(bombDir) {
                    case "UR":
                        minX = ++curPosX;
                        maxY = --curPosY;
                        break;
                    case "UL":
                        maxX = --curPosX;
                        maxY = --curPosY;
                        break;
                    case "DR":
                        minX = ++curPosX;
                        minY = ++curPosY;
                        break;
                    case "DL":
                        maxX = --curPosX;
                        minY = ++curPosY;
                        break;
                    case "U":
                        maxY = --curPosY;
                        minY = curPosY;
                        break;
                    case "D":
                        maxY = ++curPosY;
                        minY = curPosY;
                        break;
                    case "R":
                        maxX = ++curPosX;
                        minX = curPosX;
                        break;
                    case "L":
                        maxX = --curPosX;
                        minX = curPosX;
                        break;
                    default:
                        System.err.println("Default triggered.");
                        break;
                }
            }
            curPosX = Math.round(minX + ((maxX-minX)/2));
            curPosY = Math.round(minY + ((maxY-minY)/2));
            if (first) first=false;
            System.err.println(minX + "/" + minY + "/" + maxX + "/" + maxY);
            System.out.println(curPosX + " " + curPosY);
        i++;}
    }
}