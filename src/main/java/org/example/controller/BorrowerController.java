package org.example.controller;

import org.example.dto.BorrowerDto;
import org.example.entity.Borrower;
import org.example.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class BorrowerController {
    @Autowired
    BorrowerService borrowerService;
    @GetMapping("/borrowers")
    public List<BorrowerDto> getBorrowers(){
        return borrowerService.getBorrowers();
    }
        @PostMapping("/add")
        @ResponseStatus(HttpStatus.CREATED)
        public void addBorrower(@RequestBody BorrowerDto borrower){
            borrowerService.addBorrower(borrower);
        }
//        @GetMapping("/get")
//        public List<Book> getBooks(){
//            return bookService.getBooks();
//        }

        @DeleteMapping("/{id}")
        public ResponseEntity<String> deleteBorrower(@PathVariable Long id){
            return borrowerService.deleteBorrower(id)?ResponseEntity.ok("Deleted"):ResponseEntity.notFound().build();
        }

//        @GetMapping("/search/{id}")
//        public Book getBookById(@PathVariable Long id){
//            return bookService.getBookById(id);
//        }

}
