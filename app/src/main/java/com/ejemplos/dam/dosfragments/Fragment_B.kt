package com.ejemplos.dam.dosfragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main.*
import org.jetbrains.anko.support.v4.toast
/**
 * Created by Guille on 02/02/2018.
 */
class Fragment_B : Fragment() {

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
}

override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                          savedInstanceState: Bundle?): View? {
    return inflater?.inflate(R.layout.fragment_b, container)
}

/**
 * Una vez cargado el layout podemos utilizar sus elementos
 */
override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
}
}
