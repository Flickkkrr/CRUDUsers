package com.flickkkrr.gestionusuarios.feature_users.presentation.edit.components

import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.*
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp

data class BaselineHeightModifier(
    val heightFromBaseline: Dp

): LayoutModifier{
    override fun MeasureScope.measure(
        measurable: Measurable,
        constraints: Constraints

    ): MeasureResult {
        val textPlaceable = measurable.measure(constraints)
        val firstBaseLine = textPlaceable[FirstBaseline]
        val lastBaseLine = textPlaceable[LastBaseline]

        val height = heightFromBaseline.roundToPx() + lastBaseLine - firstBaseLine
        return layout(constraints.maxWidth, height){
            val topY = heightFromBaseline.roundToPx() - firstBaseLine
            textPlaceable.place(0, topY)
        }

    }

}

fun Modifier.baseLineHeight(heightFromBaseline: Dp): Modifier =
    this.then(BaselineHeightModifier(heightFromBaseline))
