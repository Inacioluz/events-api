package com.eventostec.api.domain.repositories;

import com.eventostec.api.domain.cupon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CoupnRepository extends JpaRepository<Coupon, UUID> {


}
