package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.EncodingUtils;

import com.act.client.swagger.model.ActWebApiModelsAttachmentsAttachment;
import java.io.File;
import com.act.client.swagger.model.SystemObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public interface SupplementalFilesApi extends ApiClient.Api {


  /**
   * Delete an existing activity attachment.
   * 
    * @param id The unique identifier (id) for a given activity. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/attachments/activities/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject supplementalFilesDeleteByActivityById(@Param("id") String id);

  /**
   * Delete an existing document attachment.
   * 
    * @param id The unique identifier (id) for a given history item. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/attachments/documents/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject supplementalFilesDeleteByDocumentById(@Param("id") String id);

  /**
   * Delete an existing history attachment.
   * 
    * @param id The unique identifier (id) for a given history item. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/attachments/history/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject supplementalFilesDeleteByHistoryById(@Param("id") String id);

  /**
   * Delete an existing note attachment.
   * 
    * @param id The unique identifier (id) for a given note. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/attachments/notes/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject supplementalFilesDeleteByNoteById(@Param("id") String id);

  /**
   * Get a specific activity attachment.
   * 
    * @param id The unique identifier for the activity. (required)
   * @return SystemObject
   */
  @RequestLine("GET /api/attachments/activities/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject supplementalFilesGetByActivityById(@Param("id") String id);

  /**
   * Get a specific document attachment.
   * 
    * @param id The unique identifier for the history item. (required)
   * @return SystemObject
   */
  @RequestLine("GET /api/attachments/documents/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject supplementalFilesGetByDocumentById(@Param("id") String id);

  /**
   * Get a specific history attachment.
   * 
    * @param id The unique identifier for the history item. (required)
   * @return SystemObject
   */
  @RequestLine("GET /api/attachments/history/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject supplementalFilesGetByHistoryById(@Param("id") String id);

  /**
   * Get a specific note attachment.
   * 
    * @param id The unique identifier for the note. (required)
   * @return SystemObject
   */
  @RequestLine("GET /api/attachments/notes/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject supplementalFilesGetByNoteById(@Param("id") String id);

  /**
   * Create a new activity attachment.
   * 
    * @param id The unique identifier (id) for a given activity. (required)
    * @param file  (required)
   * @return ActWebApiModelsAttachmentsAttachment
   */
  @RequestLine("POST /api/attachments/activities/{id}")
  @Headers({
    "Content-Type: application/form-data",
    "Accept: application/json",
  })
  ActWebApiModelsAttachmentsAttachment supplementalFilesPostActivityAttachmentById(@Param("id") String id, @Param("file") File file);

  /**
   * Create a new document attachment.
   * 
    * @param id The unique identifier (id) for a given history item. (required)
   * @return ActWebApiModelsAttachmentsAttachment
   */
  @RequestLine("POST /api/attachments/documents/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsAttachmentsAttachment supplementalFilesPostDocumentAttachmentsById(@Param("id") String id);

  /**
   * Create a new history attachment.
   * 
    * @param id The unique identifier (id) for a given history item. (required)
    * @param file  (required)
   * @return ActWebApiModelsAttachmentsAttachment
   */
  @RequestLine("POST /api/attachments/history/{id}")
  @Headers({
    "Content-Type: application/form-data",
    "Accept: application/json",
  })
  ActWebApiModelsAttachmentsAttachment supplementalFilesPostHistoryAttachmentsById(@Param("id") String id, @Param("file") File file);

  /**
   * Create a new note attachment.
   * 
    * @param id The unique identifier (id) for a given note. (required)
    * @param file  (required)
   * @return ActWebApiModelsAttachmentsAttachment
   */
  @RequestLine("POST /api/attachments/notes/{id}")
  @Headers({
    "Content-Type: application/form-data",
    "Accept: application/json",
  })
  ActWebApiModelsAttachmentsAttachment supplementalFilesPostNoteAttachmentsById(@Param("id") String id, @Param("file") File file);
}
