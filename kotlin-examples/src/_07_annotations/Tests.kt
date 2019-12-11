package _07_annotations

import org.junit.Test as test
import org.junit.Assert.*

class Tests {
    @test
    fun simple() {
        assertEquals(4, 2 * 2)
    }
}
