package com.example.mockitokotlinerror

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

class MyServiceTest {
    private val mockRepository = mock<MyRepository>()
    private val service = MyService(mockRepository)

    @Test
    fun `check returns true if there is data`() {
        whenever(mockRepository.getData()) doReturn listOf("hello")
        assertTrue(service.checkSomething())
    }

    @Test
    fun `check returns false if there is no data`() {
        whenever(mockRepository.getData()) doReturn emptyList()
        assertFalse(service.checkSomething())
    }
}
