package org.enterpris2.rest.exception

class UserInputValidationException(
        message: String,
        val httpCode : Int = 400
) : RuntimeException(message)