package mx.unam.fi.certificado

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mx.unam.fi.certificado.ui.theme.CertificadoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CertificadoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Certificate(5,"FI")
                }
            }
        }
    }
}

@Composable
fun Certificate(number: Int , course: String, modifier: Modifier = Modifier, ) {

    Row(

        modifier= modifier
            .padding(10.dp)
            .fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceAround,
    ){

        Image(painter=painterResource(id = R.drawable.unam),
            contentDescription=null,
            modifier = modifier
                .size(50.dp,50.dp),
        )
        Spacer(
            modifier=modifier,
        )
        Text(
            text = "Departamento de\nCertificación",
            fontSize = 15.sp,
            textAlign= TextAlign.Center,
        )
        Spacer(
            modifier=modifier,
        )
        Image(painter=painterResource(id = R.drawable.fi),
            contentDescription=null,
            modifier = modifier
                .size(50.dp,50.dp)
        )
    }
    Column(
        modifier= modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement= Arrangement.Center

    ){

        Text(
                text = "This certificate is presented to:",
                fontSize = 30.sp,
                textAlign= TextAlign.Center,
                modifier = modifier
                    .fillMaxWidth()
        )

        Box(
            contentAlignment = Alignment.Center,
            modifier=modifier
                .fillMaxWidth(),

        ){
            Image(painter=painterResource(id = R.drawable.degradado),
                contentDescription=null,
                alpha=0.3F,
                modifier = modifier
                    .fillMaxWidth(),
            )
            Text(
                text = "Sergio Andres\nVélez Gómez",
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 50.sp,
                textAlign= TextAlign.Center,
                modifier = modifier
                    .fillMaxWidth(),
            )

        }
        Text(
            text = "has completed a $number hours course on",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = modifier
                .fillMaxWidth()
        )
        Text(
            text = course,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .fillMaxWidth()
        )
        Spacer(
            modifier = modifier
                .height(50.dp)
        )
        Row(

            modifier= modifier
                .padding(10.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
        ){
            Column(
                verticalArrangement= Arrangement.Center
                ) {
                Image(
                    painter = painterResource(id = R.drawable.firma1),
                    contentDescription = null,
                    modifier = modifier
                        .fillMaxWidth(.5F)
                )

                Text(
                    text = "Juan Pérez",
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .fillMaxWidth(.5F)
                )
            }
            Column(
                verticalArrangement= Arrangement.Center
                ) {
                Image(
                    painter = painterResource(id = R.drawable.firma2),
                    contentDescription = null,
                    modifier = modifier
                        .fillMaxWidth()
                )
                Text(
                    text = "Pedro Bares",
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .fillMaxWidth()
                )
            }
        }


    }
}


@Preview(showBackground = true)
@Composable
fun Certificate() {
    CertificadoTheme {
        Certificate(10,"Kotlin")
    }
}