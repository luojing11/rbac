package com.qf.rbac.config;

import com.qf.rbac.entity.dto.LoginDTO;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebExchangeBindException;

import javax.crypto.SecretKey;
import java.util.Calendar;
import java.util.Date;

@Component
public class JwtConfig{

        @Value("${config.jwt.secret}")  //ashdjakhsdhaslkdhalsjdlasjdlaksjdlkasjdlasjdlkasdjlasjdaslkdjasl1
        private String secret;
        @Value("${config.jwt.expire}")  // 600
        private long expire;

        /**
         *  把LoginDTO 加密成jwt
         */
        public  String generateJwt(LoginDTO member){

            // 加密
            byte[] keyBytes = secret.getBytes();
            // 获得密钥对象
            SecretKey key = Keys.hmacShaKeyFor(keyBytes);
            System.out.println(key);
            String token = Jwts.builder()
                    .setHeaderParam("typ", "JWT") //令牌类型
                    //.setHeaderParam("alg", "HS256") //签名算法
                    .setIssuedAt(new Date()) //签发时间
                    .setExpiration(new Date(System.currentTimeMillis() + expire*1000)) //过期时间
                    .signWith(key, SignatureAlgorithm.HS256).compact();

            return token;
        }

        /**
         * 解析jwt
         * @param jwtToken
         * @return
         */
        public  LoginDTO checkJwt(String jwtToken){

            Jws<Claims> claimsJws = Jwts.parser().setSigningKey(this.secret.getBytes()).parseClaimsJws(jwtToken);
            System.out.println(claimsJws);
            // map
            Claims claims = claimsJws.getBody();
            Long id = claims.get("id",Long.class);
            Integer roleid = claims.get("roleid",Integer.class);

            return LoginDTO.builder()
                    .build();
        }

}
