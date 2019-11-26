package test.javatest.practise2;

public class Personal {
    private String id;
    private String name;
    private int age;
    private Boolean sex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
    public Personal(){
        System.out.println();

    }

    public Personal(String id, String name, int age, Boolean sex){
        this.id=id;
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    public String toString(){

        return "id="+id+"\tname="+name+"\tage="+age+"\tsex="+sex;

    }

}
