package br.com.igorshiohara.resource;

import br.com.igorshiohara.entity.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerResource extends PagingAndSortingRepository<Customer, Long> {
}
