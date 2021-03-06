package com.github.joeyslalom.linedef

import java.util.*

/**
 * Jackson requires a no-argument constructor, so all fields are vars with default arguments
 */
data class LineDef(
        var topGuidId: String = "",
        var subGuidId: String = "",
        var gdsId: String = "",
        var fields: List<LineDefFields> = Collections.emptyList()
)

data class LineDefFields(
        var sourceId: String = "",
        var topGuid: String = "",
        var subGuid: String = "",
        var travelerType: String = "",
        var airfareReasonCode: String = "",
        var lowestFare: String = "",
        var costCenter: String = "",
        var travelReason: String = "",
        var hotelReasonCode: String = "",
        var carReasonCode: String = "",
        var authorizerEmail: String = "",
        var authorizerEmails1x: List<String> = Collections.emptyList(),
        var authorizerEmails2x: List<String> = Collections.emptyList(),
        var authorizerEmails3x: List<String> = Collections.emptyList(),
        var travelerEmail: String = "",
        var arrangerEmail: String = ""
)