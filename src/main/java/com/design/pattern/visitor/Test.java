package com.design.pattern.visitor;

/**
 * @Author: 98050
 * @Time: 2019-01-21 22:12
 * @Feature:
 */
public class Test {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartVisitorImpl());

        ComputerPart keyboard = new Keyboard();
        keyboard.accept(new ComputerPartVisitorImpl());

        ComputerPart mouse = new Mouse();
        mouse.accept(new ComputerPartVisitorImpl());

        ComputerPart monitor = new Monitor();
        monitor.accept(new ComputerPartVisitorImpl());
    }
}
