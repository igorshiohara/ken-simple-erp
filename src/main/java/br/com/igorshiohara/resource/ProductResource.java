package br.com.igorshiohara.resource;

import br.com.igorshiohara.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductResource extends PagingAndSortingRepository<Product, Long> {
}
