package mata.devraj.drawerpanel_material3_jetpack_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.DrawerState
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun TopAppBar(scope: CoroutineScope? = null, drawerState: DrawerState? =null) {
    Spacer(modifier = Modifier.height(20.dp))
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = {
            scope?.launch { drawerState?.open()}
        }) {
            Image(
                painter = painterResource(id = R.drawable.ic_hamburger_menu),
                contentDescription = "Menu Items",
                modifier = Modifier.size(24.dp))
        }
        Image(
            painter = painterResource(id = R.drawable.site_logo),
            contentDescription ="Site Logo",
            modifier = Modifier
                .fillMaxWidth(.5f)
                .padding(horizontal = 20.dp)
        )
        IconButton(onClick = { /*TODO*/ }) {
            Image(
                painter = painterResource(id = R.drawable.ic_cart),
                contentDescription = "Cart Items",
                modifier = Modifier.size(24.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopAppBarPreview() {
    TopAppBar()
}

