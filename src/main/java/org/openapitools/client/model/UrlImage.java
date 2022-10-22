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
 * Represent the information for the URL image.
 */
@ApiModel(description = "Represent the information for the URL image.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UrlImage {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public UrlImage() {
  }

  public UrlImage height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * The height of the media in pixels.
   * minimum: 0
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The height of the media in pixels.")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public UrlImage url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * A validly formatted URL.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://developer.twitter.com/en/docs/twitter-api", value = "A validly formatted URL.")

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    this.url = url;
  }


  public UrlImage width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * The width of the media in pixels.
   * minimum: 0
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The width of the media in pixels.")

  public Integer getWidth() {
    return width;
  }


  public void setWidth(Integer width) {
    this.width = width;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlImage urlImage = (UrlImage) o;
    return Objects.equals(this.height, urlImage.height) &&
        Objects.equals(this.url, urlImage.url) &&
        Objects.equals(this.width, urlImage.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, url, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlImage {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
    openapiFields.add("height");
    openapiFields.add("url");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UrlImage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UrlImage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UrlImage is not found in the empty JSON string", UrlImage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UrlImage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UrlImage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UrlImage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UrlImage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UrlImage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UrlImage.class));

       return (TypeAdapter<T>) new TypeAdapter<UrlImage>() {
           @Override
           public void write(JsonWriter out, UrlImage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UrlImage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UrlImage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UrlImage
  * @throws IOException if the JSON string is invalid with respect to UrlImage
  */
  public static UrlImage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UrlImage.class);
  }

 /**
  * Convert an instance of UrlImage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

