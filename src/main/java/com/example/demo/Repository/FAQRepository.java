package com.example.demo.Repository;

import com.example.demo.entity.FAQ;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FAQRepository extends JpaRepository<FAQ, Long> {
	 List<FAQ> findAllByFaqType(String faqType);
}