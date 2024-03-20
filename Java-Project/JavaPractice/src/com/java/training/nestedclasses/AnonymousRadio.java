package com.java.training.nestedclasses;

abstract class Radio {
	abstract void playMusic( );
}

public class AnonymousRadio {
    public static void main(String args[ ]) {
        Radio r = new Radio( ) {
            void playMusic( ) {
                System.out.println("Plays music!");
            }
        };
        r.playMusic( );
    }
}
