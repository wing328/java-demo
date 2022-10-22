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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Point;

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
 * Geo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Geo {
  public static final String SERIALIZED_NAME_BBOX = "bbox";
  @SerializedName(SERIALIZED_NAME_BBOX)
  private List<Double> bbox = new ArrayList<>();

  public static final String SERIALIZED_NAME_GEOMETRY = "geometry";
  @SerializedName(SERIALIZED_NAME_GEOMETRY)
  private Point geometry;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Object properties;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    FEATURE("Feature");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public Geo() {
  }

  public Geo bbox(List<Double> bbox) {
    
    this.bbox = bbox;
    return this;
  }

  public Geo addBboxItem(Double bboxItem) {
    this.bbox.add(bboxItem);
    return this;
  }

   /**
   * Get bbox
   * @return bbox
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[-105.193475,39.60973,-105.053164,39.761974]", required = true, value = "")

  public List<Double> getBbox() {
    return bbox;
  }


  public void setBbox(List<Double> bbox) {
    this.bbox = bbox;
  }


  public Geo geometry(Point geometry) {
    
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Point getGeometry() {
    return geometry;
  }


  public void setGeometry(Point geometry) {
    this.geometry = geometry;
  }


  public Geo properties(Object properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Object getProperties() {
    return properties;
  }


  public void setProperties(Object properties) {
    this.properties = properties;
  }


  public Geo type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Geo geo = (Geo) o;
    return Objects.equals(this.bbox, geo.bbox) &&
        Objects.equals(this.geometry, geo.geometry) &&
        Objects.equals(this.properties, geo.properties) &&
        Objects.equals(this.type, geo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bbox, geometry, properties, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Geo {\n");
    sb.append("    bbox: ").append(toIndentedString(bbox)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("bbox");
    openapiFields.add("geometry");
    openapiFields.add("properties");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bbox");
    openapiRequiredFields.add("properties");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Geo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Geo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Geo is not found in the empty JSON string", Geo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Geo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Geo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Geo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("bbox") != null && !jsonObj.get("bbox").isJsonNull()) && !jsonObj.get("bbox").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bbox` to be an array in the JSON string but got `%s`", jsonObj.get("bbox").toString()));
      }
      // validate the optional field `geometry`
      if (jsonObj.get("geometry") != null && !jsonObj.get("geometry").isJsonNull()) {
        Point.validateJsonObject(jsonObj.getAsJsonObject("geometry"));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Geo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Geo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Geo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Geo.class));

       return (TypeAdapter<T>) new TypeAdapter<Geo>() {
           @Override
           public void write(JsonWriter out, Geo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Geo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Geo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Geo
  * @throws IOException if the JSON string is invalid with respect to Geo
  */
  public static Geo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Geo.class);
  }

 /**
  * Convert an instance of Geo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

