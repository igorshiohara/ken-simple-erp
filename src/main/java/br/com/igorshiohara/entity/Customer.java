package br.com.igorshiohara.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Customer implements Serializable {

    private static final long serialVersionUID = 3324456081461146826L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    private String phoneNumber;

    private String streetAddress;

    private String zipCode;

    private String country;

    private String state;

    private String city;

}
