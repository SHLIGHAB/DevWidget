package com.tasomaniac.devwidget.main

import com.tasomaniac.devwidget.data.Widget
import com.tasomaniac.devwidget.widget.DisplayApplicationInfo

data class WidgetListData(val widget: Widget, val apps: List<DisplayApplicationInfo>)
