package rodrigoschaer.conferencemanager.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/attendees")
class AttendeeController {
    @GetMapping("/health")
    fun getHealth(): ResponseEntity<String> {
        return ResponseEntity.ok("Connected to attendees endpoint successfully!")
    }
}