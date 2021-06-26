package entities;
public class Product {//product -> null    0.0    0
    private String productName;          //name price quantity
    private double productPrice;
    private int productQuantity;

    /**
     * Com o intuito de evitar a existência de produtos sem nome e sem preço, é possível
     * fazer com que seja “obrigatória” a iniciação desses valores.*/
    public Product(String programName, double programPrice, int programQuantity){//construtor
        this.productName = programName;
        this.productPrice = programPrice;
        this.productQuantity = programQuantity;
    }/**existem 3 antidades se iqualitando em cada variavel a = b = c
     nesse caso productName = (programName) = programName
     O primeriro e identificado como this., se associado com a declarada na clsse atual
     o segundo declarada no parametro do metodo. como parametro, so serve para associado ao objeto no main fora da clase atual
     o terceiro declarada na classe main(run/inicializador) onde e usado para quardar valores que sera associado ao primeiro
     tudo para uma jogada de valores, comunicacao de classes, emcapsilamento e tod o escambau do Poo*/

    //SOBRECARGA
    /**so para ter mais opicao de parametro na hora da Instancia*/
    public Product(String programName, double programPrice){
        this.productName = programName;
        this.productPrice = programPrice;
    }//contrutor padrao; ou seja o que ja tinha antes do construtor: noll 0.0 0
    public Product(){
    }
    //EMCAPSULAMENTO
    /**proteger variaveis de serem modificadas erroniamente*/
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public double getProductPrice() {
        return productPrice;
    }
    public int getProductQuantity() {
        return productQuantity;
    }//nao tem setquantity pois o sistema nao e para ter esse controle, mas sim o usuario do sistema
    // e como se o propio radio baixa-se o volume sozinho. usuario nao o sistema

    //FUNCAO DO PRODUTO
    public double totalValueInStock() {
        return productPrice * productQuantity;
    }
    public void addProducts(int programQuantity) {
        this.productQuantity += programQuantity;
    }
    public void removeProducts(int programQuantity) {
        this.productQuantity -= programQuantity;
    }
    public String toString() {
        return productName
                + ", $ "
                + String.format("%.2f", productPrice)
                + ", "
                + productQuantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}