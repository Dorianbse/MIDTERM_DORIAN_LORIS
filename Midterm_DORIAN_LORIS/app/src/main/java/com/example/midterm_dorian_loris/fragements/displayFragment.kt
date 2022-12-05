package com.example.midterm_dorian_loris.fragements

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.midterm_dorian_loris.FormActivity
import com.example.midterm_dorian_loris.R
import com.example.midterm_dorian_loris.RVAdapter
import com.example.midterm_dorian_loris.RVDataAPIItem
import com.google.android.material.floatingactionbutton.FloatingActionButton

class displayFragment : Fragment() {
    private var list: MutableList<RVDataAPIItem> = mutableListOf<RVDataAPIItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_display, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<FloatingActionButton>(R.id.floatingActionButton).setOnClickListener {
            activity?.let{
                val intent = Intent (it, FormActivity::class.java)
                it.startActivity(intent)
            }
        }
        // Remplissage de la list
        list.add(RVDataAPIItem("1", 1, "1", 2))
        val rv = view.findViewById<RecyclerView>(R.id.recycleView)
        rv.layoutManager = LinearLayoutManager(view.context)
        rv.adapter = RVAdapter(list)
    }
}