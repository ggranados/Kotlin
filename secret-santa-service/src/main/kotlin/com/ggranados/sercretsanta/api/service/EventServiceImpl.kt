package com.ggranados.sercretsanta.api.service

import com.ggranados.sercretsanta.api.repository.EventRepository
import com.ggranados.sercretsanta.api.model.Event
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service

@Service
class EventServiceImpl : GenericServiceImpl<Event, Long>(), EventService {

    @Autowired
    lateinit var eventRepository: EventRepository

    override val dao: CrudRepository<Event, Long>
        get() =  eventRepository
}