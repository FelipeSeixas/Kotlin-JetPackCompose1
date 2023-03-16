XXXXXXXXXXXXXXXXXXXXXXXXX

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.constraintlayout.widget.ConstraintLayout

@Composable
fun Tracking(){
    Column() {

//        Data de criação
        Row() {
//            Image()
            Text(text = "Data de criação")

               Text(text = "Criado em: ") //Fixo
                                            Text(text = "DATA + HORA")
        }//        Criado em
        Row() {
//            Image()
            Text(text = "Programado") //Fixo

            Text(text = "DATA + HORA")
        //data class OrderTrackingStatus(
//            val message : String?,
//            val active : Boolean
        }
        Row() {
//            Image()
            Text(text = "XXXXXXXXXX") //Fixo
            Text(text = "YYYYYYYYYYYYYYY:")
                                            Text(text = "DATA + HORA")
        }
        Row() {
//            Image()
            Text(text = "TTTTTTTTTT")//Fixo
            Text(text = "EEEEEEEEEEEEEE:")
                                            Text(text = "DATA + HORA")
        }
        Row() {
//            Image()
            Text(text = "Previsão de entrega")//Fixo -> Pode variar para "Pedido entregue"
            Text(text = "VVVVVV:")
                                            Text(text = "PLACA")//Pode vir null/vazio

            Text(text = "TTTTTTTTTTTTT")
                                            Text(text = "DATA + HORA")
        }
//        Origem: API
//        val timeDelivery : String?,
//    val timeInfo : String?,
//    val message : String?,
        Row() {
            Text(text =
            "Lembrete" +
            "*Horário de brasília" +
            "Importante"
            )
        }
    }
}

