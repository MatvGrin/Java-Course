package com.info.base.classes.practice.decrementingCarousel;

public class Main {
    public static void main(String[] args) {
//        DecrementingCarousel carousel = new DecrementingCarousel(2);
//
//        System.out.println(carousel.addElement(0));
//        System.out.println(carousel.addElement(5));
//        System.out.println(carousel.addElement(7));
//        System.out.println(carousel.addElement(2));
//        System.out.println(carousel.run());
//        System.out.println(carousel.run());
//        System.out.println(carousel.run());
//        System.out.println();
        int[] arr = new int[]{1, 2, 3, 1};
        CarouselRun carouselRun = new CarouselRun(arr);

        System.out.println(carouselRun.next());
        System.out.println(carouselRun.next());
        System.out.println(carouselRun.next());
        System.out.println(carouselRun.next());
        System.out.println(carouselRun.next());
        System.out.println(carouselRun.next());
        System.out.println(carouselRun.next());
        System.out.println(carouselRun.next());


    }

}
