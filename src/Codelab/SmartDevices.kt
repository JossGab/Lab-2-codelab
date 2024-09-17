package Codelab

open class DispositivoInteligente(val nombre: String, val categoria: String, val tipoDispositivo: String) {
    var estadoDispositivo: String = "apagado"
    var contadorEncendido: Int = 0

    fun imprimirInfoDispositivo() {
        println("Nombre del dispositivo: $nombre, categoría: $categoria, tipo: $tipoDispositivo")
    }

    fun encender() {
        if (estadoDispositivo == "apagado") {
            estadoDispositivo = "encendido"
            contadorEncendido++
        }
    }

    fun apagar() {
        estadoDispositivo = "apagado"
    }
}

class DispositivoTvInteligente(nombre: String, categoria: String, val volumenMaximo: Int, val canalMaximo: Int)
    : DispositivoInteligente(nombre, categoria, "TV") {

    var volumen: Int = volumenMaximo
    var canal: Int = canalMaximo

    fun disminuirVolumen() {
        if (estadoDispositivo == "encendido" && volumen > 0) {
            volumen--
            println("Volumen disminuido a $volumen")
        } else {
            println("La TV está apagada o el volumen ya está en el mínimo")
        }
    }

    fun canalAnterior() {
        if (estadoDispositivo == "encendido" && canal > 1) {
            canal--
            println("Canal cambiado a $canal")
        } else {
            println("La TV está apagada o ya está en el primer canal")
        }
    }
}

class DispositivoLuzInteligente(nombre: String, categoria: String, val brilloMaximo: Int)
    : DispositivoInteligente(nombre, categoria, "Luz") {

    var brillo: Int = brilloMaximo

    fun disminuirBrillo() {
        if (estadoDispositivo == "encendido" && brillo > 0) {
            brillo--
            println("Brillo disminuido a $brillo")
        } else {
            println("La luz está apagada o el brillo ya está en el mínimo")
        }
    }
}

class CasaInteligente(val tvInteligente: DispositivoTvInteligente, val luzInteligente: DispositivoLuzInteligente) {

    fun disminuirVolumenTv() {
        if (tvInteligente.estadoDispositivo == "encendido") {
            tvInteligente.disminuirVolumen()
        } else {
            println("La TV está apagada, no se puede disminuir el volumen")
        }
    }

    fun cambiarCanalTvAnterior() {
        if (tvInteligente.estadoDispositivo == "encendido") {
            tvInteligente.canalAnterior()
        } else {
            println("La TV está apagada, no se puede cambiar el canal")
        }
    }

    fun imprimirInfoTv() {
        tvInteligente.imprimirInfoDispositivo()
    }

    fun imprimirInfoLuz() {
        luzInteligente.imprimirInfoDispositivo()
    }

    fun disminuirBrilloLuz() {
        if (luzInteligente.estadoDispositivo == "encendido") {
            luzInteligente.disminuirBrillo()
        } else {
            println("La luz está apagada, no se puede disminuir el brillo")
        }
    }
}




