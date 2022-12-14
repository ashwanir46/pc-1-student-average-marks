package com.jap;

import java.util.*;

public class StudentService {

    public static Set<Student> getAllStudentData() {
        //create six student object by calling Student class parameterized constructor
        Student student1 = new Student("Vaibhav", 101, 95);
        Student student2 = new Student("Ashwani", 102, 85);
        Student student3 = new Student("Ramesh", 103, 75);
        Student student4 = new Student("Suresh", 104, 91);
        Student student5 = new Student("Ravi", 105, 96);
        Student student6 = new Student("Ankit", 106, 90);

        //create HashSet object and add all the students object inside it
        Set<Student> object = new HashSet<>();
        object.add(student1);
        object.add(student2);
        object.add(student3);
        object.add(student4);
        object.add(student5);
        object.add(student6);

        //return the HashSet object

        return object;
    }


    public static Set<String> getAllStudentNameInSorted(Set<Student> studentSet) {
        //Create a TreeSet object
        Set<String> students = new TreeSet<>();

        //Use Iterator object of type <Student> to iterate through the studentSet
        Iterator<Student> iterator = studentSet.iterator();

        //get all the name and add it inside the TreeSet object
        while (iterator.hasNext()) {
            students.add(iterator.next().getName());
        }
        //return the TreeSet object;
        return students;
    }

    public static Map<String,Integer> calculateAverage(Set<Student> studentSet){
        //create a HashMap object of type <String,Integer>
        Map<String, Integer> hashMap = new HashMap<>();

        //Use Iterator object of type <Student>to iterate through the studentSet
        Iterator<Student> iterator = studentSet.iterator();

        //retrieve the Student object from the iterator
        while (iterator.hasNext()) {
            //Use getter method to get TotalMarks of each student. calculate the average
            //add the student name and average marks in the HashMap object created in the
            Student object = iterator.next();
            hashMap.put(object.getName(), object.getTotalMarks());
        }
        //first line and return the map

        return hashMap;

    }

    public static void main(String[] args) {
        Set studentName = getAllStudentData();
        System.out.println(getAllStudentNameInSorted(studentName));
        System.out.println(calculateAverage(studentName));
    }


}
