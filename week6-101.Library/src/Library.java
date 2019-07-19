/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gurhan
 */

import java.util.ArrayList;

public class Library {
    
    private ArrayList arr;
    
    public Library() {
        arr = new ArrayList();
    }
    
    public void addBook(Book newBook) {
        arr.add(newBook);
    }
    
    public void printBooks() {
        int i;
        for (i=0;i<arr.size();i++) {
            Book book = (Book) arr.get(i);
            System.out.println(book.toString());
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        int i;
        for (i=0;i<arr.size();i++) {
            Book book = (Book) arr.get(i);
            if (StringUtils.included(book.title(), title)) {
                found.add((Book) arr.get(i));
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        int i;
        for (i=0;i<arr.size();i++) {
            Book book = (Book) arr.get(i);
            if (StringUtils.included(book.publisher(), publisher)) {
                found.add((Book) arr.get(i));
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        int i;
        for (i=0;i<arr.size();i++) {
            Book book = (Book) arr.get(i);
            if (book.year() == year) {
                found.add((Book) arr.get(i));
            }
        }
        return found;
    }
    
}
