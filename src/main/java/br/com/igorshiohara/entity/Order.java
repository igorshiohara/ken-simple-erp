package br.com.igorshiohara.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ORDER_TABLE")
@Data
public class Order implements Serializable {

    private static final long serialVersionUID = 1907820209353466450L;

    @Id
    @GeneratedValue
    private Long id;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date creationDate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany
    private List<OrderItem> items;

}
