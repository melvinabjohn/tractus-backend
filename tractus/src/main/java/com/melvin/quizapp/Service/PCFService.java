package com.melvin.quizapp.Service;

import com.melvin.quizapp.Dao.ProductDao;
import com.melvin.quizapp.Models.Product;
import com.melvin.quizapp.Models.Pcf;
import com.melvin.quizapp.Models.ProductIds;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class PCFService {

    private final ProductDao productRepository;

    public PCFService(ProductDao productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProductById(UUID id) throws Exception {
        Optional<Product> productOptional = productRepository.findById(id);

        if (productOptional.isPresent()) {
            return productOptional.get();
        } else {
            throw new Exception("Product not found");
        }
    }

    public Product updateProduct(UUID productId, Product updatedProduct) {
        Product existingProduct = productRepository.findById(productId)
                .orElseThrow(() -> new EntityNotFoundException("Product not found"));

        existingProduct.setVersion(updatedProduct.getVersion());
        existingProduct.setCreated(updatedProduct.getCreated());
        existingProduct.setComment(updatedProduct.getComment());
        existingProduct.setPcfLegalStatement(updatedProduct.getPcfLegalStatement());
        existingProduct.setCompanyName(updatedProduct.getCompanyName());
        existingProduct.setProductDescription(updatedProduct.getProductDescription());
        existingProduct.setExtWBCSDProductCodeCpc(updatedProduct.getExtWBCSDProductCodeCpc());
        existingProduct.setProductName(updatedProduct.getProductName());

        /*CompanyIds updatedCompanyIds = updatedProduct.getCompanyIds();
        CompanyIds existingCompanyIds = existingProduct.getCompanyIds();
        existingCompanyIds.setCompanyId(updatedCompanyIds.getCompanyId());*/

        //ProductIds updatedProductIds = updatedProduct.getProductIds();
        //ProductIds existingProductIds = existingProduct.getProductIds();
        //existingProductIds.setProductId(updatedProductIds.getProductId());

        Pcf updatedPcf = updatedProduct.getPcf();
        Pcf existingPcf = existingProduct.getPcf();
        existingPcf.setDeclaredUnit(updatedPcf.getDeclaredUnit());
        existingPcf.setUnitaryProductAmount(updatedPcf.getUnitaryProductAmount());
        existingPcf.setProductMassPerDeclaredUnit(updatedPcf.getProductMassPerDeclaredUnit());
        existingPcf.setExemptedEmissionsPercent(updatedPcf.getExemptedEmissionsPercent());
        existingPcf.setExemptedEmissionsDescription(updatedPcf.getExemptedEmissionsDescription());
        existingPcf.setExtWBCSDPackagingEmissionsIncluded(updatedPcf.isExtWBCSDPackagingEmissionsIncluded());
        existingPcf.setBoundaryProcessesDescription(updatedPcf.getBoundaryProcessesDescription());
        existingPcf.setGeographyCountrySubdivision(updatedPcf.getGeographyCountrySubdivision());
        existingPcf.setGeographyCountry(updatedPcf.getGeographyCountry());
        existingPcf.setGeographyRegionOrSubregion(updatedPcf.getGeographyRegionOrSubregion());
        existingPcf.setReferencePeriodStart(updatedPcf.getReferencePeriodStart());
        existingPcf.setReferencePeriodEnd(updatedPcf.getReferencePeriodEnd());

        //existingProduct..save
        return productRepository.save(existingProduct);
    }
}
