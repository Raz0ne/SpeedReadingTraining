package edu.application.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import edu.application.R
import edu.application.databinding.FragmentLessonReadingBinding

class LessonReadingFragment : Fragment() {

    private lateinit var binding: FragmentLessonReadingBinding

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = FragmentLessonReadingBinding.inflate(inflater, container, false)

        //Text reading
        findNavController(requireActivity(), R.id.nav_host_fragment)
            .navigate(R.id.action_lessonReadingFragment_to_lessonReadingTextFragment, arguments)

        return binding.root
    }
}