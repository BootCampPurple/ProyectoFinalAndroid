package pe.com.bootcamp.fragment_nav.bottomNavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bcp.bank.proyectofinal.databinding.FragmentOpercionFrecuenteBcpBinding

class OperacionFrecuenteBCPFragment : Fragment() {


    private var _binding: FragmentOpercionFrecuenteBcpBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentOpercionFrecuenteBcpBinding.inflate(inflater, container, false)

        // Inflate the layout for this fragment
        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
