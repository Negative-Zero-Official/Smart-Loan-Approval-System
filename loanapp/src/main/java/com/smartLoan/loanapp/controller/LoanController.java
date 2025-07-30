package com.smartLoan.loanapp.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smartLoan.loanapp.model.LoanApplication;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping()
public class LoanController {
    @PostMapping("/applyLoan")
    public ResponseEntity<?> applyLoan(@RequestBody LoanApplication application) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String url = "http://localhost:5000/predict";

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            ObjectMapper mapper = new ObjectMapper();
            String requestJson = mapper.writeValueAsString(application);

            HttpEntity<String> entity = new HttpEntity<>(requestJson, headers);
            @SuppressWarnings("rawtypes")
            ResponseEntity<Map> response = restTemplate.postForEntity(url, entity, Map.class);

            return ResponseEntity.ok(response.getBody());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of("error", e.getMessage()));
        }
    }
}
