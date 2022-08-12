// Get and Set of login and pass.

// Sistema de login para o projeto.
package Projeto;

class Login {
    private String user; // --> Login
    private String pass; // --> Senha

    public void setPass(String pass) {
        this.pass = pass;
    }

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
        System.out.println("Bem vinde ao site do(ação); " + getUser());
    }
}