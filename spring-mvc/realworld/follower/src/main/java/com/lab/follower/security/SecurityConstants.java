package com.lab.follower.security;

public class SecurityConstants {

    //the JWT secret should be injected in the env variables and not set in code
    public static final String SECRET = "GeneratedSecretToEncodeAndDecodeJWT";
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String SIGN_UP_URL = "/users/sign-up";

}
