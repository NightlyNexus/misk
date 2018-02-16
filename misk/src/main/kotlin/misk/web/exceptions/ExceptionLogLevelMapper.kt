package misk.web.exceptions

import org.slf4j.event.Level

/**
 * Map<
 */
interface ExceptionLogLevelMapper<in T : Throwable> {

  /**
   * @return the level at which the given exception should be logged. defaults to ERROR but can
   * be overridden by the mapper for the given exception
   */
  fun loggingLevel(th: T): Level = Level.ERROR

}

