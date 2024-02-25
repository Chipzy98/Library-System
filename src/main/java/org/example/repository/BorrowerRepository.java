package org.example.repository;

import org.example.entity.Borrower;
import org.springframework.data.repository.CrudRepository;

public interface BorrowerRepository extends CrudRepository<Borrower, Long> {

}
