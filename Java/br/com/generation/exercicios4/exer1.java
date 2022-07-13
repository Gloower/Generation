package Java.br.com.generation.exercicios4;

class exer1 {
    private String client; // --> client name
    private String buy; // --> what the client want to buy
    


// get and set 
   
    public String getClient() {
        return client;
    }
    public void setClient(String client) {
        this.client = client;
    }
    public String getBuy() {
        return buy;
    }
    public void setBuy(String buy) {
        this.buy = buy;
    }

// Message on console
    void console(){
        System.out.println("Bem vindo " + client + " voce esta comprando " + buy + " em nosso site.");
    }
}
