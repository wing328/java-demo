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
import org.openapitools.client.model.UserTakedownComplianceSchema;

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
 * UserWithheldComplianceSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-22T18:08:52.595492+08:00[Asia/Hong_Kong]")
public class UserWithheldComplianceSchema {
  public static final String SERIALIZED_NAME_USER_WITHHELD = "user_withheld";
  @SerializedName(SERIALIZED_NAME_USER_WITHHELD)
  private UserTakedownComplianceSchema userWithheld;

  public UserWithheldComplianceSchema() {
  }

  public UserWithheldComplianceSchema userWithheld(UserTakedownComplianceSchema userWithheld) {
    
    this.userWithheld = userWithheld;
    return this;
  }

   /**
   * Get userWithheld
   * @return userWithheld
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserTakedownComplianceSchema getUserWithheld() {
    return userWithheld;
  }


  public void setUserWithheld(UserTakedownComplianceSchema userWithheld) {
    this.userWithheld = userWithheld;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserWithheldComplianceSchema userWithheldComplianceSchema = (UserWithheldComplianceSchema) o;
    return Objects.equals(this.userWithheld, userWithheldComplianceSchema.userWithheld);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userWithheld);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWithheldComplianceSchema {\n");
    sb.append("    userWithheld: ").append(toIndentedString(userWithheld)).append("\n");
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
    openapiFields.add("user_withheld");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("user_withheld");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserWithheldComplianceSchema
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UserWithheldComplianceSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserWithheldComplianceSchema is not found in the empty JSON string", UserWithheldComplianceSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserWithheldComplianceSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserWithheldComplianceSchema` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserWithheldComplianceSchema.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `user_withheld`
      UserTakedownComplianceSchema.validateJsonObject(jsonObj.getAsJsonObject("user_withheld"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserWithheldComplianceSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserWithheldComplianceSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserWithheldComplianceSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserWithheldComplianceSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<UserWithheldComplianceSchema>() {
           @Override
           public void write(JsonWriter out, UserWithheldComplianceSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserWithheldComplianceSchema read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserWithheldComplianceSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserWithheldComplianceSchema
  * @throws IOException if the JSON string is invalid with respect to UserWithheldComplianceSchema
  */
  public static UserWithheldComplianceSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserWithheldComplianceSchema.class);
  }

 /**
  * Convert an instance of UserWithheldComplianceSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

