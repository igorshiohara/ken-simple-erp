package br.com.igorshiohara.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
public class OrderItem implements Serializable {

    private static final long serialVersionUID = -8469364240979333378L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    private int quantity;

    private BigDecimal total;
}
