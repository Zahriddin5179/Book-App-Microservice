package uz.pdp.mycollection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import uz.pdp.mycollection.repository.OrderRepository;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public HttpEntity<?>myCollection(){
        return null;
    }
}
