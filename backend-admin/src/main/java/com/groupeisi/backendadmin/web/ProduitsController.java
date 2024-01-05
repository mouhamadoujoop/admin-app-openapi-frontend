package com.groupeisi.backendadmin.web;

import com.groupeisi.generated.api.ProduitApi;
import com.groupeisi.generated.model.ProduitDTO;
import com.groupeisi.generated.model.ProduitsResultListDTO;
import org.springframework.http.ResponseEntity;

public class ProduitsController implements ProduitApi {
    @Override
    public ResponseEntity<ProduitDTO> getProduit(Integer idProduit) throws Exception {
        return ProduitApi.super.getProduit(idProduit);
    }

    @Override
    public ResponseEntity<ProduitsResultListDTO> getAllProducts(Integer currentPage, Integer sizePage) throws Exception {
        return ProduitApi.super.getAllProducts(currentPage, sizePage);
    }
    
}
