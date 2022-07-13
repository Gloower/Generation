package Java.br.com.generation.exercicios4;

class exer1 {
    private String client;
    private String buy;
    



   
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

    void console(){
        System.out.println("Bem vindo " + client + " voce esta comprando " + buy + " em nosso site.");
    }
}
