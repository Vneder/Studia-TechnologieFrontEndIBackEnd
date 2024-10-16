package com.example.lab.Products;

import com.example.lab.Category.Category;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@NoArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "duration", nullable = false)
    private String duration;
    @Column(name = "release_date", nullable = false)
    private String release_date;
    @Column(name = "studio")
    @Nullable
    private String studio;
    @JoinColumn(name = "category_id", nullable = false)
    @ManyToOne(cascade = CascadeType.DETACH)
    private Category category;

    public Product(String name, String duration, String release_date, String studio, Category category) {
        this.name = name;
        this.duration = duration;
        this.release_date = release_date;
        this.studio = studio;
        this.category = category;
    }
}
