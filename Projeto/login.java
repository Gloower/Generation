// Api do login e cadastro feito por Nicolas Alves.
package Projeto;

class Login {
    private String user; // --> Login
    private String pass; // --> Senha
    private String edit; // --> Redefinir sua senha.

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEdit() {
        return edit;
    }

    public void setEdit(String edit) {
        this.edit = edit;
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
