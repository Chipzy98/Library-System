package org.example.service;

import org.example.dto.BorrowerDto;
import org.example.entity.Borrower;

import java.util.List;

public interface BorrowerService {
    public List<BorrowerDto> getBorrowers();

    boolean deleteBorrower(Long id);

    void addBorrower(BorrowerDto borrower);
}
