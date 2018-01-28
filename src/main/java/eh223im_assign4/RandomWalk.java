package eh223im_assign4;

import java.util.Random;

public class RandomWalk {
    private int X;
    private int Y;
    private int maxStep;
    private int currentStepNo;
    private int planeSize;

    public RandomWalk(int maxStep, int planeSize) {
        this.maxStep = maxStep;
        this.planeSize = planeSize;
        X = 0;
        Y = 0;
        currentStepNo = 0;
    }

    public RandomWalk() {
        X = 0;
        Y = 0;
        planeSize = 0;
        maxStep = 0;
        currentStepNo = 0;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        this.X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        this.Y = y;
    }

    public int getMaxStep() {
        return maxStep;
    }

    public void setMaxStep(int maxStep) {
        this.maxStep = maxStep;
    }

    public int getCurrentStepNo() {
        return currentStepNo;
    }

    public void setCurrentStepNo(int currentStepNo) {
        this.currentStepNo = currentStepNo;
    }

    public int getPlaneSize() {
        return planeSize;
    }

    public void setPlaneSize(int planeSize) {
        this.planeSize = planeSize;
    }

    public String toString() {
        return ("Current position: (" + X + " ," + Y + "). Number of step(s) taken: " + currentStepNo);
    }

    void walk() {
        while (moreStep() && inBound()) {
            takeStep();
        }
    }

    void takeStep() {
        Random r = new Random();
        if (moreStep() && inBound()) {
            switch (r.nextInt(3) + 1) { // 1 ~ 4: up, down, left, right
                case 1:
                    Y++;
                    currentStepNo++;
                    break;
                case 2:
                    Y--;
                    currentStepNo++;
                    break;
                case 3:
                    X--;
                    currentStepNo++;
                    break;
                case 4:
                    X++;
                    currentStepNo++;
                    break;
                default: // In case of problem arise
                    break;
            }
        }
    }

    boolean moreStep() {
        return (currentStepNo < maxStep && inBound());
    }

    boolean inBound() {
        return ((X >= 0) && (X <= planeSize) && (Y >= 0) && (Y <= planeSize));
    }
}