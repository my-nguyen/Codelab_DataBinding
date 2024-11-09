package com.nguyen.codelab_databinding.ui

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.widget.ImageViewCompat
import androidx.databinding.DataBindingUtil
import com.nguyen.codelab_databinding.R
import com.nguyen.codelab_databinding.data.Popularity
import com.nguyen.codelab_databinding.data.SimpleViewModel
import com.nguyen.codelab_databinding.databinding.PlainActivityBinding

/**
 * Plain old activity with lots of problems to fix.
 */
class PlainOldActivity : AppCompatActivity() {

    private val viewModel: SimpleViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : PlainActivityBinding = DataBindingUtil.setContentView(this, R.layout.plain_activity)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this
    }
}
