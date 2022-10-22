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
import org.openapitools.client.model.TweetTakedownComplianceSchema;

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
 * TweetWithheldComplianceSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TweetWithheldComplianceSchema {
  public static final String SERIALIZED_NAME_WITHHELD = "withheld";
  @SerializedName(SERIALIZED_NAME_WITHHELD)
  private TweetTakedownComplianceSchema withheld;

  public TweetWithheldComplianceSchema() {
  }

  public TweetWithheldComplianceSchema withheld(TweetTakedownComplianceSchema withheld) {
    
    this.withheld = withheld;
    return this;
  }

   /**
   * Get withheld
   * @return withheld
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TweetTakedownComplianceSchema getWithheld() {
    return withheld;
  }


  public void setWithheld(TweetTakedownComplianceSchema withheld) {
    this.withheld = withheld;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TweetWithheldComplianceSchema tweetWithheldComplianceSchema = (TweetWithheldComplianceSchema) o;
    return Objects.equals(this.withheld, tweetWithheldComplianceSchema.withheld);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withheld);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TweetWithheldComplianceSchema {\n");
    sb.append("    withheld: ").append(toIndentedString(withheld)).append("\n");
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
    openapiFields.add("withheld");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("withheld");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TweetWithheldComplianceSchema
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TweetWithheldComplianceSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TweetWithheldComplianceSchema is not found in the empty JSON string", TweetWithheldComplianceSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TweetWithheldComplianceSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TweetWithheldComplianceSchema` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TweetWithheldComplianceSchema.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `withheld`
      TweetTakedownComplianceSchema.validateJsonObject(jsonObj.getAsJsonObject("withheld"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TweetWithheldComplianceSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TweetWithheldComplianceSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TweetWithheldComplianceSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TweetWithheldComplianceSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<TweetWithheldComplianceSchema>() {
           @Override
           public void write(JsonWriter out, TweetWithheldComplianceSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TweetWithheldComplianceSchema read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TweetWithheldComplianceSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TweetWithheldComplianceSchema
  * @throws IOException if the JSON string is invalid with respect to TweetWithheldComplianceSchema
  */
  public static TweetWithheldComplianceSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TweetWithheldComplianceSchema.class);
  }

 /**
  * Convert an instance of TweetWithheldComplianceSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

