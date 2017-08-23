package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.model.ActWebApiModelsNotesNote;
import com.act.client.swagger.model.SystemObject;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotesApi
 */
public class NotesApiTest {

    private NotesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(NotesApi.class);
    }

    
    /**
     * Delete an existing note.
     *
     * 
     */
    @Test
    public void notesDeleteByIdAndContactIdTest() {
        String id = null;
        String contactId = null;
        // SystemObject response = api.notesDeleteByIdAndContactId(id, contactId);

        // TODO: test validations
    }

    
    /**
     * Disassociate a contact (if it is present) from a note.
     *
     * 
     */
    @Test
    public void notesDeleteContactByIdAndContactIdTest() {
        String id = null;
        String contactId = null;
        // SystemObject response = api.notesDeleteContactByIdAndContactId(id, contactId);

        // TODO: test validations
    }

    
    /**
     * Get all notes that are associated with a given company and matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void notesGetByCompaniesByIdTest() {
        String id = null;
        // List<ActWebApiModelsNotesNote> response = api.notesGetByCompaniesById(id);

        // TODO: test validations
    }

    
    /**
     * Get all notes that are associated with a given contact and matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void notesGetByContactByIdTest() {
        String id = null;
        // List<ActWebApiModelsNotesNote> response = api.notesGetByContactById(id);

        // TODO: test validations
    }

    
    /**
     * Get all notes that are associated with a given group and matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void notesGetByGroupByIdTest() {
        String id = null;
        // List<ActWebApiModelsNotesNote> response = api.notesGetByGroupById(id);

        // TODO: test validations
    }

    
    /**
     * Get all notes matching an (optional) OData query and assoicated with a contact.
     *
     * 
     */
    @Test
    public void notesGetByIdTest() {
        String id = null;
        // ActWebApiModelsNotesNote response = api.notesGetById(id);

        // TODO: test validations
    }

    
    /**
     * Get all notes that are associated with a given opportunity and matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void notesGetByOpportunityByIdTest() {
        String id = null;
        // List<ActWebApiModelsNotesNote> response = api.notesGetByOpportunityById(id);

        // TODO: test validations
    }

    
    /**
     * Update an already existing note
     *
     * 
     */
    @Test
    public void notesPatchByIdTest() {
        String id = null;
        ActWebApiModelsNotesNote note = null;
        // ActWebApiModelsNotesNote response = api.notesPatchById(id, note);

        // TODO: test validations
    }

    
    /**
     * Create a new note.
     *
     * 
     */
    @Test
    public void notesPostTest() {
        ActWebApiModelsNotesNote note = null;
        // ActWebApiModelsNotesNote response = api.notesPost(note);

        // TODO: test validations
    }

    
    /**
     * Update an already existing note
     *
     * 
     */
    @Test
    public void notesPutByIdTest() {
        String id = null;
        ActWebApiModelsNotesNote note = null;
        // ActWebApiModelsNotesNote response = api.notesPutById(id, note);

        // TODO: test validations
    }

    
    /**
     * Associate the contact (if it is not already present) to a note.
     *
     * 
     */
    @Test
    public void notesPutContactInNoteByIdAndContactIdTest() {
        String id = null;
        String contactId = null;
        // ActWebApiModelsNotesNote response = api.notesPutContactInNoteByIdAndContactId(id, contactId);

        // TODO: test validations
    }

    
}
