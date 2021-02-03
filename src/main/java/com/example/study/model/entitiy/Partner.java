package com.example.study.model.entitiy;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@ToString(exclude = {"itemList","category"})
public class Partner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String status;

    private String address;

    private  String callCenter;

    private  String partnerNumber;

    private String businessNumber;

    private String ceoName;

    private LocalDateTime registeredAt;

    private LocalDateTime unregisteredAt;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;


    //partner N : 1category
    @ManyToOne
    private Category category;
    //private Long categoryId;



    //partner 1 : N Item
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "partner")
    private List<Item> itemList;





}