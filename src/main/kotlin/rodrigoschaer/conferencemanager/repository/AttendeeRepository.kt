package rodrigoschaer.conferencemanager.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import rodrigoschaer.conferencemanager.repository.dbo.AttendeeDBO

@Repository
interface AttendeeRepository : JpaRepository<AttendeeDBO, String> {
}