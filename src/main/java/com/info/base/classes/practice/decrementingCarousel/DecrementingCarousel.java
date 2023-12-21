package com.info.base.classes.practice.decrementingCarousel;

public class DecrementingCarousel {
    private int[] carusel;
    private final int capacity;
    private int index = 0;
    private boolean flag = true;

    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        carusel = new int[capacity];
    }

    public boolean addElement(int element){
        if (element <= 0 || index >= capacity || !flag){
            return false;
        }
        carusel[index++] = element;
        return true;
    }

    public CarouselRun run(){
        if (flag){
            flag = false;
            return new CarouselRun(carusel);
        }
        return null;
    }

}
