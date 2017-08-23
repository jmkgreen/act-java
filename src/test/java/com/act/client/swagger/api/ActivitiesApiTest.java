package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.model.ActWebApiModelsActivitiesActivityOccurrence;
import com.act.client.swagger.model.ActWebApiModelsActivitiesClearActivity;
import com.act.client.swagger.model.SystemObject;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ActivitiesApi
 */
public class ActivitiesApiTest {

    private ActivitiesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ActivitiesApi.class);
    }

    
    /**
     * Delete an existing occurrence activity.
     *
     * 
     */
    @Test
    public void activitiesDeleteActivityUnclearByIdTest() {
        String id = null;
        // SystemObject response = api.activitiesDeleteActivityUnclearById(id);

        // TODO: test validations
    }

    
    /**
     * Delete an existing occurrence activity.
     *
     * 
     */
    @Test
    public void activitiesDeleteByIdTest() {
        String id = null;
        // SystemObject response = api.activitiesDeleteById(id);

        // TODO: test validations
    }

    
    /**
     * Disassociate a contact (if it is present) from an acitivity occurrence.
     *
     * 
     */
    @Test
    public void activitiesDeleteContactByIdAndContactIdTest() {
        String id = null;
        String contactId = null;
        // SystemObject response = api.activitiesDeleteContactByIdAndContactId(id, contactId);

        // TODO: test validations
    }

    
    /**
     * Get all occurrence activities matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void activitiesGetTest() {
        // List<ActWebApiModelsActivitiesActivityOccurrence> response = api.activitiesGet();

        // TODO: test validations
    }

    
    /**
     * Get all occurrence activities that are associated with a given contact and matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void activitiesGetByContactAndContactIdTest() {
        String contactId = null;
        // List<ActWebApiModelsActivitiesActivityOccurrence> response = api.activitiesGetByContactAndContactId(contactId);

        // TODO: test validations
    }

    
    /**
     * Get a specific occurrence activity.
     *
     * 
     */
    @Test
    public void activitiesGetByIdTest() {
        String id = null;
        // ActWebApiModelsActivitiesActivityOccurrence response = api.activitiesGetById(id);

        // TODO: test validations
    }

    
    /**
     * Partially update an already existing activity occurence  (Recur Spec will be ignored)
     *
     * 
     */
    @Test
    public void activitiesPatchByIdTest() {
        String id = null;
        ActWebApiModelsActivitiesActivityOccurrence occurrence = null;
        // ActWebApiModelsActivitiesActivityOccurrence response = api.activitiesPatchById(id, occurrence);

        // TODO: test validations
    }

    
    /**
     * Create a new activity occurence (Recur Spec will be ignored).
     *
     * 
     */
    @Test
    public void activitiesPostTest() {
        ActWebApiModelsActivitiesActivityOccurrence occurrence = null;
        // ActWebApiModelsActivitiesActivityOccurrence response = api.activitiesPost(occurrence);

        // TODO: test validations
    }

    
    /**
     * Create a new activity occurence on behalf of.
     *
     * 
     */
    @Test
    public void activitiesPostByIdTest() {
        String id = null;
        ActWebApiModelsActivitiesActivityOccurrence occurrence = null;
        // ActWebApiModelsActivitiesActivityOccurrence response = api.activitiesPostById(id, occurrence);

        // TODO: test validations
    }

    
    /**
     * Clear an activity
     *
     * 
     */
    @Test
    public void activitiesPutActivityClearByIdTest() {
        String id = null;
        ActWebApiModelsActivitiesClearActivity activity = null;
        // ActWebApiModelsActivitiesClearActivity response = api.activitiesPutActivityClearById(id, activity);

        // TODO: test validations
    }

    
    /**
     * Update an already existing activity occurence  (Recur Spec will be ignored)
     *
     * 
     */
    @Test
    public void activitiesPutByIdTest() {
        String id = null;
        ActWebApiModelsActivitiesActivityOccurrence occurrence = null;
        // ActWebApiModelsActivitiesActivityOccurrence response = api.activitiesPutById(id, occurrence);

        // TODO: test validations
    }

    
    /**
     * Associate the contact (if it is not already present) to an acitivity occurrence.
     *
     * 
     */
    @Test
    public void activitiesPutContactInActivityByIdAndContactIdTest() {
        String id = null;
        String contactId = null;
        // ActWebApiModelsActivitiesActivityOccurrence response = api.activitiesPutContactInActivityByIdAndContactId(id, contactId);

        // TODO: test validations
    }

    
    /**
     * Modify the organizer (ScheduleFor) of an acitivity.
     *
     * 
     */
    @Test
    public void activitiesPutScheduleForAndActivityIdAndOrganizerIdTest() {
        String activityId = null;
        String organizerId = null;
        // SystemObject response = api.activitiesPutScheduleForAndActivityIdAndOrganizerId(activityId, organizerId);

        // TODO: test validations
    }

    
}
