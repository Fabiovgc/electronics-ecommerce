package com.eletrocommerce.ecommerce.entities;

import java.time.Instant;

import jakarta.persistence.*;


@Entity
@Table(name = "tb_order")
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    private Instant moment;  // tipo instant representa um instante no tempo e considera informações dde fuso horario. Equivalente ao tipo Date.
    
    @Column
    private OrderStatus status;

    @ManyToOne
    @JoinColumn(name = "client_id")    // Essas duas annotations representam o relacionamento de muitos (Order) para um (User) entre as tabelas 
    private User client; // A propriedade do tipo User é a ligação de muitos (Order) para um (User)



    public Order(){

    }



    public Order(Long Id, Instant moment, OrderStatus status, User client){
        this.Id = Id;
        this.moment = moment;
        this.status = status;
        this.client = client;
    }






    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    

}
