package uz.pdp.mycollection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.mycollection.model.Orders;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Orders,UUID> {

}
