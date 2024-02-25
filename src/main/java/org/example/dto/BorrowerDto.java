package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BorrowerDto {
    private long bid;
    private String name;
    private String contactNumber;
    private String address;
    private String nic;
}
