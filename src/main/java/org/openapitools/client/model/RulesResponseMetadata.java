/*
 * Twitter API v2
 * Twitter API v2 available endpoints
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.RulesRequestSummary;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * RulesResponseMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-22T18:08:52.595492+08:00[Asia/Hong_Kong]")
public class RulesResponseMetadata {
  public static final String SERIALIZED_NAME_NEXT_TOKEN = "next_token";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public static final String SERIALIZED_NAME_RESULT_COUNT = "result_count";
  @SerializedName(SERIALIZED_NAME_RESULT_COUNT)
  private Integer resultCount;

  public static final String SERIALIZED_NAME_SENT = "sent";
  @SerializedName(SERIALIZED_NAME_SENT)
  private String sent;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private RulesRequestSummary summary;

  public RulesResponseMetadata() {
  }

  public RulesResponseMetadata nextToken(String nextToken) {
    
    this.nextToken = nextToken;
    return this;
  }

   /**
   * The next token.
   * @return nextToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The next token.")

  public String getNextToken() {
    return nextToken;
  }


  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  public RulesResponseMetadata resultCount(Integer resultCount) {
    
    this.resultCount = resultCount;
    return this;
  }

   /**
   * Number of Rules in result set.
   * @return resultCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of Rules in result set.")

  public Integer getResultCount() {
    return resultCount;
  }


  public void setResultCount(Integer resultCount) {
    this.resultCount = resultCount;
  }


  public RulesResponseMetadata sent(String sent) {
    
    this.sent = sent;
    return this;
  }

   /**
   * Get sent
   * @return sent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSent() {
    return sent;
  }


  public void setSent(String sent) {
    this.sent = sent;
  }


  public RulesResponseMetadata summary(RulesRequestSummary summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RulesRequestSummary getSummary() {
    return summary;
  }


  public void setSummary(RulesRequestSummary summary) {
    this.summary = summary;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RulesResponseMetadata rulesResponseMetadata = (RulesResponseMetadata) o;
    return Objects.equals(this.nextToken, rulesResponseMetadata.nextToken) &&
        Objects.equals(this.resultCount, rulesResponseMetadata.resultCount) &&
        Objects.equals(this.sent, rulesResponseMetadata.sent) &&
        Objects.equals(this.summary, rulesResponseMetadata.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextToken, resultCount, sent, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RulesResponseMetadata {\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    resultCount: ").append(toIndentedString(resultCount)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("next_token");
    openapiFields.add("result_count");
    openapiFields.add("sent");
    openapiFields.add("summary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sent");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RulesResponseMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RulesResponseMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RulesResponseMetadata is not found in the empty JSON string", RulesResponseMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RulesResponseMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RulesResponseMetadata` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RulesResponseMetadata.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("next_token") != null && !jsonObj.get("next_token").isJsonNull()) && !jsonObj.get("next_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_token").toString()));
      }
      if (!jsonObj.get("sent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sent").toString()));
      }
      // validate the optional field `summary`
      if (jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) {
        RulesRequestSummary.validateJsonObject(jsonObj.getAsJsonObject("summary"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RulesResponseMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RulesResponseMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RulesResponseMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RulesResponseMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<RulesResponseMetadata>() {
           @Override
           public void write(JsonWriter out, RulesResponseMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RulesResponseMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RulesResponseMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RulesResponseMetadata
  * @throws IOException if the JSON string is invalid with respect to RulesResponseMetadata
  */
  public static RulesResponseMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RulesResponseMetadata.class);
  }

 /**
  * Convert an instance of RulesResponseMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

