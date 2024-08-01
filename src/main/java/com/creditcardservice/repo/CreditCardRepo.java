package com.creditcardservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.creditcardservice.entity.CreditCard;



@Repository
public interface CreditCardRepo extends JpaRepository<CreditCard, Integer>
{

	@Query(nativeQuery=true,value="select cc.id,cc.card_number,cc.card_holder_name,cc.balance from BankingApplicationFeign.creditcard cc join BankingApplicationFeign.customer c on c.id =cc.customer_id where cc.customer_id=:customerId")
CreditCard findCreditCardByCustomerId(@Param("customerId") int customerId);
	
	
	
}
