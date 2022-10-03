import java.lang.Math.sqrt
import kotlin.math.pow

fun main(){
    val vector = Pair(54.0, 99.1)
    println("El promedio es: ${prom(vector)}")
}

fun prom(v: Pair<Double, Double>) = sqrt(v.first.pow(2.0) + v.second.pow(2.0))