package com.example.lab4.models

import android.os.Parcelable
import androidx.annotation.DrawableRes
import com.example.lab4.R
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize data class Android(val title: String,
                              @DrawableRes val logo: Int,
                              val releaseDate: Calendar) : Parcelable

val ANDROID_VERSIONS = listOf(
        Android("Afanas",
                R.drawable.afanas,
                Calendar.Builder().setDate(2008, 9, 23).build()
        ),
        Android("God",
                R.drawable.god,
                Calendar.Builder().setDate(2009, 9, 15).build()
        ),
        Android("Good Job",
                R.drawable.good_job,
                Calendar.Builder().setDate(2009, 10, 26).build()
        ),
        Android("Kamil",
                R.drawable.kamil,
                Calendar.Builder().setDate(2010, 5, 20).build()
        ),
        Android("Cyborg Killer",
                R.drawable.kiborg_ubica,
                Calendar.Builder().setDate(2010, 12, 6).build()
        ),
        Android("Klimenkov",
                R.drawable.klimenkov,
                Calendar.Builder().setDate(2011, 2, 22).build()
        ),
        Android("Letov",
                R.drawable.letov,
                Calendar.Builder().setDate(2012, 7, 9).build()
        ),
        Android("Motroskin",
                R.drawable.motroskin,
                Calendar.Builder().setDate(2013, 10, 31).build())
        ,
        Android("Operating Systems",
                R.drawable.osi,
                Calendar.Builder().setDate(2014, 11, 12).build()
        ),
        Android("Pchelkin",
                R.drawable.pchelkin,
                Calendar.Builder().setDate(2015, 10, 5).build()
        ),
        Android("Pismak",
                R.drawable.pismak,
                Calendar.Builder().setDate(2016, 8, 22).build()
        ),
        Android("Serega",
                R.drawable.serega,
                Calendar.Builder().setDate(2017, 8, 21).build()
        ),
        Android("Sergei",
                R.drawable.sergei,
                Calendar.Builder().setDate(2018, 8, 6).build()
        ),
        Android("Tsopa",
                R.drawable.tsopa,
                Calendar.Builder().setDate(2019, 9, 3).build()
        ),
        Android("What did you do",
                R.drawable.wtf,
                Calendar.Builder().setDate(2020, 9, 8).build()
        )
)