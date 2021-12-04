package io.github.pavleprica.kotlin.utils

import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.test.assertEquals

class BooleanUtilsTests {

    @Nested
    inner class WhenUsingIsNot {

        @ParameterizedTest(name = "When {0} should be opposite of {0}")
        @ValueSource(booleans = [ true, false ])
        fun `When using function should inverse value`(booleanValue: Boolean) {
            assertEquals(isNot(booleanValue), !booleanValue)
        }

        @ParameterizedTest(name = "When {0} should be opposite of {0}")
        @ValueSource(booleans = [ true, false ])
        fun `When using function accepting block should inverse value`(booleanValue: Boolean) {
            assertEquals(isNot { booleanValue }, !booleanValue)
        }

    }

}