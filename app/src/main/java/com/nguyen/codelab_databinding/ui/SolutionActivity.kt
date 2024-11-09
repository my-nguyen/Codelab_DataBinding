package com.nguyen.codelab_databinding.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.nguyen.codelab_databinding.R
import com.nguyen.codelab_databinding.data.SimpleViewModelSolution
import com.nguyen.codelab_databinding.databinding.SolutionBinding

/**
 * Final codelab solution.
 */
class SolutionActivity : AppCompatActivity() {

    // Obtain ViewModel from ViewModelProviders
    private val viewModel: SimpleViewModelSolution by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: SolutionBinding = DataBindingUtil.setContentView(this, R.layout.solution)

        binding.lifecycleOwner = this  // use Fragment.viewLifecycleOwner for fragments

        binding.viewmodel = viewModel
    }
}
