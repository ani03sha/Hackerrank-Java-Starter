/*
 * There are a number of students in a school who wait to be served. Two types of events, ENTER and SERVED, can take place which are described below.
 *
 * ENTER: A student with some priority enters the queue to be served.
 * SERVED: The student with the highest priority is served (removed) from the queue.
 * A unique id is assigned to each student entering the queue. The queue serves the students based on the following criteria (priority criteria):
 *
 * The student having the highest Cumulative Grade Point Average (CGPA) is served first.
 * Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
 * Any students having the same CGPA and name will be served in ascending order of the id.
 * Create the following two classes:
 *
 * The Student class should implement:
 * The constructor Student(int id, String name, double cgpa).
 * The method int getID() to return the id of the student.
 * The method String getName() to return the name of the student.
 * The method double getCGPA() to return the CGPA of the student.
 * The Priorities class should implement the method List<Student> getStudents(List<String> events) to process all the given events and return all the students yet to be served in the priority order.
 */


package org.redquark.hackerrank._04datastructures;


import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _15PriorityQueue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }

    static class Student implements Comparable<Student> {
        String name;
        double cgpa;
        int id;

        Student(String name, double cgpa, int id) {
            this.name = name;
            this.cgpa = cgpa;
            this.id = id;
        }

        String getName() {
            return this.name;
        }

        public int compareTo(Student s) {
            if (cgpa == s.cgpa) {
                if (name.compareTo(s.name) == 0) {
                    return Integer.compare(id, s.id);
                } else
                    return name.compareTo(s.name);
            } else if (cgpa > s.cgpa)
                return -1;
            else
                return 1;
        }
    }

    static class Priorities {
        ArrayList<Student> getStudents(List<String> events) {
            PriorityQueue<Student> pq = new PriorityQueue<>();
            for (String i : events) {
                String[] s;
                s = i.split("\\s");
                if (s.length > 1) {
                    pq.add(new Student(s[1], Double.valueOf(s[2]), Integer.valueOf(s[3])));
                } else {
                    pq.poll();
                }
            }
            while (pq.size() > 1) {
                System.out.println(pq.poll().name);
            }
            return new ArrayList<>(pq);
        }
    }
}

