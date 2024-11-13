package com.nazwa.viewdata

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.nazwa.viewdata.databinding.ActivityListViewBinding

class ListViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get the array of strings from resources and sort it
        val dataArray: Array<String> = resources.getStringArray(R.array.jurusan)
        dataArray.sort()

        // Set up the adapter for the ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, dataArray)
        binding.listView.adapter = adapter
    }
}
