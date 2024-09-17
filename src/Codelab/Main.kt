package Codelab

fun main() {
    val tv = DispositivoTvInteligente("TV de la sala", "Entretenimiento", 50, 10)
    val luz = DispositivoLuzInteligente("Luz del dormitorio", "Iluminación", 100)

    val casaInteligente = CasaInteligente(tv, luz)

    tv.encender()
    luz.encender()

    casaInteligente.imprimirInfoTv()
    casaInteligente.imprimirInfoLuz()

    casaInteligente.disminuirVolumenTv()
    casaInteligente.cambiarCanalTvAnterior()

    casaInteligente.disminuirBrilloLuz()
}




    