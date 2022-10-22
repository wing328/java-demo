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
 * UserScrubGeoObjectSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserScrubGeoObjectSchema {
  public static final String SERIALIZED_NAME_EVENT_AT = "event_at";
  @SerializedName(SERIALIZED_NAME_EVENT_AT)
  private OffsetDateTime eventAt;

  public static final String SERIALIZED_NAME_UP_TO_TWEET_ID = "up_to_tweet_id";
  @SerializedName(SERIALIZED_NAME_UP_TO_TWEET_ID)
  private String upToTweetId;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private UserComplianceSchemaUser user;

  public UserScrubGeoObjectSchema() {
  }

  public UserScrubGeoObjectSchema eventAt(OffsetDateTime eventAt) {
    
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


  public UserScrubGeoObjectSchema upToTweetId(String upToTweetId) {
    
    this.upToTweetId = upToTweetId;
    return this;
  }

   /**
   * Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
   * @return upToTweetId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1346889436626259968", required = true, value = "Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.")

  public String getUpToTweetId() {
    return upToTweetId;
  }


  public void setUpToTweetId(String upToTweetId) {
    this.upToTweetId = upToTweetId;
  }


  public UserScrubGeoObjectSchema user(UserComplianceSchemaUser user) {
    
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
    UserScrubGeoObjectSchema userScrubGeoObjectSchema = (UserScrubGeoObjectSchema) o;
    return Objects.equals(this.eventAt, userScrubGeoObjectSchema.eventAt) &&
        Objects.equals(this.upToTweetId, userScrubGeoObjectSchema.upToTweetId) &&
        Objects.equals(this.user, userScrubGeoObjectSchema.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventAt, upToTweetId, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserScrubGeoObjectSchema {\n");
    sb.append("    eventAt: ").append(toIndentedString(eventAt)).append("\n");
    sb.append("    upToTweetId: ").append(toIndentedString(upToTweetId)).append("\n");
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
    openapiFields.add("up_to_tweet_id");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("event_at");
    openapiRequiredFields.add("up_to_tweet_id");
    openapiRequiredFields.add("user");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserScrubGeoObjectSchema
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UserScrubGeoObjectSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserScrubGeoObjectSchema is not found in the empty JSON string", UserScrubGeoObjectSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserScrubGeoObjectSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserScrubGeoObjectSchema` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserScrubGeoObjectSchema.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("up_to_tweet_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `up_to_tweet_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("up_to_tweet_id").toString()));
      }
      // validate the required field `user`
      UserComplianceSchemaUser.validateJsonObject(jsonObj.getAsJsonObject("user"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserScrubGeoObjectSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserScrubGeoObjectSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserScrubGeoObjectSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserScrubGeoObjectSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<UserScrubGeoObjectSchema>() {
           @Override
           public void write(JsonWriter out, UserScrubGeoObjectSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserScrubGeoObjectSchema read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserScrubGeoObjectSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserScrubGeoObjectSchema
  * @throws IOException if the JSON string is invalid with respect to UserScrubGeoObjectSchema
  */
  public static UserScrubGeoObjectSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserScrubGeoObjectSchema.class);
  }

 /**
  * Convert an instance of UserScrubGeoObjectSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

