package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.EncodingUtils;

import com.act.client.swagger.model.ActWebApiModelsNotesNote;
import com.act.client.swagger.model.SystemObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public interface NotesApi extends ApiClient.Api {


  /**
   * Delete an existing note.
   * 
    * @param id The unique identifier (id) for a given note. (required)
    * @param contactId The unique identifier (id) for a given contact that is associated with a note. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/contacts/{contactId}/notes/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject notesDeleteByIdAndContactId(@Param("id") String id, @Param("contactId") String contactId);

  /**
   * Disassociate a contact (if it is present) from a note.
   * 
    * @param id The unique identifier (id) for a given note. (required)
    * @param contactId The unique identifier (id) for a given contact that is associated with history item. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/notes/{id}/contacts/{contactId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject notesDeleteContactByIdAndContactId(@Param("id") String id, @Param("contactId") String contactId);

  /**
   * Get all notes that are associated with a given company and matching an (optional) OData query.
   * 
    * @param id The unique identifier (id) for a given company that is associated with a note. (required)
   * @return List&lt;ActWebApiModelsNotesNote&gt;
   */
  @RequestLine("GET /api/companies/{id}/notes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsNotesNote> notesGetByCompaniesById(@Param("id") String id);

  /**
   * Get all notes that are associated with a given contact and matching an (optional) OData query.
   * 
    * @param id The unique identifier (id) for a given contact that is associated with a note. (required)
   * @return List&lt;ActWebApiModelsNotesNote&gt;
   */
  @RequestLine("GET /api/contacts/{id}/notes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsNotesNote> notesGetByContactById(@Param("id") String id);

  /**
   * Get all notes that are associated with a given group and matching an (optional) OData query.
   * 
    * @param id The unique identifier (id) for a given group that is associated with a note. (required)
   * @return List&lt;ActWebApiModelsNotesNote&gt;
   */
  @RequestLine("GET /api/group/{id}/notes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsNotesNote> notesGetByGroupById(@Param("id") String id);

  /**
   * Get all notes matching an (optional) OData query and assoicated with a contact.
   * 
    * @param id The unique identifier (id) for a given note. (required)
   * @return ActWebApiModelsNotesNote
   */
  @RequestLine("GET /api/Notes/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsNotesNote notesGetById(@Param("id") String id);

  /**
   * Get all notes that are associated with a given opportunity and matching an (optional) OData query.
   * 
    * @param id The unique identifier (id) for a given opportunity that is associated with a note. (required)
   * @return List&lt;ActWebApiModelsNotesNote&gt;
   */
  @RequestLine("GET /api/opportunity/{id}/notes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsNotesNote> notesGetByOpportunityById(@Param("id") String id);

  /**
   * Update an already existing note
   * 
    * @param id The unique identifier (id) for a given note. (required)
    * @param note The note definition. (required)
   * @return ActWebApiModelsNotesNote
   */
  @RequestLine("PATCH /api/Notes/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsNotesNote notesPatchById(@Param("id") String id, ActWebApiModelsNotesNote note);

  /**
   * Create a new note.
   * 
    * @param note The note definition. (required)
   * @return ActWebApiModelsNotesNote
   */
  @RequestLine("POST /api/Notes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsNotesNote notesPost(ActWebApiModelsNotesNote note);

  /**
   * Update an already existing note
   * 
    * @param id The unique identifier (id) for a given note. (required)
    * @param note The note definition. (required)
   * @return ActWebApiModelsNotesNote
   */
  @RequestLine("PUT /api/Notes/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsNotesNote notesPutById(@Param("id") String id, ActWebApiModelsNotesNote note);

  /**
   * Associate the contact (if it is not already present) to a note.
   * 
    * @param id The unique identifier (id) for a given note. (required)
    * @param contactId The unique identifier (id) for a given contact that is associated with a history item. (required)
   * @return ActWebApiModelsNotesNote
   */
  @RequestLine("PUT /api/notes/{id}/contacts/{contactId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsNotesNote notesPutContactInNoteByIdAndContactId(@Param("id") String id, @Param("contactId") String contactId);
}
