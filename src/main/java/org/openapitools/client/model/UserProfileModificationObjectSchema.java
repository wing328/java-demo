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
import java.time.OffsetDateTime;
import org.openapitools.client.model.UserComplianceSchemaUser;

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
 * UserProfileModificationObjectSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserProfileModificationObjectSchema {
  public static final String SERIALIZED_NAME_EVENT_AT = "event_at";
  @SerializedName(SERIALIZED_NAME_EVENT_AT)
  private OffsetDateTime eventAt;

  public static final String SERIALIZED_NAME_NEW_VALUE = "new_value";
  @SerializedName(SERIALIZED_NAME_NEW_VALUE)
  private String newValue;

  public static final String SERIALIZED_NAME_PROFILE_FIELD = "profile_field";
  @SerializedName(SERIALIZED_NAME_PROFILE_FIELD)
  private String profileField;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private UserComplianceSchemaUser user;

  public UserProfileModificationObjectSchema() {
  }

  public UserProfileModificationObjectSchema eventAt(OffsetDateTime eventAt) {
    
    this.eventAt = eventAt;
    return this;
  }

   /**
   * Event time.
   * @return eventAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2021-07-06T18:40:40Z", required = true, value = "Event time.")

  public OffsetDateTime getEventAt() {
    return eventAt;
  }


  public void setEventAt(OffsetDateTime eventAt) {
    this.eventAt = eventAt;
  }


  public UserProfileModificationObjectSchema newValue(String newValue) {
    
    this.newValue = newValue;
    return this;
  }

   /**
   * Get newValue
   * @return newValue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNewValue() {
    return newValue;
  }


  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }


  public UserProfileModificationObjectSchema profileField(String profileField) {
    
    this.profileField = profileField;
    return this;
  }

   /**
   * Get profileField
   * @return profileField
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getProfileField() {
    return profileField;
  }


  public void setProfileField(String profileField) {
    this.profileField = profileField;
  }


  public UserProfileModificationObjectSchema user(UserComplianceSchemaUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserComplianceSchemaUser getUser() {
    return user;
  }


  public void setUser(UserComplianceSchemaUser user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfileModificationObjectSchema userProfileModificationObjectSchema = (UserProfileModificationObjectSchema) o;
    return Objects.equals(this.eventAt, userProfileModificationObjectSchema.eventAt) &&
        Objects.equals(this.newValue, userProfileModificationObjectSchema.newValue) &&
        Objects.equals(this.profileField, userProfileModificationObjectSchema.profileField) &&
        Objects.equals(this.user, userProfileModificationObjectSchema.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventAt, newValue, profileField, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfileModificationObjectSchema {\n");
    sb.append("    eventAt: ").append(toIndentedString(eventAt)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    profileField: ").append(toIndentedString(profileField)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("event_at");
    openapiFields.add("new_value");
    openapiFields.add("profile_field");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("event_at");
    openapiRequiredFields.add("new_value");
    openapiRequiredFields.add("profile_field");
    openapiRequiredFields.add("user");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserProfileModificationObjectSchema
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UserProfileModificationObjectSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserProfileModificationObjectSchema is not found in the empty JSON string", UserProfileModificationObjectSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserProfileModificationObjectSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserProfileModificationObjectSchema` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserProfileModificationObjectSchema.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("new_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new_value").toString()));
      }
      if (!jsonObj.get("profile_field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile_field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile_field").toString()));
      }
      // validate the required field `user`
      UserComplianceSchemaUser.validateJsonObject(jsonObj.getAsJsonObject("user"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserProfileModificationObjectSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserProfileModificationObjectSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserProfileModificationObjectSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserProfileModificationObjectSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<UserProfileModificationObjectSchema>() {
           @Override
           public void write(JsonWriter out, UserProfileModificationObjectSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserProfileModificationObjectSchema read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserProfileModificationObjectSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserProfileModificationObjectSchema
  * @throws IOException if the JSON string is invalid with respect to UserProfileModificationObjectSchema
  */
  public static UserProfileModificationObjectSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserProfileModificationObjectSchema.class);
  }

 /**
  * Convert an instance of UserProfileModificationObjectSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

