package flavia.dev.backend_criptografia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import flavia.dev.backend_criptografia.entiry.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
