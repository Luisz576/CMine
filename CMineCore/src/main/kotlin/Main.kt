package com.cmine

import com.cmine.lib.CMineLib
import com.cmine.token.exception.InvalidTokenException
import gui.CompiladorUI  // Importe a classe CompiladorUI
import javax.swing.SwingUtilities

object CMine {
    @JvmStatic
    fun main(args: Array<String>) {
        //println("CMine")

        // Inicia a GUI
        SwingUtilities.invokeLater {
            CompiladorUI().isVisible = true
        }

//        val lib = CMineLib()
//
//        val sifrao = "$"
//        val tree = lib.analyze("""
//        IFSULDEMINAS
//
//        journey(enemiesToSpawn > 0){
//            ${sifrao}spawnEnemy();
//            enemiesToSpawn --;
//            ++enemiesToSpawn;
//        }
//
//        quest ${sifrao}func(coin a){
//            check (velocity > 50) {
//                loot a + 2;
//            }
//            loot;
//        }
//
//        +;
//
//        task (i = i + 1; i < 5;) {
//            velocity = velocity * 2;
//        }
//        coin i = 10;
//        task (coin i = 10; i < 5; i = i + 1) {
//            velocity = velocity * 2;
//        }
//
//        ${sifrao}func(20);
//
//        MUZ
//        """.trimIndent())
    }
}