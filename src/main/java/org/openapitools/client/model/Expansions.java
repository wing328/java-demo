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
import org.openapitools.client.model.Media;
import org.openapitools.client.model.Place;
import org.openapitools.client.model.Poll;
import org.openapitools.client.model.Topic;
import org.openapitools.client.model.Tweet;
import org.openapitools.client.model.User;

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
 * Expansions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-22T18:08:52.595492+08:00[Asia/Hong_Kong]")
public class Expansions {
  public static final String SERIALIZED_NAME_MEDIA = "media";
  @SerializedName(SERIALIZED_NAME_MEDIA)
  private List<Media> media = null;

  public static final String SERIALIZED_NAME_PLACES = "places";
  @SerializedName(SERIALIZED_NAME_PLACES)
  private List<Place> places = null;

  public static final String SERIALIZED_NAME_POLLS = "polls";
  @SerializedName(SERIALIZED_NAME_POLLS)
  private List<Poll> polls = null;

  public static final String SERIALIZED_NAME_TOPICS = "topics";
  @SerializedName(SERIALIZED_NAME_TOPICS)
  private List<Topic> topics = null;

  public static final String SERIALIZED_NAME_TWEETS = "tweets";
  @SerializedName(SERIALIZED_NAME_TWEETS)
  private List<Tweet> tweets = null;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<User> users = null;

  public Expansions() {
  }

  public Expansions media(List<Media> media) {
    
    this.media = media;
    return this;
  }

  public Expansions addMediaItem(Media mediaItem) {
    if (this.media == null) {
      this.media = new ArrayList<>();
    }
    this.media.add(mediaItem);
    return this;
  }

