package io.github.doflavio.udemy_aws_project01.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface InvoiceRepository extends CrudRepository<io.github.doflavio.udemy_aws_project01.model.Invoice, Long> {
    Optional<io.github.doflavio.udemy_aws_project01.model.Invoice> findByInvoiceNumber(String invoiceNumber);

    List<io.github.doflavio.udemy_aws_project01.model.Invoice> findAllByCustomerName(String customerName);
}
