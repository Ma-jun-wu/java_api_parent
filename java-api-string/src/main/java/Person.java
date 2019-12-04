public class Person {
    private String name;
    private int age;
    private String gender;
    private double height;
    private double weight;

    public Person(String name, int age, String gender, double height, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Person){
            Person p=(Person) obj;
            return this.age==p.age?true:false;
        }
        return false;
    }
    @Override
    public String toString(){
        return "姓名："+name+"   年龄："+age+"   性别："+gender+
                "   身高："+height+"   体重："+weight;
    }
}
