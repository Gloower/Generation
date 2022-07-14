package Java.br.com.generation.heranca;

class Person {

    private String name;
    private int idade;
    private String endereço;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    void console(){
        System.out.println(getEndereço()+ getIdade()+ " anos" +getName());
    }
}
