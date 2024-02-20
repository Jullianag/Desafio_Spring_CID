package com.devsuperior.desafio.services;

import com.devsuperior.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {

        double valorFrete = 0.0;
        if (order.getBasic() < 100.0) {
            valorFrete = 20.00;
        }
        else if (order.getBasic() >= 100.0 && order.getBasic() < 200.0) {
            valorFrete = 12.00;
        }
        else if (order.getBasic() >= 200.00) {
            valorFrete = 0.0;
        }
        return valorFrete;
    }
}
