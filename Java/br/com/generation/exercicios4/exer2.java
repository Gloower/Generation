package exercicios4;

class exer2 {
    private String retailer; // --> name
    private String id; // --> id = login
    private String acess; // --> acess = password
    private String product; // --> what u will sell 

// get and set 

    public String getRetailer() {
        return retailer;
    }
    public void setRetailer(String retailer) {
        this.retailer = retailer;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getAcess() {
        return acess;
    }
    public void setAcess(String acess) {
        this.acess = acess;
    }
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    
// Message on console
    void console(){
        System.out.println("Bem vindo " + retailer + " hoje você irá vender " + product + " para os seus clientes.");
    }
}
