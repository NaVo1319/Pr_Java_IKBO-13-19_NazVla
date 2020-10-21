package ru.mirea.naz.pr13_14;

public class SortingStudentByGPA implements Comparator {
    private double Mid(Student student) {
        double sum = 0;
        for (int i = 0; i < student.getMarks().length; ++i) {
            sum += student.getMarks()[i];
        }
        return sum / student.getMarks().length;
    }

    public Student[] mergeSort(Student[] source, int left, int right) {
        int delimiter = left + ((right - left) / 2) + 1;
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(source, left, delimiter - 1);
            mergeSort(source, delimiter, right);
        }
        Student[] buffer = new Student[right - left + 1];
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            if (delimiter > right || Mid(source[cursor]) > Mid(source[delimiter])) {
                buffer[i] = source[cursor];
                cursor++;
            } else {
                buffer[i] = source[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, source, left, buffer.length);
        return buffer;
    }

    @Override
    public Student[] MergeSort(Student[] students) {
        return mergeSort(students,0,students.length-1);
    }

    public Student[] quickSort(Student[] array, int low, int high) {
        if (array.length == 0)
            return array;
        if (low >= high)
            return array;
        int middle = low + (high - low) / 2;
        Student opora = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (Mid(array[i]) > Mid(opora)) {
                i++;
            }
            while (Mid(array[j]) < Mid(opora)) {
                j--;
            }
            if (i <= j) {
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
        return array;
    }

    @Override
    public Student[] QuickSort(Student[] students) {
        return quickSort(students,0, students.length-1);
    }
    @Override
    public Student linearSearch(Student arr[], int elementToSearch) {

        for (int index = 0; index < arr.length; index++) {
            if (arr[index].getID() == elementToSearch)
                return arr[index];
        }
        return null;
    }
    @Override
    public Student binarySearch(Student arr[], int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex].getID() == elementToSearch) {
                return arr[middleIndex];
            }
            else if (arr[middleIndex].getID() < elementToSearch)
                firstIndex = middleIndex + 1;
            else if (arr[middleIndex].getID() > elementToSearch)
                lastIndex = middleIndex - 1;

        }
        return null;
    }
    @Override
    public Student recursiveBinarySearch(Student arr[], int firstElement, int lastElement, int elementToSearch) {
        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;
            if (arr[mid].getID() == elementToSearch)
                return arr[mid];
            if (arr[mid].getID() > elementToSearch)
                return recursiveBinarySearch(arr, firstElement, mid - 1, elementToSearch);
            return recursiveBinarySearch(arr, mid + 1, lastElement, elementToSearch);
        }

        return null;
    }
}
