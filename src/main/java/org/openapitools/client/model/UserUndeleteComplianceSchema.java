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
import org.openapitools.client.model.UserComplianceSchema;

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
 * UserUndeleteComplianceSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserUndeleteComplianceSchema {
  public static final String SERIALIZED_NAME_USER_UNDELETE = "user_undelete";
  @SerializedName(SERIALIZED_NAME_USER_UNDELETE)
  private UserComplianceSchema userUndelete;

  public UserUndeleteComplianceSchema() {
  }

  public UserUndeleteComplianceSchema userUndelete(UserComplianceSchema userUndelete) {
    
    this.userUndelete = userUndelete;
    return this;
  }

   /**
   * Get userUndelete
   * @return userUndelete
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserComplianceSchema getUserUndelete() {
    return userUndelete;
  }


  public void setUserUndelete(UserComplianceSchema userUndelete) {
    this.userUndelete = userUndelete;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUndeleteComplianceSchema userUndeleteComplianceSchema = (UserUndeleteComplianceSchema) o;
    return Objects.equals(this.userUndelete, userUndeleteComplianceSchema.userUndelete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userUndelete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUndeleteComplianceSchema {\n");
    sb.append("    userUndelete: ").append(toIndentedString(userUndelete)).append("\n");
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
    openapiFields.add("user_undelete");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("user_undelete");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserUndeleteComplianceSchema
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UserUndeleteComplianceSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserUndeleteComplianceSchema is not found in the empty JSON string", UserUndeleteComplianceSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserUndeleteComplianceSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserUndeleteComplianceSchema` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserUndeleteComplianceSchema.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `user_undelete`
      UserComplianceSchema.validateJsonObject(jsonObj.getAsJsonObject("user_undelete"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserUndeleteComplianceSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserUndeleteComplianceSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserUndeleteComplianceSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserUndeleteComplianceSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<UserUndeleteComplianceSchema>() {
           @Override
           public void write(JsonWriter out, UserUndeleteComplianceSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserUndeleteComplianceSchema read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserUndeleteComplianceSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserUndeleteComplianceSchema
  * @throws IOException if the JSON string is invalid with respect to UserUndeleteComplianceSchema
  */
  public static UserUndeleteComplianceSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserUndeleteComplianceSchema.class);
  }

 /**
  * Convert an instance of UserUndeleteComplianceSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

