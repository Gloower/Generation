package poo;


class Student {
   private int age;
   private String name;
   private String curse;
   

    

    public int getAge() {
    return age;
}


public void setAge(int age) {
    this.age = age;
}


public String getName() {
    return name;
}


public void setName(String name) {
    this.name = name;
}


public String getCurse() {
    return curse;
}


public void setCurse(String curse) {
    this.curse = curse;
}


    void study(){
        System.out.println("Estudando......" + name + age +curse);
    }

}
//Api do student
