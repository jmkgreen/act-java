package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.EncodingUtils;

import com.act.client.swagger.model.ActWebApiModelsActivitiesActivityOccurrence;
import com.act.client.swagger.model.ActWebApiModelsActivitiesClearActivity;
import com.act.client.swagger.model.SystemObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public interface ActivitiesApi extends ApiClient.Api {


  /**
   * Delete an existing occurrence activity.
   * 
    * @param id The unique identifier (id) for a given occurrence activity. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/activities/{id}/clearactivity")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject activitiesDeleteActivityUnclearById(@Param("id") String id);

  /**
   * Delete an existing occurrence activity.
   * 
    * @param id The unique identifier (id) for a given occurrence activity. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/Activities/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject activitiesDeleteById(@Param("id") String id);

  /**
   * Disassociate a contact (if it is present) from an acitivity occurrence.
   * 
    * @param id The unique identifier (id) for a given occurrence activity. (required)
    * @param contactId The unique identifier (id) for a given contact that is associated with an activity occurence. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/activities/{id}/contacts/{contactId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject activitiesDeleteContactByIdAndContactId(@Param("id") String id, @Param("contactId") String contactId);

  /**
   * Get all occurrence activities matching an (optional) OData query.
   * 
   * @return List&lt;ActWebApiModelsActivitiesActivityOccurrence&gt;
   */
  @RequestLine("GET /api/Activities")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsActivitiesActivityOccurrence> activitiesGet();

  /**
   * Get all occurrence activities that are associated with a given contact and matching an (optional) OData query.
   * 
    * @param contactId The unique identifier (id) for a given contact that is associated with an activity occurence. (required)
   * @return List&lt;ActWebApiModelsActivitiesActivityOccurrence&gt;
   */
  @RequestLine("GET /api/contacts/{contactId}/activities")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsActivitiesActivityOccurrence> activitiesGetByContactAndContactId(@Param("contactId") String contactId);

  /**
   * Get a specific occurrence activity.
   * 
    * @param id The unique identifier (id) for a given occurrence activity. (required)
   * @return ActWebApiModelsActivitiesActivityOccurrence
   */
  @RequestLine("GET /api/Activities/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsActivitiesActivityOccurrence activitiesGetById(@Param("id") String id);

  /**
   * Partially update an already existing activity occurence  (Recur Spec will be ignored)
   * 
    * @param id The unique identifier (id) for a given occurrence activity. (required)
    * @param occurrence The occurrence activity definition. (required)
   * @return ActWebApiModelsActivitiesActivityOccurrence
   */
  @RequestLine("PATCH /api/Activities/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsActivitiesActivityOccurrence activitiesPatchById(@Param("id") String id, ActWebApiModelsActivitiesActivityOccurrence occurrence);

  /**
   * Create a new activity occurence (Recur Spec will be ignored).
   * 
    * @param occurrence The occurrence activity definition. (required)
   * @return ActWebApiModelsActivitiesActivityOccurrence
   */
  @RequestLine("POST /api/Activities")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsActivitiesActivityOccurrence activitiesPost(ActWebApiModelsActivitiesActivityOccurrence occurrence);

  /**
   * Create a new activity occurence on behalf of.
   * 
    * @param id The unique identifier (id) for the organizer (ScheduledFor). (required)
    * @param occurrence The occurrence activity definition. (required)
   * @return ActWebApiModelsActivitiesActivityOccurrence
   */
  @RequestLine("POST /api/organizers/{id}/activities")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsActivitiesActivityOccurrence activitiesPostById(@Param("id") String id, ActWebApiModelsActivitiesActivityOccurrence occurrence);

  /**
   * Clear an activity
   * 
    * @param id The unique identifier (id) for a given occurrence activity. (required)
    * @param activity The activity request body (required)
   * @return ActWebApiModelsActivitiesClearActivity
   */
  @RequestLine("PUT /api/activities/{id}/clearactivity")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsActivitiesClearActivity activitiesPutActivityClearById(@Param("id") String id, ActWebApiModelsActivitiesClearActivity activity);

  /**
   * Update an already existing activity occurence  (Recur Spec will be ignored)
   * 
    * @param id The unique identifier (id) for a given occurrence activity. (required)
    * @param occurrence The occurrence activity definition. (required)
   * @return ActWebApiModelsActivitiesActivityOccurrence
   */
  @RequestLine("PUT /api/Activities/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsActivitiesActivityOccurrence activitiesPutById(@Param("id") String id, ActWebApiModelsActivitiesActivityOccurrence occurrence);

  /**
   * Associate the contact (if it is not already present) to an acitivity occurrence.
   * 
    * @param id The unique identifier (id) for a given occurrence activity. (required)
    * @param contactId The unique identifier (id) for a given contact that is associated with an occurence activity. (required)
   * @return ActWebApiModelsActivitiesActivityOccurrence
   */
  @RequestLine("PUT /api/activities/{id}/contacts/{contactId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsActivitiesActivityOccurrence activitiesPutContactInActivityByIdAndContactId(@Param("id") String id, @Param("contactId") String contactId);

  /**
   * Modify the organizer (ScheduleFor) of an acitivity.
   * 
    * @param activityId The unique identifier (id) for a given occurrence activity. (required)
    * @param organizerId The unique identifier (id) for the organizer (ScheduledFor). (required)
   * @return SystemObject
   */
  @RequestLine("PUT /api/organizers/{organizerId}/activities/{activityId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject activitiesPutScheduleForAndActivityIdAndOrganizerId(@Param("activityId") String activityId, @Param("organizerId") String organizerId);
}
