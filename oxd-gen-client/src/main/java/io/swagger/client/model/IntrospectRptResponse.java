/*
 * oxd-server
 * oxd-server
 *
 * OpenAPI spec version: 4.0
 * Contact: yuriyz@gluu.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * IntrospectRptResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-13T06:19:07.893Z[GMT]")
public class IntrospectRptResponse {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("exp")
  private Long exp = null;

  @SerializedName("iat")
  private Long iat = null;

  @SerializedName("nbf")
  private Long nbf = null;

  @SerializedName("client_id")
  private String clientId = null;

  @SerializedName("sub")
  private String sub = null;

  @SerializedName("aud")
  private String aud = null;

  @SerializedName("iss")
  private String iss = null;

  @SerializedName("jti")
  private String jti = null;

  @SerializedName("permissions")
  private List<Object> permissions = new ArrayList<Object>();

  public IntrospectRptResponse active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @Schema(example = "true", required = true, description = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public IntrospectRptResponse exp(Long exp) {
    this.exp = exp;
    return this;
  }

   /**
   * number of seconds since January 1 1970 UTC, indicating when this token will expire
   * @return exp
  **/
  @Schema(example = "1535709072", required = true, description = "number of seconds since January 1 1970 UTC, indicating when this token will expire")
  public Long getExp() {
    return exp;
  }

  public void setExp(Long exp) {
    this.exp = exp;
  }

  public IntrospectRptResponse iat(Long iat) {
    this.iat = iat;
    return this;
  }

   /**
   * number of seconds since January 1 1970 UTC, indicating when the token was issued at
   * @return iat
  **/
  @Schema(example = "1535709072", required = true, description = "number of seconds since January 1 1970 UTC, indicating when the token was issued at")
  public Long getIat() {
    return iat;
  }

  public void setIat(Long iat) {
    this.iat = iat;
  }

  public IntrospectRptResponse nbf(Long nbf) {
    this.nbf = nbf;
    return this;
  }

   /**
   * number of seconds since January 1 1970 UTC, indicating when the token not to be used before
   * @return nbf
  **/
  @Schema(example = "1535709072", required = true, description = "number of seconds since January 1 1970 UTC, indicating when the token not to be used before")
  public Long getNbf() {
    return nbf;
  }

  public void setNbf(Long nbf) {
    this.nbf = nbf;
  }

  public IntrospectRptResponse clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @Schema(example = "@!DBE5.84F8.631A.9172!0001!CD07.49BE!0008!0ED4.C61D.6FA7.8F42", required = true, description = "")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public IntrospectRptResponse sub(String sub) {
    this.sub = sub;
    return this;
  }

   /**
   * Get sub
   * @return sub
  **/
  @Schema(description = "")
  public String getSub() {
    return sub;
  }

  public void setSub(String sub) {
    this.sub = sub;
  }

  public IntrospectRptResponse aud(String aud) {
    this.aud = aud;
    return this;
  }

   /**
   * Get aud
   * @return aud
  **/
  @Schema(example = "@!DBE5.84F8.631A.9172!0001!CD07.49BE!0008!0ED4.C61D.6FA7.8F42", required = true, description = "")
  public String getAud() {
    return aud;
  }

  public void setAud(String aud) {
    this.aud = aud;
  }

  public IntrospectRptResponse iss(String iss) {
    this.iss = iss;
    return this;
  }

   /**
   * Get iss
   * @return iss
  **/
  @Schema(example = "http://as.com", required = true, description = "")
  public String getIss() {
    return iss;
  }

  public void setIss(String iss) {
    this.iss = iss;
  }

  public IntrospectRptResponse jti(String jti) {
    this.jti = jti;
    return this;
  }

   /**
   * Get jti
   * @return jti
  **/
  @Schema(description = "")
  public String getJti() {
    return jti;
  }

  public void setJti(String jti) {
    this.jti = jti;
  }

  public IntrospectRptResponse permissions(List<Object> permissions) {
    this.permissions = permissions;
    return this;
  }

  public IntrospectRptResponse addPermissionsItem(Object permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @Schema(required = true, description = "")
  public List<Object> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Object> permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntrospectRptResponse introspectRptResponse = (IntrospectRptResponse) o;
    return Objects.equals(this.active, introspectRptResponse.active) &&
        Objects.equals(this.exp, introspectRptResponse.exp) &&
        Objects.equals(this.iat, introspectRptResponse.iat) &&
        Objects.equals(this.nbf, introspectRptResponse.nbf) &&
        Objects.equals(this.clientId, introspectRptResponse.clientId) &&
        Objects.equals(this.sub, introspectRptResponse.sub) &&
        Objects.equals(this.aud, introspectRptResponse.aud) &&
        Objects.equals(this.iss, introspectRptResponse.iss) &&
        Objects.equals(this.jti, introspectRptResponse.jti) &&
        Objects.equals(this.permissions, introspectRptResponse.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, exp, iat, nbf, clientId, sub, aud, iss, jti, permissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntrospectRptResponse {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
    sb.append("    iat: ").append(toIndentedString(iat)).append("\n");
    sb.append("    nbf: ").append(toIndentedString(nbf)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
    sb.append("    aud: ").append(toIndentedString(aud)).append("\n");
    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
    sb.append("    jti: ").append(toIndentedString(jti)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
