package spring_learn.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {


    @GetMapping("/authenticate")
    public Map<String,String> authenticate(HttpServletRequest request)
    {

        String authHeader = request.getHeader("Authorization");

        String base64Credentials =
                authHeader.substring("Basic ".length());

        byte[] credDecoded =
                Base64.getDecoder().decode(base64Credentials);

        String credentials =
                new String(credDecoded);

        String[] values = credentials.split(":");

        String username = values[0];
        String password = values[1];


        String token = generateToken(username);


        Map<String,String> response = new HashMap<>();

        response.put("token", token);

        return response;

    }


    private String generateToken(String username)
    {

        String secretKey = "secretkey";


        return Jwts.builder()

                .setSubject(username)

                .setIssuedAt(new Date())

                .setExpiration(
                        new Date(System.currentTimeMillis()+1200000)
                )

                .signWith(
                        SignatureAlgorithm.HS256,
                        secretKey
                )

                .compact();

    }

}