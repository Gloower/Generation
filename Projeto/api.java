package Projeto;

class Login {
    private String user; // --> Login
    private String pass; // --> Senha
   
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPassword(String pass) {
        this.pass = pass;
    }

    void login (){
        System.out.println("Bem vindo ao site do(ação); " + getUser());
    }
}
