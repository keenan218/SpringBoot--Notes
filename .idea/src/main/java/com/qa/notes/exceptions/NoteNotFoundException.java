package com.qa.notes.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.EntityNotFoundException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "the note with this ID doesn't exist")
public class NoteNotFoundException extends EntityNotFoundException {

}
