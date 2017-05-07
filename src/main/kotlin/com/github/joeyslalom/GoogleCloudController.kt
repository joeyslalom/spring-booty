package com.googlejobapp

import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * REST Controller for the Google App Engine Custom Runtime
 *
 * Implement the endpoints required by the Google Cloud for lifecycle events.
 *
 * https://cloud.google.com/appengine/docs/flexible/custom-runtimes/build
 *
 */
@RestController
class GoogleCloudController {
    private val LOG = LoggerFactory.getLogger(javaClass)

    @GetMapping("/_ah/start")
    fun startRequest(): ResponseEntity<Nothing> {
        LOG.info("startRequest: ready to respond to incoming traffic")

        return ResponseEntity.noContent().build<Nothing>()
    }

    @GetMapping("/_ah/stop")
    fun stopRequest(): ResponseEntity<Nothing> {
        LOG.info("stopRequest: about to shut down")

        return ResponseEntity.noContent().build<Nothing>()
    }

    @GetMapping("/_ah/health")
    fun health(): ResponseEntity<String> = ResponseEntity.ok("poke.")
}