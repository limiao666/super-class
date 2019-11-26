package test.javatest.practise6;

import java.text.CollationKey;
import java.text.Collator;
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

    public static void main(String[] args) {
//        Set treeSet=new TreeSet();
//        for(int i=0;i<10;i++){
//            Personal personal=new Personal(Math.random()*10,"aa"+i,i*i,true);
//            treeSet.add(personal);
//            treeSet.toArray();
//
//        }
//        System.out.println(treeSet.toString());
//
//        TreeMap treeMap = new TreeMap();
//
//        for (int i = 0; i < 10; i++) {
//            Personal personal = new Personal();
//
//            treeMap.put("name", "aa" + i);
//            treeMap.put("age", i * i);
//            treeMap.put("sex", true);
//            treeMap.put("id", Math.random() * 10);
//            System.out.println(treeMap.toString());
//
//        }
//    }


//        LinkedList linkedList=new LinkedList();
//        for(int i=0;i<10;i++){
//            Personal personal=new Personal("a"+i,"aa"+i,i*i,true);
//            linkedList.add(personal);
//            System.out.println(personal);
//        }
//        System.out.println(linkedList.toString());


//        ArrayList arrayList=new ArrayList();
//        for(int i=0;i<10;i++){
//            Personal personal=new Personal("a"+i,"aa"+i,i*i,true);
//            arrayList.add(personal);
//            System.out.println(personal);
//        }
//        System.out.println(arrayList.toString());
//
//        HashSet hashSet=new HashSet();
//        for(int i=0;i<10;i++){
//            Personal personal=new Personal("a"+i,"aa"+i,i*i,true);
//            hashSet.add(personal);
//
//        }
//        Iterator iterator=hashSet.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }


//
        Map hashMap=new HashMap();
        hashMap.put("17200135216",new Personal(22.0,"a",11,true));
        hashMap.put("17200135211",new Personal(23.0,"b",12,true));

        hashMap.put("17200135218",new Personal(22.0,"c",13,true));

        hashMap.put("17200135219",new Personal(22.0,"d",14,true));

        hashMap.put("17200135215",new Personal(22.0,"e",15,false));

        hashMap.put("17200135214",new Personal(22.0,"f",16,true));

        hashMap.put("17200135213",new Personal(22.0,"g",17,false));

        hashMap.put("17200135212",new Personal(22.0,"h",18,true));

        hashMap.put("17200135217",new Personal(22.0,"i",19,false));

        hashMap.put("17200135210",new Personal(22.0,"j",10,true));


        Map treeMap=new TreeMap(hashMap);
        Set entrySet = treeMap.entrySet();

        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry entry=(Map.Entry) iterator.next();
            System.out.println(entry);
        }

    }
}








