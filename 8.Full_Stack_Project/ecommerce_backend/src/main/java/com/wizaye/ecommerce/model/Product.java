package com.wizaye.ecommerce.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String desc;
    private String brand;
    private BigDecimal price;
    private String category;
//    Handled in the frontend
//    @JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd-mm-yyyy")
    private Date releaseDate;
    private boolean available;
    private int quantity;
    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageDate;
}
