package exercicios5;

public class exer3Stock {
    private String nameProduct;
    private int quantidadeStock;
    private double preco;

    public exer3Stock(String nameProduct, int quantidadeStock, double preco) {
        this.nameProduct = nameProduct;
        this.quantidadeStock = quantidadeStock;
        this.preco = preco;
    }

    public String getnameProduct() {
        return nameProduct;
    }

    public void setnameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getquantidadeStock() {
        return quantidadeStock;
    }

    public void setquantidadeStock(int quantidadeStock) {
        this.quantidadeStock = quantidadeStock;
    }

}