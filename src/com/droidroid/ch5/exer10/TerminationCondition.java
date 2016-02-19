package com.droidroid.ch5.exer10;

/**
 * Created by robotpoi on 2016/2/20.
 */

class Book {
    boolean isOpen = false;

    Book(boolean isOpen) {
        this.isOpen = isOpen;
    }

    void close() {
        isOpen = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if (isOpen) {
            System.out.println("Error: book is still open");
        }
        super.finalize();
    }
}

public class TerminationCondition {
    public static void main(String[] args) {
        Book book = new Book(true);
        book.close();
        new Book(true);
        book.close();
    }
}
