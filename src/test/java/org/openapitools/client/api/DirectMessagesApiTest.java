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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.CreateDmConversationRequest;
import org.openapitools.client.model.CreateDmEventResponse;
import org.openapitools.client.model.CreateMessageRequest;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.Get2DmConversationsIdDmEventsResponse;
import org.openapitools.client.model.Get2DmConversationsWithParticipantIdDmEventsResponse;
import org.openapitools.client.model.Get2DmEventsResponse;
import org.openapitools.client.model.Problem;
import java.util.Set;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DirectMessagesApi
 */
@Disabled
public class DirectMessagesApiTest {

    private final DirectMessagesApi api = new DirectMessagesApi();

    /**
     * Send a new message to a DM Conversation
     *
     * Creates a new message for a DM Conversation specified by DM Conversation ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dmConversationByIdEventIdCreateTest() throws ApiException {
        String dmConversationId = null;
        CreateMessageRequest createMessageRequest = null;
        CreateDmEventResponse response = api.dmConversationByIdEventIdCreate(dmConversationId, createMessageRequest);
        // TODO: test validations
    }

    /**
     * Create a new DM Conversation
     *
     * Creates a new DM Conversation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dmConversationIdCreateTest() throws ApiException {
        CreateDmConversationRequest createDmConversationRequest = null;
        CreateDmEventResponse response = api.dmConversationIdCreate(createDmConversationRequest);
        // TODO: test validations
    }

    /**
     * Send a new message to a user
     *
     * Creates a new message for a DM Conversation with a participant user by ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dmConversationWithUserEventIdCreateTest() throws ApiException {
        String participantId = null;
        CreateMessageRequest createMessageRequest = null;
        CreateDmEventResponse response = api.dmConversationWithUserEventIdCreate(participantId, createMessageRequest);
        // TODO: test validations
    }

    /**
     * Get DM Events for a DM Conversation
     *
     * Returns DM Events for a DM Conversation
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDmConversationsIdDmEventsTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> eventTypes = null;
        Set<String> dmEventFields = null;
        Set<String> expansions = null;
        Set<String> mediaFields = null;
        Set<String> userFields = null;
        Set<String> tweetFields = null;
        Get2DmConversationsIdDmEventsResponse response = api.getDmConversationsIdDmEvents(id, maxResults, paginationToken, eventTypes, dmEventFields, expansions, mediaFields, userFields, tweetFields);
        // TODO: test validations
    }

    /**
     * Get DM Events for a DM Conversation
     *
     * Returns DM Events for a DM Conversation
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDmConversationsWithParticipantIdDmEventsTest() throws ApiException {
        String participantId = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> eventTypes = null;
        Set<String> dmEventFields = null;
        Set<String> expansions = null;
        Set<String> mediaFields = null;
        Set<String> userFields = null;
        Set<String> tweetFields = null;
        Get2DmConversationsWithParticipantIdDmEventsResponse response = api.getDmConversationsWithParticipantIdDmEvents(participantId, maxResults, paginationToken, eventTypes, dmEventFields, expansions, mediaFields, userFields, tweetFields);
        // TODO: test validations
    }

    /**
     * Get recent DM Events
     *
     * Returns recent DM Events across DM conversations
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDmEventsTest() throws ApiException {
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> eventTypes = null;
        Set<String> dmEventFields = null;
        Set<String> expansions = null;
        Set<String> mediaFields = null;
        Set<String> userFields = null;
        Set<String> tweetFields = null;
        Get2DmEventsResponse response = api.getDmEvents(maxResults, paginationToken, eventTypes, dmEventFields, expansions, mediaFields, userFields, tweetFields);
        // TODO: test validations
    }

}
