package com.cmine

import com.cmine.lib.CMineLibLexer
import com.cmine.token.exception.InvalidTokenException
import gui.CompiladorUI  // Importe a classe CompiladorUI
import javax.swing.SwingUtilities

object CMine {
    @JvmStatic
    fun main(args: Array<String>) {
//        println("CMine")
//
//        // Inicia a GUI
//        SwingUtilities.invokeLater {
//            CompiladorUI().isVisible = true
//        }
        val lib = CMineLibLexer()
        println(lib.analyze("3 && 5;".trimIndent()))
    }
}