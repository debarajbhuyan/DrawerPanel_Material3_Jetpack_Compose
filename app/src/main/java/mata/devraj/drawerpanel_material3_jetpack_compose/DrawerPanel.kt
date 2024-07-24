package mata.devraj.drawerpanel_material3_jetpack_compose



import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun DrawerPanel(drawerState: DrawerState, snackbarHostState: SnackbarHostState, scope: CoroutineScope) {
    Column(
        modifier = Modifier
            .fillMaxWidth(.5f)
            .background(Color.White)
    ) {
        List(10) {
            Text(
                text = "item #$it",
                modifier = Modifier
                    .padding(
                        horizontal = 20.dp,
                        vertical = 10.dp
                    )
            )
        }
        IconButton(onClick = {
            scope.launch {
                drawerState.close()
                snackbarHostState.showSnackbar(
                    message ="Drawer Closed",
                    duration = SnackbarDuration.Short
                )
            }
        }) {
            Icon(painter = painterResource(id = R.drawable.ic_exit), contentDescription = "Exit")
        }


    }
}