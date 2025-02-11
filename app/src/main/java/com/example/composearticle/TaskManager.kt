package com.example.composearticle

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TaskManager() {

    Manager(
        image = painterResource(id = R.drawable.ic_task_completed),
        taskText = stringResource(id = R.string.task),
        workTask = stringResource(id = R.string.Task)
    )
}

@Composable
private fun Manager(
    image: Painter,
    taskText: String,
    workTask: String
) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
                  .fillMaxWidth()
    ){
        Image(painter = image, contentDescription = null)
        Text(
            text = taskText,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = workTask,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Preview(){
    TaskManager()
}