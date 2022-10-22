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
import org.openapitools.client.model.CreateMessageRequest;

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
 * CreateDmConversationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateDmConversationRequest {
  /**
   * The conversation type that is being created.
   */
  @JsonAdapter(ConversationTypeEnum.Adapter.class)
  public enum ConversationTypeEnum {
    GROUP("Group");

    private String value;

    ConversationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConversationTypeEnum fromValue(String value) {
      for (ConversationTypeEnum b : ConversationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ConversationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConversationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConversationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ConversationTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONVERSATION_TYPE = "conversation_type";
  @SerializedName(SERIALIZED_NAME_CONVERSATION_TYPE)
  private ConversationTypeEnum conversationType;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private CreateMessageRequest message;

  public static final String SERIALIZED_NAME_PARTICIPANT_IDS = "participant_ids";
  @SerializedName(SERIALIZED_NAME_PARTICIPANT_IDS)
  private List<String> participantIds = new ArrayList<>();

  public CreateDmConversationRequest() {
  }

  public CreateDmConversationRequest conversationType(ConversationTypeEnum conversationType) {
    
    this.conversationType = conversationType;
    return this;
  }

   /**
   * The conversation type that is being created.
   * @return conversationType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The conversation type that is being created.")

  public ConversationTypeEnum getConversationType() {
    return conversationType;
  }


  public void setConversationType(ConversationTypeEnum conversationType) {
    this.conversationType = conversationType;
  }


  public CreateDmConversationRequest message(CreateMessageRequest message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CreateMessageRequest getMessage() {
    return message;
  }


  public void setMessage(CreateMessageRequest message) {
    this.message = message;
  }


  public CreateDmConversationRequest participantIds(List<String> participantIds) {
    
    this.participantIds = participantIds;
    return this;
  }

  public CreateDmConversationRequest addParticipantIdsItem(String participantIdsItem) {
    this.participantIds.add(participantIdsItem);
    return this;
  }

   /**
   * Participants for the DM Conversation.
   * @return participantIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Participants for the DM Conversation.")

  public List<String> getParticipantIds() {
    return participantIds;
  }


  public void setParticipantIds(List<String> participantIds) {
    this.participantIds = participantIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDmConversationRequest createDmConversationRequest = (CreateDmConversationRequest) o;
    return Objects.equals(this.conversationType, createDmConversationRequest.conversationType) &&
        Objects.equals(this.message, createDmConversationRequest.message) &&
        Objects.equals(this.participantIds, createDmConversationRequest.participantIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationType, message, participantIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDmConversationRequest {\n");
    sb.append("    conversationType: ").append(toIndentedString(conversationType)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    participantIds: ").append(toIndentedString(participantIds)).append("\n");
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
    openapiFields.add("conversation_type");
    openapiFields.add("message");
    openapiFields.add("participant_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("conversation_type");
    openapiRequiredFields.add("message");
    openapiRequiredFields.add("participant_ids");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateDmConversationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateDmConversationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateDmConversationRequest is not found in the empty JSON string", CreateDmConversationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateDmConversationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateDmConversationRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateDmConversationRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("conversation_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conversation_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conversation_type").toString()));
      }
      // validate the required field `message`
      CreateMessageRequest.validateJsonObject(jsonObj.getAsJsonObject("message"));
      // ensure the json data is an array
      if ((jsonObj.get("participant_ids") != null && !jsonObj.get("participant_ids").isJsonNull()) && !jsonObj.get("participant_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `participant_ids` to be an array in the JSON string but got `%s`", jsonObj.get("participant_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateDmConversationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateDmConversationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateDmConversationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateDmConversationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateDmConversationRequest>() {
           @Override
           public void write(JsonWriter out, CreateDmConversationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateDmConversationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateDmConversationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateDmConversationRequest
  * @throws IOException if the JSON string is invalid with respect to CreateDmConversationRequest
  */
  public static CreateDmConversationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateDmConversationRequest.class);
  }

 /**
  * Convert an instance of CreateDmConversationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

