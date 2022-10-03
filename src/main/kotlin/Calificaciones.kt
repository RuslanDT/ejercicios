import java.util.*

class Materias constructor(var nombre: String, var calificacion: Int, var nota : String?)

fun main(){
    var kardex = listOf(
        Materias("Movil", 98, null),
        Materias("Web", 88, null),
        Materias("Ecuaciones Dif.", 75, null),
        Materias("Ingles", 80, null),
        Materias("Pro. log.", 69, null)
    )

    var lista = notas(kardex)
    lista.map {
       println("-> ${it.nombre}: ${it.calificacion} (${it.nota})")
    }
}

fun notas(lista : List<Materias>) : List<Materias>{
    lista.map {
        it.nombre = it.nombre.uppercase()
        when(it.calificacion){
            in 95..100 -> it.nota = "Excelente"
            in 85..94 -> it.nota = "Notable"
            in 75..94 -> it.nota = "Bueno"
            in 70..74 -> it.nota = "Suficiente"
            else  -> it.nota = "Desempeño insuficiente"
        }
    }
    return lista
}


