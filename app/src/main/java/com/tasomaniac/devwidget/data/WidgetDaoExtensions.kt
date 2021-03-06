package com.tasomaniac.devwidget.data

import io.reactivex.Completable

fun WidgetDao.insertWidget(widget: Widget) =
    Completable.fromAction {
        insertWidgetSync(widget)
    }

fun WidgetDao.updateWidget(widget: Widget) =
    Completable.fromAction {
        updateWidgetSync(widget)
    }

fun WidgetDao.updateTempWidgetId(appWidgetId: Int) =
    Completable.fromAction {
        updateTempWidgetIdSync(appWidgetId)
    }

fun WidgetDao.deleteWidgets(widgets: List<Widget>) =
    Completable.fromAction {
        deleteWidgetsSync(widgets)
    }
