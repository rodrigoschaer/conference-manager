package rodrigoschaer.conferencemanager.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import rodrigoschaer.conferencemanager.domain.entity.Attendee

@Repository
interface AttendeeRepository : JpaRepository<Attendee, String> {
}