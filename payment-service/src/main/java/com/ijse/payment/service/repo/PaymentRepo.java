package com.ijse.payment_service.repo;

import com.ijse.payment_service.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<PaymentEntity,Long> {

}
