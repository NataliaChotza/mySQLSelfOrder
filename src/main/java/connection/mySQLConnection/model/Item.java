package connection.mySQLConnection.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.lang.NonNull;

@Entity

public class Item {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String id;
    @NonNull
    private String name;
    @NonNull
    private String descrption;
    private String quantity;
    @NonNull
    private CategoryEnum category;
    @NonNull
    private String price;

    private String currency;
    public Item(String id,String name, String descrption, String quantity, String price, String currency,CategoryEnum category){
        super();
        this.id=id;
        this.name=name;
        this.quantity=quantity;
        this.descrption=descrption;
        this.category = category;
        this.price = price;
        this.currency = currency;
    }

    public Item() {
    }

    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getDescrption(){
        return this.descrption;
    }
    public String getQuantity(){
        if(this.quantity==null){
            this.quantity=String.valueOf(0);
        }
        return this.quantity;
    }
    public String getPrice(){
        return this.price;
    }
    public String getCurrency(){
        if(this.currency==null){
            this.currency="PLN";
        }
        return this.currency;
    }
    public CategoryEnum getCategory(){
        return this.category;
    }



}
