package domain;

import utils.PackUtils;

import javax.swing.*;

public class Author {

    public static final int NAME_LIMIT = 20;

    public static final int SIZE = -1; // TODO

    private final long id;
    private final String name;

    private int  numBooks;
    private long firstBookId;
    private long lastBookId;


    public Author(long id, String name) {
        this.id = id;
        this.name = name;
        numBooks = 0;
        firstBookId = -1L;
        lastBookId = -1L;
    }

    public Author(long id, String name, int numBooks, long firstBookId, long lastBookId) {
        this.id = id;
        this.name = name;
        this.numBooks = numBooks;
        this.firstBookId = firstBookId;
        this.lastBookId = lastBookId;
    }

    public void addBookId(long idBook) {
        if(firstBookId == -1L){
            firstBookId = idBook;
            lastBookId = idBook;
            numBooks++;

        }else{
            lastBookId = idBook;
            numBooks++;
       }
    }

    public byte[] toBytes() {
        throw new UnsupportedOperationException("paso 1");
    }

    public static Author fromBytes(byte[] record) {
        throw new UnsupportedOperationException("paso 1");
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getLastBookId() {
        return lastBookId;
    }

    public int getNumBooks() {
        return numBooks;
    }

    public long getFirstBookId() {
        return firstBookId;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numBooks=" + numBooks +
                ", firstBookId=" + firstBookId +
                ", lastBookId=" + lastBookId +
                '}';
    }
}
