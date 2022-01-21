package com.api.gateway.config;


import com.api.gateway.dto.PaymentDto;
import com.api.gateway.dto.WorkerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Component
@FeignClient(name = "payroll",path = "/payroll")
public interface PayrollFeignCliente {

    @GetMapping(value = "/{id}/days/{days}")
     ResponseEntity<PaymentDto> getPayment(@PathVariable Long id, @PathVariable Integer days) throws Exception;
}
