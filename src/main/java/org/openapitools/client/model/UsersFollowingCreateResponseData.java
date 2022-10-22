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
 * UsersFollowingCreateResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-22T18:08:52.595492+08:00[Asia/Hong_Kong]")
public class UsersFollowingCreateResponseData {
  public static final String SERIALIZED_NAME_FOLLOWING = "following";
  @SerializedName(SERIALIZED_NAME_FOLLOWING)
  private Boolean following;

  public static final String SERIALIZED_NAME_PENDING_FOLLOW = "pending_follow";
  @SerializedName(SERIALIZED_NAME_PENDING_FOLLOW)
  private Boolean pendingFollow;

  public UsersFollowingCreateResponseData() {
  }

  public UsersFollowingCreateResponseData following(Boolean following) {
    
    this.following = following;
    return this;
  }

   /**
   * Get following
   * @return following
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getFollowing() {
    return following;
  }


  public void setFollowing(Boolean following) {
    this.following = following;
  }


  public UsersFollowingCreateResponseData pendingFollow(Boolean pendingFollow) {
    
    this.pendingFollow = pendingFollow;
    return this;
  }

   /**
   * Get pendingFollow
   * @return pendingFollow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPendingFollow() {
    return pendingFollow;
  }


  public void setPendingFollow(Boolean pendingFollow) {
    this.pendingFollow = pendingFollow;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersFollowingCreateResponseData usersFollowingCreateResponseData = (UsersFollowingCreateResponseData) o;
    return Objects.equals(this.following, usersFollowingCreateResponseData.following) &&
        Objects.equals(this.pendingFollow, usersFollowingCreateResponseData.pendingFollow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(following, pendingFollow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersFollowingCreateResponseData {\n");
    sb.append("    following: ").append(toIndentedString(following)).append("\n");
    sb.append("    pendingFollow: ").append(toIndentedString(pendingFollow)).append("\n");
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
    openapiFields.add("following");
    openapiFields.add("pending_follow");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UsersFollowingCreateResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UsersFollowingCreateResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsersFollowingCreateResponseData is not found in the empty JSON string", UsersFollowingCreateResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UsersFollowingCreateResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UsersFollowingCreateResponseData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsersFollowingCreateResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsersFollowingCreateResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsersFollowingCreateResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsersFollowingCreateResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<UsersFollowingCreateResponseData>() {
           @Override
           public void write(JsonWriter out, UsersFollowingCreateResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UsersFollowingCreateResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UsersFollowingCreateResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UsersFollowingCreateResponseData
  * @throws IOException if the JSON string is invalid with respect to UsersFollowingCreateResponseData
  */
  public static UsersFollowingCreateResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsersFollowingCreateResponseData.class);
  }

 /**
  * Convert an instance of UsersFollowingCreateResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
