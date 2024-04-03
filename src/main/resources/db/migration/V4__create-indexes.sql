CREATE UNIQUE INDEX conferences_slug_key ON conferences(slug);
CREATE UNIQUE INDEX attendees_conference_id_email_key ON attendees(conference_id, email);
CREATE UNIQUE INDEX check_ins_attendee_id_key ON check_ins(attendee_id);