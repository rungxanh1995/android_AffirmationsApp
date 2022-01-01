package com.example.affirmations

import android.content.Context
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.model.Affirmation
import org.junit.Test

import org.junit.Assert.*
import org.mockito.Mockito.mock


class AffirmationsAdapterTests {
    private val context = mock(Context::class.java)

    @Test
    fun test_adapter_size() {
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )
        val adapter = ItemAdapter(context, data)

        assertEquals("Dataset size not correct", data.size, adapter.itemCount)
    }
}