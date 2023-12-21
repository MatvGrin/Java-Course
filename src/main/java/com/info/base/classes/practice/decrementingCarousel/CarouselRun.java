package com.info.base.classes.practice.decrementingCarousel;

public class CarouselRun {
    private int[] array;
    private int index = 0;

    public CarouselRun(int[] array) {
        this.array = array;
    }


    public int next() {
        if (isFinished()){
            return -1;
        }
        if (index == array.length){
            index = 0;
        }
        while (array[index] == 0){
            index++;
            if (index == array.length) {
                index = 0;
            }
        }
        int temp = array[index];
        array[index++]--;
        return temp;
    }

    public boolean isFinished() {
        for (int i : array) {
            if (i > 0) return false;
        }
        return true;
    }

}
