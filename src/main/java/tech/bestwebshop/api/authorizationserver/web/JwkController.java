package tech.bestwebshop.api.authorizationserver.web;

import com.nimbusds.jose.jwk.JWKSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class JwkController {

    @Autowired
    private JWKSet jwkSet;

    @GetMapping(value = "/oauth2/jwks.json", produces = "application/json; charset=UTF-8")
    public Map<String, Object> keys(){
        System.out.println("------- getting oauth keys -------");
        return this.jwkSet.toJSONObject();
    }
}
