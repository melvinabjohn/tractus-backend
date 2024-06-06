package com.melvin.quizapp.Controller;

import com.melvin.quizapp.Models.*;
import com.melvin.quizapp.Service.DiscoveryEndpointService;
import com.melvin.quizapp.Service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("discoveryEndpoint")
public class ControlPlaneController {

    @Autowired
    DiscoveryEndpointService discoveryEndpointService;

    @Autowired
    PolicyService policyService;
    @PostMapping("Endpoints")
    public List<Endpoint> getDiscoveryEndpoints(SearchRequest searchRequest) {
        return discoveryEndpointService.getDiscoveryEndpoints(searchRequest);
    }

    @PostMapping("delete")
    public boolean deleteDiscoveryEndpointByResourceId(@RequestBody List<UUID> resourceId) {
        return discoveryEndpointService.deleteDiscoveryEndpointByResourceId(resourceId);
    }

    @PostMapping("add")
    public boolean postDiscoveryEndpoint(@RequestBody Endpoint endpoint) {
        return discoveryEndpointService.postDiscoveryEndpoint(endpoint);
    }
    ///
    //This api is from Digital Twin KIT
    //Ref :: https://eclipse-tractusx.github.io/docs-kits/next/kits/Digital%20Twin%20Kit/Software%20Development%20View/API%20EDC%20Discovery/post-list-of-bpns-or-an-empty-array-to-retrieve-available-company-connector-authorization-required-roles-view-connectors/
    ///
    @GetMapping("lookup/shells/{AssetIds}")
    public List<String> getAASIds(@PathVariable String AssetIds) {
        //List<Map<String, String>> assetIds = assetIdsRequest.getAssetIds();
        // Your logic to process assetIds and return AAS (Asset Administration Shell) Ids
        // For example, you might want to filter AAS Ids based on the provided parameters.

        // Here, I'm just returning a dummy list. Replace this with your actual implementation.
        return List.of("AAS123", "AAS456", "AAS789");
    }

    ///
    //This api is from Digital Twin KIT
    //Ref :: https://eclipse-tractusx.github.io/docs-kits/next/kits/Digital%20Twin%20Kit/Software%20Development%20View/API%20EDC%20Discovery/post-list-of-bpns-or-an-empty-array-to-retrieve-available-company-connector-authorization-required-roles-view-connectors/
    ///
    @PostMapping("Connectors/discovery")
    public List<ConnectorEndPointData> getConnectorEndpoints(@RequestBody List<String> bpns) {
        return discoveryEndpointService.getConnectorEndpoints(bpns);
    }


    ///
    //This api is from Connector KIT
    //Ref :: https://eclipse-tractusx.github.io/docs-kits/next/kits/tractusx-edc/docs/kit/development-view/openAPI/tractusx-edc-api/request-catalog
    //Returns stubbed data which is hardcoded in service layer.
    ///
    @PostMapping("catalog/request")
    public CatalogResponse getCatalogDetails(@RequestBody CatalogRequest test) {
        return discoveryEndpointService.getCatalogDetails(test);
    }

    ///
    //This api is from Connector KIT
    //Ref :: https://eclipse-tractusx.github.io/docs-kits/next/kits/tractusx-edc/docs/samples/management-api-v2-walkthrough/policy-definitions
    //Returns stubbed data which is hardcoded in service layer.
    ///
    @PostMapping("policydefinitions")
    public boolean CreatePolicyDefinitions(@RequestBody PolicyDefinitionRequest request) {
        return policyService.CreatePolicyDefinitions(request);
    }

    ///
    //This api is from Connector KIT
    //Ref :: https://eclipse-tractusx.github.io/docs-kits/next/kits/tractusx-edc/docs/samples/management-api-v2-walkthrough/policy-definitions
    //Returns stubbed data which is hardcoded in service layer.
    ///
    @PostMapping("contractdefinitions")
    public boolean CreateContractDefinitions(@RequestBody ContractDefinitionRequest request) {
        return policyService.CreateContractDefinitions(request);
    }

    @PostMapping("contractnegotiations")
    public boolean CreateContractNegotiations(@RequestBody ContractNegotiationRequest request) {
        return policyService.CreateContractNegotiations(request);
    }

}
