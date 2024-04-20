package com.vinicius.aulaactivity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Filme(
    val nome: String,
    val descricao: String,
    val avaliacoes: Double,
    val diretor: String,
    val distribuidor: String
) : Parcelable


/*
VERSÃO COM O SERIALIZABLE

import java.io.Serializable

    data class Filme(
    val nome: String,
    val descricao: String,
    val avaliacoes: Double,
    val diretor: String,
    val distribuidor: String
) : Serializable
 */
