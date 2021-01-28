package edu.escuelaing.arep.app.linkedList;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Class that store and get real numbers
 * @author Alan Marin
 *
 */
public class LinkedList implements Cloneable, Serializable,List {
    private LinkedElement head;
    private LinkedElement tail;
    private int size;


    public LinkedList(double number) {
        LinkedElement num = new LinkedElement(number);
        this.head = num;
        this.tail = num;
    }


    public LinkedList() {
    }

    /**
     * Adding a real number on the list
     * @param number
     *
     */
    public void add(double number){
        LinkedElement num = new LinkedElement(number);
        if (this.head == null) {
            this.head = num;
            this.tail = num;
        }else if (this.head == this.tail){
            this.head.setNext(num);
            num.setPrev(this.head);
            this.tail = num;
        }else {
            this.tail.setNext(num);
            num.setPrev(this.tail);
            this.tail = num;
        }
        size +=1;
    }

    /**
     * Remove and return the last number of the List
     * @return double
     *
     */
    public double pop() throws Exception {
        double temp=0;
        if (this.head == null){
            throw new Exception("Empty List");
        }else if (this.head == this.tail){
            temp = this.head.getValue();
            this.head = null;
            this.tail = null;

        }else {
            temp = this.tail.getValue();
            this.tail.getPrev().setNext(null);
            this.tail = this.tail.getPrev();
        }
        return temp;
    }

    /**
     * Make a List empty
     *
     */
    @Override
    public void clear() {
        this.head = null;
        this.tail= null;
    }


    /**
     * Report the state of the list
     * @return  boolean
     *
     */
    @Override
    public boolean isEmpty() {
        if (this.head == null){
            return true;
        }
        return false;
    }

    public LinkedElement getHead() {
        return head;
    }

    public LinkedElement getTail() {
        return tail;
    }

    @Override
    public int size() {
        return this.size;
    }


    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }


    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) { }

    @Override
    public Object remove(int index) {

        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
