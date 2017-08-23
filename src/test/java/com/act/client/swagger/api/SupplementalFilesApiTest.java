package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.model.ActWebApiModelsAttachmentsAttachment;
import java.io.File;
import com.act.client.swagger.model.SystemObject;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SupplementalFilesApi
 */
public class SupplementalFilesApiTest {

    private SupplementalFilesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(SupplementalFilesApi.class);
    }

    
    /**
     * Delete an existing activity attachment.
     *
     * 
     */
    @Test
    public void supplementalFilesDeleteByActivityByIdTest() {
        String id = null;
        // SystemObject response = api.supplementalFilesDeleteByActivityById(id);

        // TODO: test validations
    }

    
    /**
     * Delete an existing document attachment.
     *
     * 
     */
    @Test
    public void supplementalFilesDeleteByDocumentByIdTest() {
        String id = null;
        // SystemObject response = api.supplementalFilesDeleteByDocumentById(id);

        // TODO: test validations
    }

    
    /**
     * Delete an existing history attachment.
     *
     * 
     */
    @Test
    public void supplementalFilesDeleteByHistoryByIdTest() {
        String id = null;
        // SystemObject response = api.supplementalFilesDeleteByHistoryById(id);

        // TODO: test validations
    }

    
    /**
     * Delete an existing note attachment.
     *
     * 
     */
    @Test
    public void supplementalFilesDeleteByNoteByIdTest() {
        String id = null;
        // SystemObject response = api.supplementalFilesDeleteByNoteById(id);

        // TODO: test validations
    }

    
    /**
     * Get a specific activity attachment.
     *
     * 
     */
    @Test
    public void supplementalFilesGetByActivityByIdTest() {
        String id = null;
        // SystemObject response = api.supplementalFilesGetByActivityById(id);

        // TODO: test validations
    }

    
    /**
     * Get a specific document attachment.
     *
     * 
     */
    @Test
    public void supplementalFilesGetByDocumentByIdTest() {
        String id = null;
        // SystemObject response = api.supplementalFilesGetByDocumentById(id);

        // TODO: test validations
    }

    
    /**
     * Get a specific history attachment.
     *
     * 
     */
    @Test
    public void supplementalFilesGetByHistoryByIdTest() {
        String id = null;
        // SystemObject response = api.supplementalFilesGetByHistoryById(id);

        // TODO: test validations
    }

    
    /**
     * Get a specific note attachment.
     *
     * 
     */
    @Test
    public void supplementalFilesGetByNoteByIdTest() {
        String id = null;
        // SystemObject response = api.supplementalFilesGetByNoteById(id);

        // TODO: test validations
    }

    
    /**
     * Create a new activity attachment.
     *
     * 
     */
    @Test
    public void supplementalFilesPostActivityAttachmentByIdTest() {
        String id = null;
        File file = null;
        // ActWebApiModelsAttachmentsAttachment response = api.supplementalFilesPostActivityAttachmentById(id, file);

        // TODO: test validations
    }

    
    /**
     * Create a new document attachment.
     *
     * 
     */
    @Test
    public void supplementalFilesPostDocumentAttachmentsByIdTest() {
        String id = null;
        // ActWebApiModelsAttachmentsAttachment response = api.supplementalFilesPostDocumentAttachmentsById(id);

        // TODO: test validations
    }

    
    /**
     * Create a new history attachment.
     *
     * 
     */
    @Test
    public void supplementalFilesPostHistoryAttachmentsByIdTest() {
        String id = null;
        File file = null;
        // ActWebApiModelsAttachmentsAttachment response = api.supplementalFilesPostHistoryAttachmentsById(id, file);

        // TODO: test validations
    }

    
    /**
     * Create a new note attachment.
     *
     * 
     */
    @Test
    public void supplementalFilesPostNoteAttachmentsByIdTest() {
        String id = null;
        File file = null;
        // ActWebApiModelsAttachmentsAttachment response = api.supplementalFilesPostNoteAttachmentsById(id, file);

        // TODO: test validations
    }

    
}
