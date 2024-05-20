package com.muntu.muntuhabitat.Config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.OAuthFlow;
import io.swagger.v3.oas.annotations.security.OAuthFlows;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "MuntuHabitat",
                        email = "israa.neji8@gmail.com",
                        url = "https://MuntuHabitat.com.tn"
                ),
                description = "Application de suivre le chantier",
                title = "MuntuHabitat",
                version = "1.0",
                license = @License(
                        name = "License name",
                        url = "https://MuntuHabitat.com"
                ),
                termsOfService = "Terms of service"
        ),
        servers = {
                @Server(
                description = "Local ENV",
                url = "http://localhost:8080"
        ),
                @Server(
                        description = "PROD ENV",
                        url = "https://muntuHabitat.fr"
                )
        },
        security = {
                @SecurityRequirement(
                        name = "bearerAuth"
                )
        }
)
@SecurityScheme(
        name = "bearerAuth",
        description = "JWT auth description",
        scheme = "bearer",
        type = SecuritySchemeType.OAUTH2,
        flows = @OAuthFlows(
                clientCredentials =
                @OAuthFlow(
                        authorizationUrl = "http://localhost:9090/realms/MuntuHabitat/protocol/openid-connect/auth"
                )
        ),
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {
}