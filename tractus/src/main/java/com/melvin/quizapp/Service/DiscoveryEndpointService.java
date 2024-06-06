package com.melvin.quizapp.Service;

import com.melvin.quizapp.Dao.ConnectorEndPointDao;
import com.melvin.quizapp.Dao.DiscoveryEndpointDao;
import com.melvin.quizapp.Models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Service
public class DiscoveryEndpointService {

    @Autowired
    DiscoveryEndpointDao discoveryEndpointDao;

    @Autowired
    ConnectorEndPointDao connectorEndPointDao;

    public List<Endpoint> getDiscoveryEndpoints(SearchRequest searchRequest) {

        List<UUID> uuidList = Collections.singletonList(searchRequest.getId());

        if (searchRequest.getId() != null){
            return discoveryEndpointDao.findAllById(uuidList);
        } else if (searchRequest.getType() != null) {
            return discoveryEndpointDao.findByType(searchRequest.getType());
        }
        else if (searchRequest.getResourceId() != null) {
            return discoveryEndpointDao.findByResourceId(searchRequest.getResourceId());
        }
        else return discoveryEndpointDao.findAll();
    }

    public boolean deleteDiscoveryEndpointByResourceId(List<UUID> resourceId) {
        discoveryEndpointDao.deleteAllById(resourceId);
        return true;
//        try{
//            discoveryEndpointDao.deleteAllById(resourceId);
//            return true;
//        }
//        catch (Exception exception){
//            return false;
//        }

    }

    public boolean postDiscoveryEndpoint(Endpoint endpoint) {
        Endpoint endpointObj = new Endpoint();
        endpointObj.setEndpointAddress(endpoint.getEndpointAddress());
        endpointObj.setDescription(endpoint.getDescription());
        endpointObj.setDocumentation(endpoint.getDocumentation());
        endpointObj.setType(endpoint.getType());
        endpointObj.setResourceId(endpoint.getResourceId());
        discoveryEndpointDao.save(endpoint);

        return true;
    }

    public List<ConnectorEndPointData> getConnectorEndpoints(List<String> bpns) {

        return connectorEndPointDao.findAllById(bpns);
    }

    public CatalogResponse getCatalogDetails(CatalogRequest test) {

        CatalogResponse resp = new CatalogResponse();
        resp.setType("dcat:Catalog");
        resp.setId("AS123-123S");
        resp.setDcat("https://www.w3.org/ns/dcat/");
        resp.setOdrl("http://www.w3.org/ns/odrl/2/");
        resp.setDspace("https://w3id.org/dspace/v0.8/");
        resp.setEdc("https://w3id.org/edc/v0.0.1/ns/");
        resp.setDct("https://purl.org/dc/terms/");
        resp.setDescription("Test Description of stubbed data");
        resp.setEndPointUrl("http://localhost:16806/protocol");

        return resp;
    }
}
