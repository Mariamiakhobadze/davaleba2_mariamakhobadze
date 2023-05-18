import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val firstName = arguments?.getString("firstName")
        val lastName = arguments?.getString("lastName")
        val gpa = arguments?.getString("gpa")

        textViewFirstName.text = "First Name: $firstName"
        textViewLastName.text = "Last Name: $lastName"
        textViewGpa.text = "GPA: $gpa"

        buttonEditProfile.setOnClickListener {
        }
    }
}
