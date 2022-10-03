class Productos constructor(var id : Int, var nombre: String, var precio: Double, var desc : Int)

var totalCesta = 0.0

fun main(){
    var cesta = listOf(
        Productos(0,"Pasta de dientes", 50.00, 5),
        Productos(1,"Papel", 10.00,2),
        Productos(2,"Saritas", 18.00, 50)
    )

    cesta.map {
        println("${it.nombre}   $${it.precio}   desc: ${it.desc}")
        println("subtotal: ${aplicarDesc(cesta, it.id, {descuento(cesta[it.id])})}")
        println("total+IVA: $${iva(it.precio)}")
        println("--------------------------------------------------------------------------------------------")
    }
}

fun descuento(p : Productos) : Double{
    return (p.precio * (p.desc.toDouble().div(100)))
}

fun iva(precio: Double) : Double{
    return precio + (0.16 * precio)
}

fun aplicarDesc(cesta : List<Productos>,x: Int, desc : (Productos) -> Double) = desc(cesta[x])