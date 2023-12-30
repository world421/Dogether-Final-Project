package com.ictedu.dogether.oauth.naver;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class NaverTokens {

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("refresh_token")
    private String refreshToken;

    @JsonProperty("token_type")
    private String tokenType;

    @JsonProperty("expires_in")
    private String expiresIn;

}
