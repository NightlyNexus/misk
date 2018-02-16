package misk.web.exceptions

import misk.exceptions.NotFoundException
import misk.exceptions.ResourceUnavailableException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.slf4j.event.Level

internal class ActionExceptionMapperTest {

  @Test
  fun clientExceptionLoggingLevel() {
    val config = ErrorCodeLogLevelConfig(client_error_level = Level.INFO)
    val mapper = ActionExceptionMapper(config)
    assertThat(mapper.loggingLevel(NotFoundException()))
        .isEqualTo(Level.INFO)
  }

  @Test
  fun serverExceptionLoggingLevel() {
    val config = ErrorCodeLogLevelConfig(server_error_level = Level.INFO)
    val mapper = ActionExceptionMapper(config)
    assertThat(mapper.loggingLevel(ResourceUnavailableException()))
        .isEqualTo(Level.INFO)
  }

}
