package ru.geo

import xitrum.Controller

trait DefaultLayout extends Controller {
  override def layout = renderViewNoLayout(classOf[DefaultLayout])
}
