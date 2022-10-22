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
import java.net.URI;

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
 * Variant
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-22T18:08:52.595492+08:00[Asia/Hong_Kong]")
public class Variant {
  public static final String SERIALIZED_NAME_BIT_RATE = "bit_rate";
  @SerializedName(SERIALIZED_NAME_BIT_RATE)
  private Integer bitRate;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public Variant() {
  }

  public Variant bitRate(Integer bitRate) {
    
    this.bitRate = bitRate;
    return this;
  }

   /**
   * The bit rate of the media.
   * @return bitRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The bit rate of the media.")

  public Integer getBitRate() {
    return bitRate;
  }


  public void setBitRate(Integer bitRate) {
    this.bitRate = bitRate;
  }


  public Variant contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * The content type of the media.
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The content type of the media.")

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public Variant url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * The url to the media.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The url to the media.")

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Variant variant = (Variant) o;
    return Objects.equals(this.bitRate, variant.bitRate) &&
        Objects.equals(this.contentType, variant.contentType) &&
        Objects.equals(this.url, variant.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bitRate, contentType, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Variant {\n");
    sb.append("    bitRate: ").append(toIndentedString(bitRate)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("bit_rate");
    openapiFields.add("content_type");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Variant
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Variant.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Variant is not found in the empty JSON string", Variant.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Variant.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Variant` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("content_type") != null && !jsonObj.get("content_type").isJsonNull()) && !jsonObj.get("content_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_type").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Variant.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Variant' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Variant> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Variant.class));

       return (TypeAdapter<T>) new TypeAdapter<Variant>() {
           @Override
           public void write(JsonWriter out, Variant value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Variant read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Variant given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Variant
  * @throws IOException if the JSON string is invalid with respect to Variant
  */
  public static Variant fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Variant.class);
  }

 /**
  * Convert an instance of Variant to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

