package ru.mirea.naz.pr13_14;

public interface Comparator {
    public Student[] MergeSort(Student[] students);
    public Student[] QuickSort(Student[] students);
    public Student binarySearch(Student arr[], int elementToSearch);
    public Student linearSearch(Student arr[], int elementToSearch);
    public Student recursiveBinarySearch (Student arr[], int firstElement, int lastElement, int elementToSearch);
}
