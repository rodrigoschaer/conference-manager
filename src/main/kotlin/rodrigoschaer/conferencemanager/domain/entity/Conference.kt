package rodrigoschaer.conferencemanager.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType.UUID
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "conferences")
data class Conference (
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = UUID)
    var id: String,

    @Column(nullable = false)
    var title: String,

    @Column(nullable = false)
    var detail: String,

    @Column(nullable = false, unique = true)
    var slug: String,

    @Column(nullable = false, name = "maximum_attendees")
    var maximumAttendees: Int
)