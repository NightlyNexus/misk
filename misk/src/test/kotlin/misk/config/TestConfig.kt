package misk.config

import misk.web.WebConfig
import misk.web.exceptions.ErrorCodeLogLevelConfig
import java.time.Duration

data class TestConfig(
    val web: WebConfig,
    val consumer_a: ConsumerConfig,
    val consumer_b: ConsumerConfig,
    val duration: DurationConfig,
    val error_code_log_level: ErrorCodeLogLevelConfig
) : Config

data class ConsumerConfig(
    val min_items: Int = 0,
    val max_items: Int
) : Config

data class DurationConfig(val interval: Duration) : Config
