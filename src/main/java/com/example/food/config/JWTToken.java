//package com.example.food.config;
//
//import io.jsonwebtoken.SignatureAlgorithm;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Component;
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.ExpiredJwtException;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.MalformedJwtException;
//import io.jsonwebtoken.SignatureAlgorithm;
//import io.jsonwebtoken.UnsupportedJwtException;
//import java.util.Date;
//
//@Component
//public class JWTToken {
//    private final String JWT_SECRET = "au_park";
//
//    private final Long JWT_EXPIRATION = 10800000L;
//
//    private Date expDate;
//
//    public String generateToken(UserDetails userDetails) {
//        Date now = new Date();
//        this.expDate = new Date(now.getTime() + JWT_EXPIRATION);
//        return Jwts.builder()
//                .setSubject(userDetails.getUsername())
//                .setIssuedAt(now)
//                .setExpiration(expDate)
//                .signWith(SignatureAlgorithm.HS512, JWT_SECRET)
//                .compact();
//    }
//
//    public Long getTimeExpireToken() {
//        return expDate.getTime();
//    }
//
//    public String getUserNameFromJWT(String token) {
//        Claims claims = Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJws(token).getBody();
//        return claims.getSubject();
//    }
//
//    public Boolean validateToken(String authToken) {
//        try {
//            Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJws(authToken);
//            return true;
//        } catch (MalformedJwtException ex) {
//            ex.printStackTrace();
//        } catch (ExpiredJwtException ex) {
//            ex.printStackTrace();
//        } catch (UnsupportedJwtException ex) {
//            ex.printStackTrace();
//        } catch (IllegalArgumentException ex) {
//            ex.printStackTrace();
//        }
//        return false;
//    }
//}
