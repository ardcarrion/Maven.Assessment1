package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumpHeight) {
        int heightLeft = flagHeight;
        int jumpsOfJumpHeight = 0;
        if (jumpHeight == flagHeight) return 1;
        while (heightLeft > jumpHeight) {
            jumpsOfJumpHeight++;
            heightLeft -= jumpHeight;
        }
        jumpsOfJumpHeight += heightLeft;
        if (jumpsOfJumpHeight < flagHeight) return jumpsOfJumpHeight;
        return flagHeight;
    }
}
