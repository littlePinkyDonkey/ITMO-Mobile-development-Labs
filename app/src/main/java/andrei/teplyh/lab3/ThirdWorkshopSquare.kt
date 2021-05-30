package andrei.teplyh.lab3

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ThirdWorkshopSquare(): Fragment() {

    var number: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second_workshop_square, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView : TextView = view.findViewById(R.id.square) as TextView
        textView.setBackgroundColor(Color.RED)
        textView.text = this.number.toString()
    }

    fun increaseValue() {
        val textView : TextView = view?.findViewById(R.id.square) as TextView
        textView.text = (++number).toString()
    }

    fun changeColor(color: Int) {
        val textView : TextView = view?.findViewById(R.id.square) as TextView
        textView.setBackgroundColor(color)
    }

}