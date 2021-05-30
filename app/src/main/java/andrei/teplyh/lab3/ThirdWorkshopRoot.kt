package andrei.teplyh.lab3

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class ThirdWorkshopRoot : Fragment() {

    private var clickListener: ClickListener? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_third_workshop_root, container, false)

        view?.findViewById<Button>(R.id.increaseValue)?.setOnClickListener {
            clickListener?.onIncreaseValueButtonClicked()
        }

        view?.findViewById<Button>(R.id.changeBackground)?.setOnClickListener {
            clickListener?.onChangeBackgroundButtonClicked()
        }

        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is ClickListener) {
            clickListener = context
        }
    }

    override fun onDetach() {
        super.onDetach()
        clickListener = null
    }

}