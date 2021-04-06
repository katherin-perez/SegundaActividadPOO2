package com.company;

public class Book {

    private String title;
    private String author;
    private String codigoISBN;
    private Integer quantity;

    public Book(String title, String author, String codigoISBN, Integer quantity) {
        this.title = title;
        this.author = author;
        this.codigoISBN = codigoISBN;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(String codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void lending(int numArticulos) throws Exception{
        if (numArticulos > quantity){
            throw new CantidadException("La cantidad solicitada no está disponible (」°ロ°)」",1);
        }else {
            this.setQuantity(quantity-numArticulos);
        }
    }

    public void existence(String title) throws Exception{
        if(title.equalsIgnoreCase(getTitle())){
            System.out.println("Título: "+getTitle()+ "\nAutor: "+getAuthor()+ "\nCódigo ISBN: "+getCodigoISBN()+
                    "\nCantidad disponible: "+getQuantity());
        }else {
            throw new ExistenceException("El libro no está en existencia (ｏ・_・)ノ", 2);
        }
    }

    public void giveBack(Integer numArticulos) throws Exception{
        if(numArticulos > 0){
            this.setQuantity(quantity+numArticulos);
        }else{
            throw new CantidadException("La cantidad a devolver no es válida", 3);
        }
    }
}
