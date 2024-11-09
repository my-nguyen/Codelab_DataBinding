package com.nguyen.codelab_databinding.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.nguyen.codelab_databinding.R
import com.nguyen.codelab_databinding.data.SimpleViewModelSolution
import com.nguyen.codelab_databinding.databinding.PlainActivitySolution5Binding

/**
 * Fifth version of the Activity in the codelab.
 */
class PlainOldActivitySolution5 : AppCompatActivity() {

    // Obtain ViewModel from ViewModelProviders
    private val viewModel: SimpleViewModelSolution by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: PlainActivitySolution5Binding =
            DataBindingUtil.setContentView(this, R.layout.plain_activity_solution_5)

        binding.lifecycleOwner = this  // use Fragment.viewLifecycleOwner for fragments

        binding.viewmodel = viewModel
    }
}
