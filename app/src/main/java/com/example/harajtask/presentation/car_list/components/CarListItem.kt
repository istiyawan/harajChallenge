package com.example.harajtask.presentation.car_list.components


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.harajtask.domain.model.Haraj


@Composable
fun CarListItem(
    car: Haraj,
    onItemClick: (Haraj) -> Unit
){
   Row(
       modifier = Modifier
           .fillMaxWidth()
           .clickable { onItemClick(car) }
           .padding(20.dp),
       horizontalArrangement = Arrangement.SpaceBetween
   ){
        Text(
            text = "${car.title}.${car.username} (${car.city})",
            style = MaterialTheme.typography.body1,
            overflow = TextOverflow.Ellipsis
        )
    }
}