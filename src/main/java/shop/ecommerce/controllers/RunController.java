package shop.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.ecommerce.worker.InsertDataWorker;

@RestController
@RequestMapping("/run")
public class RunController {
    @Autowired
    InsertDataWorker dataWorker;
    @GetMapping("/ok")
    public ResponseEntity<?> run() {
        dataWorker.run();
        return ResponseEntity.noContent().build();
    }
}
