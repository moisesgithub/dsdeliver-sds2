package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	@Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products "
	 + " WHERE obj.status = 0 ORDER BY obj.moment ASC")
	List<Order> findOrdersWithProducts();
}

/* "O meu código está dando esse erro! não sei o que fazer!"

Error starting ApplicationContext. 
To display the conditions report re-run your application with 'debug' enabled.
2021-01-05 23:00:31.916 ERROR 3232 --- [main] o.s.boot.SpringApplication               
: Application run failed
*/
