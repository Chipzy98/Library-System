package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Borrower {
//    public Borrower(long bid, String name, String contactNumber, String address, String nic) {
//        this.bid = bid;
//        this.name = name;
//        this.contactNumber = contactNumber;
//        this.address = address;
//        this.nic = nic;
//    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bid;
    private String name;
    private String contactNumber;
    private String address;
    private String nic;
//
//    @OneToOne
//    @JoinColumn
//    private Long isbn;
}