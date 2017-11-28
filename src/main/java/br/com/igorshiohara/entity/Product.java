package br.com.igorshiohara.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
public class Product implements Serializable {

    private static final long serialVersionUID = 8056798691387485057L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PRODUCT_ID")
    private Long id;

    private String name;

    private String description;

    private BigDecimal price;

    private int stockQty;

}
