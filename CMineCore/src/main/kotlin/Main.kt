package com.cmine

import gui.CompiladorUI  // Importe a classe CompiladorUI
import javax.swing.SwingUtilities

object CMine {
    @JvmStatic
    fun main(args: Array<String>) {
        println("CMine")

        // Inicia a GUI
        SwingUtilities.invokeLater {
            CompiladorUI().isVisible = true
        }
    }
}