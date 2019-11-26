package test.javatest.practise7;

import test.surface_project.example.file_io_java.FileIOMain;

import java.io.*;
import java.util.*;

public class Personal implements Comparable<Personal> {
    private double id;
    private String name;
    private int age;
    private Boolean sex;

    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;

    }

    public Personal() {
        System.out.println();

    }

    public Personal(double id, String name, int age, Boolean sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String toString() {

        return "id=" + id + "\tname=" + name + "\tage=" + age + "\tsex=" + sex;

    }

    @Override
    public int compareTo(Personal personal) {
        if (this.id > personal.getId()) {
            return 1;
        } else if (this.id < personal.getId()) {
            return -1;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) throws IOException {


        File fileone = new File("/Users/crystal/IdeaProjects/crystal/src/test/javatest/practise7/personal.dat");
        if (!fileone.exists()) {
            fileone.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(fileone);
//
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 10; i++) {
            Personal personal = new Personal(i, "aa" + i, i * i, true);
            hashSet.add(personal);


        }
        //hashSet-->treeSet按照id排序
        TreeSet treeSet=new TreeSet(hashSet);
        treeSet.toArray();
        Iterator iterator=treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //写入
        fileWriter.write(treeSet.toString());
        fileWriter.close();
        //读取
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileone);
            int ch = 0;
            while ((ch = fileReader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }


    }
}








