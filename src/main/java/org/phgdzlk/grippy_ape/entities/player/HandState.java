package org.phgdzlk.grippy_ape.entities.player;

public class HandState {
    private boolean rightArmClenched = false;
    private boolean leftArmClenched = true;

    public void switchHands() {
        rightArmClenched = !rightArmClenched;
        leftArmClenched = !leftArmClenched;
    }

    public boolean isClenched(boolean right) {
        return right ? rightArmClenched : leftArmClenched;
    }
}