   /**
   * Get media
   * @return media
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Media> getMedia() {
    return media;
  }


  public void setMedia(List<Media> media) {
    this.media = media;
  }


  public Expansions places(List<Place> places) {
    
    this.places = places;
    return this;
  }

  public Expansions addPlacesItem(Place placesItem) {
    if (this.places == null) {
      this.places = new ArrayList<>();
    }
    this.places.add(placesItem);
    return this;
  }

   /**
   * Get places
   * @return places
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Place> getPlaces() {
    return places;
  }


  public void setPlaces(List<Place> places) {
    this.places = places;
  }


  public Expansions polls(List<Poll> polls) {
    
    this.polls = polls;
    return this;
  }

  public Expansions addPollsItem(Poll pollsItem) {
    if (this.polls == null) {
      this.polls = new ArrayList<>();
    }
    this.polls.add(pollsItem);
    return this;
  }

   /**
   * Get polls
   * @return polls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Poll> getPolls() {
    return polls;
  }


  public void setPolls(List<Poll> polls) {
    this.polls = polls;
  }


  public Expansions topics(List<Topic> topics) {
    
    this.topics = topics;
    return this;
  }

  public Expansions addTopicsItem(Topic topicsItem) {
    if (this.topics == null) {
      this.topics = new ArrayList<>();
    }
    this.topics.add(topicsItem);
    return this;
  }

   /**
   * Get topics
   * @return topics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Topic> getTopics() {
    return topics;
  }


  public void setTopics(List<Topic> topics) {
    this.topics = topics;
  }


  public Expansions tweets(List<Tweet> tweets) {
    
    this.tweets = tweets;
    return this;
  }

  public Expansions addTweetsItem(Tweet tweetsItem) {
    if (this.tweets == null) {
      this.tweets = new ArrayList<>();
    }
    this.tweets.add(tweetsItem);
    return this;
  }

   /**
   * Get tweets
   * @return tweets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Tweet> getTweets() {
    return tweets;
  }


  public void setTweets(List<Tweet> tweets) {
    this.tweets = tweets;
  }


  public Expansions users(List<User> users) {
    
    this.users = users;
    return this;
  }

  public Expansions addUsersItem(User usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<User> getUsers() {
    return users;
  }


  public void setUsers(List<User> users) {
    this.users = users;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Expansions expansions = (Expansions) o;
    return Objects.equals(this.media, expansions.media) &&
        Objects.equals(this.places, expansions.places) &&
        Objects.equals(this.polls, expansions.polls) &&
        Objects.equals(this.topics, expansions.topics) &&
        Objects.equals(this.tweets, expansions.tweets) &&
        Objects.equals(this.users, expansions.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(media, places, polls, topics, tweets, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Expansions {\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    places: ").append(toIndentedString(places)).append("\n");
    sb.append("    polls: ").append(toIndentedString(polls)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    tweets: ").append(toIndentedString(tweets)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
    openapiFields.add("media");
    openapiFields.add("places");
    openapiFields.add("polls");
    openapiFields.add("topics");
    openapiFields.add("tweets");
    openapiFields.add("users");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Expansions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Expansions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Expansions is not found in the empty JSON string", Expansions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Expansions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Expansions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("media") != null && !jsonObj.get("media").isJsonNull()) {
        JsonArray jsonArraymedia = jsonObj.getAsJsonArray("media");
        if (jsonArraymedia != null) {
          // ensure the json data is an array
          if (!jsonObj.get("media").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `media` to be an array in the JSON string but got `%s`", jsonObj.get("media").toString()));
          }

          // validate the optional field `media` (array)
          for (int i = 0; i < jsonArraymedia.size(); i++) {
            Media.validateJsonObject(jsonArraymedia.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("places") != null && !jsonObj.get("places").isJsonNull()) {
        JsonArray jsonArrayplaces = jsonObj.getAsJsonArray("places");
        if (jsonArrayplaces != null) {
          // ensure the json data is an array
          if (!jsonObj.get("places").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `places` to be an array in the JSON string but got `%s`", jsonObj.get("places").toString()));
          }

          // validate the optional field `places` (array)
          for (int i = 0; i < jsonArrayplaces.size(); i++) {
            Place.validateJsonObject(jsonArrayplaces.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("polls") != null && !jsonObj.get("polls").isJsonNull()) {
        JsonArray jsonArraypolls = jsonObj.getAsJsonArray("polls");
        if (jsonArraypolls != null) {
          // ensure the json data is an array
          if (!jsonObj.get("polls").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `polls` to be an array in the JSON string but got `%s`", jsonObj.get("polls").toString()));
          }

          // validate the optional field `polls` (array)
          for (int i = 0; i < jsonArraypolls.size(); i++) {
            Poll.validateJsonObject(jsonArraypolls.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("topics") != null && !jsonObj.get("topics").isJsonNull()) {
        JsonArray jsonArraytopics = jsonObj.getAsJsonArray("topics");
        if (jsonArraytopics != null) {
          // ensure the json data is an array
          if (!jsonObj.get("topics").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `topics` to be an array in the JSON string but got `%s`", jsonObj.get("topics").toString()));
          }

          // validate the optional field `topics` (array)
          for (int i = 0; i < jsonArraytopics.size(); i++) {
            Topic.validateJsonObject(jsonArraytopics.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("tweets") != null && !jsonObj.get("tweets").isJsonNull()) {
        JsonArray jsonArraytweets = jsonObj.getAsJsonArray("tweets");
        if (jsonArraytweets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tweets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tweets` to be an array in the JSON string but got `%s`", jsonObj.get("tweets").toString()));
          }

          // validate the optional field `tweets` (array)
          for (int i = 0; i < jsonArraytweets.size(); i++) {
            Tweet.validateJsonObject(jsonArraytweets.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("users") != null && !jsonObj.get("users").isJsonNull()) {
        JsonArray jsonArrayusers = jsonObj.getAsJsonArray("users");
        if (jsonArrayusers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("users").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `users` to be an array in the JSON string but got `%s`", jsonObj.get("users").toString()));
          }

          // validate the optional field `users` (array)
          for (int i = 0; i < jsonArrayusers.size(); i++) {
            User.validateJsonObject(jsonArrayusers.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Expansions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Expansions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Expansions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Expansions.class));

       return (TypeAdapter<T>) new TypeAdapter<Expansions>() {
           @Override
           public void write(JsonWriter out, Expansions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Expansions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Expansions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Expansions
  * @throws IOException if the JSON string is invalid with respect to Expansions
  */
  public static Expansions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Expansions.class);
  }

 /**
  * Convert an instance of Expansions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
