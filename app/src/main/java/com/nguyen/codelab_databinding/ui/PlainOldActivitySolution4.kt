package com.nguyen.codelab_databinding.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.nguyen.codelab_databinding.R
import com.nguyen.codelab_databinding.data.SimpleViewModelSolution
import com.nguyen.codelab_databinding.databinding.PlainActivitySolution4Binding

/**
 * Fourth version of the Activity in the codelab.
 */
class PlainOldActivitySolution4 : AppCompatActivity() {

    // Obtain ViewModel from ViewModelProviders
    private val viewModel: SimpleViewModelSolution by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: PlainActivitySolution4Binding =
            DataBindingUtil.setContentView(this, R.layout.plain_activity_solution_4)

        binding.lifecycleOwner = this  // use Fragment.viewLifecycleOwner for fragments

        binding.viewmodel = viewModel
    }
}
