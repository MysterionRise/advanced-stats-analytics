package org.mystic.fantazy.action

import xitrum.FutureAction
import xitrum.annotation.GET

@GET("/leagues")
class Leagues extends FutureAction{
  override def execute(): Unit = {
    respondDefault404Page()
  }
}
