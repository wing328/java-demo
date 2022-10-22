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
import org.openapitools.client.model.Geo;
import org.openapitools.client.model.PlaceType;

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
 * Place
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-22T18:08:52.595492+08:00[Asia/Hong_Kong]")
public class Place {
  public static final String SERIALIZED_NAME_CONTAINED_WITHIN = "contained_within";
  @SerializedName(SERIALIZED_NAME_CONTAINED_WITHIN)
  private List<String> containedWithin = null;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_FULL_NAME = "full_name";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_GEO = "geo";
  @SerializedName(SERIALIZED_NAME_GEO)
  private Geo geo;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PLACE_TYPE = "place_type";
  @SerializedName(SERIALIZED_NAME_PLACE_TYPE)
  private PlaceType placeType;

  public Place() {
  }

  public Place containedWithin(List<String> containedWithin) {
    
    this.containedWithin = containedWithin;
    return this;
  }

  public Place addContainedWithinItem(String containedWithinItem) {
    if (this.containedWithin == null) {
      this.containedWithin = new ArrayList<>();
    }
    this.containedWithin.add(containedWithinItem);
    return this;
  }

   /**
   * Get containedWithin
   * @return containedWithin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getContainedWithin() {
    return containedWithin;
  }


  public void setContainedWithin(List<String> containedWithin) {
    this.containedWithin = containedWithin;
  }


  public Place country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The full name of the county in which this place exists.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "United States", value = "The full name of the county in which this place exists.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public Place countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * A two-letter ISO 3166-1 alpha-2 country code.
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "A two-letter ISO 3166-1 alpha-2 country code.")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public Place fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * The full name of this place.
   * @return fullName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Lakewood, CO", required = true, value = "The full name of this place.")

  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public Place geo(Geo geo) {
    
    this.geo = geo;
    return this;
  }

   /**
   * Get geo
   * @return geo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Geo getGeo() {
    return geo;
  }


  public void setGeo(Geo geo) {
    this.geo = geo;
  }


  public Place id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The identifier for this place.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "f7eb2fa2fea288b1", required = true, value = "The identifier for this place.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Place name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The human readable name of this place.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lakewood", value = "The human readable name of this place.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Place placeType(PlaceType placeType) {
    
    this.placeType = placeType;
    return this;
  }

   /**
   * Get placeType
   * @return placeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PlaceType getPlaceType() {
    return placeType;
  }


  public void setPlaceType(PlaceType placeType) {
    this.placeType = placeType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Place place = (Place) o;
    return Objects.equals(this.containedWithin, place.containedWithin) &&
        Objects.equals(this.country, place.country) &&
        Objects.equals(this.countryCode, place.countryCode) &&
        Objects.equals(this.fullName, place.fullName) &&
        Objects.equals(this.geo, place.geo) &&
        Objects.equals(this.id, place.id) &&
        Objects.equals(this.name, place.name) &&
        Objects.equals(this.placeType, place.placeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containedWithin, country, countryCode, fullName, geo, id, name, placeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Place {\n");
    sb.append("    containedWithin: ").append(toIndentedString(containedWithin)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    geo: ").append(toIndentedString(geo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    placeType: ").append(toIndentedString(placeType)).append("\n");
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
    openapiFields.add("contained_within");
    openapiFields.add("country");
    openapiFields.add("country_code");
    openapiFields.add("full_name");
    openapiFields.add("geo");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("place_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("full_name");
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Place
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Place.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Place is not found in the empty JSON string", Place.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Place.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Place` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Place.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("contained_within").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `contained_within` to be an array in the JSON string but got `%s`", jsonObj.get("contained_within").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("country_code") != null && !jsonObj.get("country_code").isJsonNull()) && !jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
      if (!jsonObj.get("full_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_name").toString()));
      }
      // validate the optional field `geo`
      if (jsonObj.get("geo") != null && !jsonObj.get("geo").isJsonNull()) {
        Geo.validateJsonObject(jsonObj.getAsJsonObject("geo"));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Place.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Place' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Place> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Place.class));

       return (TypeAdapter<T>) new TypeAdapter<Place>() {
           @Override
           public void write(JsonWriter out, Place value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Place read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Place given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Place
  * @throws IOException if the JSON string is invalid with respect to Place
  */
  public static Place fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Place.class);
  }

 /**
  * Convert an instance of Place to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

