package com.example.springbatch.job

import com.example.springbatch.domain.BookRepository
import org.springframework.batch.core.Job
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory
import org.springframework.batch.core.configuration.annotation.StepScope
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class CustomReaderJobConfig(
    val jobBuilderFactory: JobBuilderFactory,
    val stepBuilderFactory: StepBuilderFactory,
    val bookRepository: BookRepository
) {
    private final val CUSTOM_READER_JOB = "CUSTOM_READER_JOB"
    private final val CUSTOM_READER_JOB_STEP = CUSTOM_READER_JOB + "_STEP"
    private final val CHUNK_SIZE = 10
}