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
 * FieldUnauthorizedProblemAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FieldUnauthorizedProblemAllOf {
  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;

  /**
   * Gets or Sets resourceType
   */
  @JsonAdapter(ResourceTypeEnum.Adapter.class)
  public enum ResourceTypeEnum {
    USER("user"),
    
    TWEET("tweet"),
    
    MEDIA("media"),
    
    LIST("list"),
    
    SPACE("space");

    private String value;

    ResourceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResourceTypeEnum fromValue(String value) {
      for (ResourceTypeEnum b : ResourceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResourceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResourceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResourceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResourceTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private ResourceTypeEnum resourceType;

  /**
   * Gets or Sets section
   */
  @JsonAdapter(SectionEnum.Adapter.class)
  public enum SectionEnum {
    DATA("data"),
    
    INCLUDES("includes");

    private String value;

    SectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SectionEnum fromValue(String value) {
      for (SectionEnum b : SectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SectionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SectionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SECTION = "section";
  @SerializedName(SERIALIZED_NAME_SECTION)
  private SectionEnum section;

  public FieldUnauthorizedProblemAllOf() {
  }

  public FieldUnauthorizedProblemAllOf field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getField() {
    return field;
  }


  public void setField(String field) {
    this.field = field;
  }


  public FieldUnauthorizedProblemAllOf resourceType(ResourceTypeEnum resourceType) {
    
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }


  public void setResourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
  }


  public FieldUnauthorizedProblemAllOf section(SectionEnum section) {
    
    this.section = section;
    return this;
  }

   /**
   * Get section
   * @return section
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SectionEnum getSection() {
    return section;
  }


  public void setSection(SectionEnum section) {
    this.section = section;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldUnauthorizedProblemAllOf fieldUnauthorizedProblemAllOf = (FieldUnauthorizedProblemAllOf) o;
    return Objects.equals(this.field, fieldUnauthorizedProblemAllOf.field) &&
        Objects.equals(this.resourceType, fieldUnauthorizedProblemAllOf.resourceType) &&
        Objects.equals(this.section, fieldUnauthorizedProblemAllOf.section);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, resourceType, section);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldUnauthorizedProblemAllOf {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
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
    openapiFields.add("field");
    openapiFields.add("resource_type");
    openapiFields.add("section");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("field");
    openapiRequiredFields.add("resource_type");
    openapiRequiredFields.add("section");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FieldUnauthorizedProblemAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FieldUnauthorizedProblemAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FieldUnauthorizedProblemAllOf is not found in the empty JSON string", FieldUnauthorizedProblemAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FieldUnauthorizedProblemAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FieldUnauthorizedProblemAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FieldUnauthorizedProblemAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field").toString()));
      }
      if (!jsonObj.get("resource_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_type").toString()));
      }
      if (!jsonObj.get("section").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `section` to be a primitive type in the JSON string but got `%s`", jsonObj.get("section").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FieldUnauthorizedProblemAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FieldUnauthorizedProblemAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FieldUnauthorizedProblemAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FieldUnauthorizedProblemAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<FieldUnauthorizedProblemAllOf>() {
           @Override
           public void write(JsonWriter out, FieldUnauthorizedProblemAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FieldUnauthorizedProblemAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FieldUnauthorizedProblemAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FieldUnauthorizedProblemAllOf
  * @throws IOException if the JSON string is invalid with respect to FieldUnauthorizedProblemAllOf
  */
  public static FieldUnauthorizedProblemAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FieldUnauthorizedProblemAllOf.class);
  }

 /**
  * Convert an instance of FieldUnauthorizedProblemAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

