package com.melvin.quizapp.Controller;

import com.melvin.quizapp.Models.AssetIdsRequest;
import com.melvin.quizapp.Models.Product;
import com.melvin.quizapp.Service.PCFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("pcf")
public class DataPlaneController {

    @Autowired
    PCFService pcfService;

    @GetMapping("/{productId}")
    public Product getProductInfo(@PathVariable UUID productId) throws Exception {
        return pcfService.getProductById(productId);
    }

    @PutMapping("/{productId}")
    public Product updateProduct(@PathVariable UUID productId, @RequestBody Product updatedProduct) {
        return pcfService.updateProduct(productId, updatedProduct);
    }


}
