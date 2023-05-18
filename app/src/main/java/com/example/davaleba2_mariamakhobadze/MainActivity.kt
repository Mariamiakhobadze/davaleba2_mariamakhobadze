import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button1.setOnClickListener {
            val firstName = editTextFirstName.text.toString()
            val lastName = editTextLastName.text.toString()
            val gpa = editTextGpa.text.toString()

            val bundle = Bundle().apply {
                putString("firstName", firstName)
                putString("lastName", lastName)
                putString("gpa", gpa)
            }

            findNavController().navigate(R.id.action_homeFragment_to_profileFragment, bundle)
        }

        button1.setOnLongClickListener {
            editTextFirstName.text.clear()
            editTextLastName.text.clear()
            editTextGpa.text.clear()
            true
        }

        button2.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_listFragment)
        }
    }
}
