package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Task> taskList = new LinkedList<>();
        taskList.add(new Task("A", 2,3));
        taskList.add(new Task("B", 4,3));
        taskList.add(new Task("C", 7,3));
        taskList.add(new Task("D", 1,3));
        System.out.println(taskList.toString());
        System.out.println(taskList.get(0));
        printRow(taskList,taskList.get(0));
        printRow(taskList,taskList.get(1));
        printRow(taskList,taskList.get(2));

        printRow(taskList,taskList.get(3));


        boolean running = true;
        int iterations = 3;
        for(int i = 0; i<10; i++) {

            Task current = taskList.getFirst();
            String name = current.name;
            int x = current.duration;
            while(x>0) {
                System.out.print(name);
                x--;
            }
            if(current.name.equalsIgnoreCase("D")) {
                System.out.println(" ");

            }
            else {
                System.out.print(" ");
            }
            swapHeadTail(taskList);
        }

    }
    public static void printRow(LinkedList<Task> list,Task task) {
        System.out.print("|");

        for (Task t:list) {
            for (int x = t.duration; x > 0; x--) {
                if (t == task) {
                    System.out.print(t.name);
                } else {
                    System.out.print("-");
                }
            }
        }
        System.out.println("|");
    }

    public static LinkedList<Task> swapHeadTail(LinkedList<Task> taskList) {
        Task tail_new = taskList.pop();
        taskList.add(taskList.getLast());
        taskList.remove(taskList.getLast());
        taskList.add(tail_new);
        return taskList;
    }
}
