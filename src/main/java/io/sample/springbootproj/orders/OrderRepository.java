package io.sample.springbootproj.orders;

import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<Order, String> {

}
