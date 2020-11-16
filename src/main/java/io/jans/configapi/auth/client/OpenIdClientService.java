package io.jans.configapi.auth.client;

import com.fasterxml.jackson.databind.JsonNode;
import io.jans.as.model.common.IntrospectionResponse;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@RegisterRestClient(configKey = "opeinid_introspection_endpoint")
@ApplicationScoped
@Named("openIdClient")
@Path("/introspection")
public interface OpenIdClientService {

    @POST
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    IntrospectionResponse introspectToken(@HeaderParam("Authorization") String p_authorization,
            @FormParam("token") String p_token);

    @POST
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    String introspectTokenWithResponseAsJwt(@HeaderParam("Authorization") String p_authorization,
            @FormParam("token") String p_token, @FormParam("response_as_jwt") boolean responseAsJwt);

    @POST
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    JsonNode introspect(@HeaderParam("Authorization") String p_authorization, @FormParam("token") String p_token);

}
