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
import org.openapitools.client.model.UserProfileModificationObjectSchema;

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
 * UserProfileModificationComplianceSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-22T18:08:52.595492+08:00[Asia/Hong_Kong]")
public class UserProfileModificationComplianceSchema {
  public static final String SERIALIZED_NAME_USER_PROFILE_MODIFICATION = "user_profile_modification";
  @SerializedName(SERIALIZED_NAME_USER_PROFILE_MODIFICATION)
  private UserProfileModificationObjectSchema userProfileModification;

  public UserProfileModificationComplianceSchema() {
  }

  public UserProfileModificationComplianceSchema userProfileModification(UserProfileModificationObjectSchema userProfileModification) {
    
    this.userProfileModification = userProfileModification;
    return this;
  }

   /**
   * Get userProfileModification
   * @return userProfileModification
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserProfileModificationObjectSchema getUserProfileModification() {
    return userProfileModification;
  }


  public void setUserProfileModification(UserProfileModificationObjectSchema userProfileModification) {
    this.userProfileModification = userProfileModification;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfileModificationComplianceSchema userProfileModificationComplianceSchema = (UserProfileModificationComplianceSchema) o;
    return Objects.equals(this.userProfileModification, userProfileModificationComplianceSchema.userProfileModification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userProfileModification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfileModificationComplianceSchema {\n");
    sb.append("    userProfileModification: ").append(toIndentedString(userProfileModification)).append("\n");
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
    openapiFields.add("user_profile_modification");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("user_profile_modification");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserProfileModificationComplianceSchema
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UserProfileModificationComplianceSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserProfileModificationComplianceSchema is not found in the empty JSON string", UserProfileModificationComplianceSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserProfileModificationComplianceSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserProfileModificationComplianceSchema` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserProfileModificationComplianceSchema.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `user_profile_modification`
      UserProfileModificationObjectSchema.validateJsonObject(jsonObj.getAsJsonObject("user_profile_modification"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserProfileModificationComplianceSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserProfileModificationComplianceSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserProfileModificationComplianceSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserProfileModificationComplianceSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<UserProfileModificationComplianceSchema>() {
           @Override
           public void write(JsonWriter out, UserProfileModificationComplianceSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserProfileModificationComplianceSchema read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserProfileModificationComplianceSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserProfileModificationComplianceSchema
  * @throws IOException if the JSON string is invalid with respect to UserProfileModificationComplianceSchema
  */
  public static UserProfileModificationComplianceSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserProfileModificationComplianceSchema.class);
  }

 /**
  * Convert an instance of UserProfileModificationComplianceSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
