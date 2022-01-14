package com.pay.roll.service;

import com.pay.roll.config.WorkerFeignCliente;
import com.pay.roll.dto.WorkerDto;
import com.pay.roll.entity.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final WorkerFeignCliente feign;

    public PaymentService(WorkerFeignCliente feign) {
        this.feign = feign;
    }

    public Payment getPayment(long workerId, int days) throws Exception {
        WorkerDto dto = feign.findById(workerId).getBody();
        return new Payment(dto.getName(), dto.getDailyIncome(), days);
    }
}
